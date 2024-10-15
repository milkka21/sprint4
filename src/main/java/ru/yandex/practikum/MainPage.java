package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage extends BasePage {
    private  By orderStatusButton = By.className("Header_Link__1TAG7");
    private  By orderNumberField = By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");
    private  By goButton = By.xpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']");

    static String headingPath = "accordion__heading-";
    static String panelPath = "accordion__panel-";
    private  By firstQuestion = By.id("accordion__heading-0");

    public By generateHeaderPath(int number) {
        return By.id(headingPath + number);
    }

    public By generatePanelPath(int number) {
        return By.id(panelPath + number);
    }

    public String checkLogo(String logo) {
        return webDriver.findElement(By.xpath(".//img[@alt='" + logo + "']/parent::a")).getAttribute("href");
    }

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }
    //вынесла методы для локаторов
    public void clickOrderStatusButton() {
        webDriver.findElement(orderStatusButton).click();
    }
    public void enterOrderNumber(String text) {
        webDriver.findElement(orderNumberField).sendKeys(text);
    }

    public void clickOrderButton() {
        webDriver.findElement(goButton).click();
    }

    public void scrollToFaq() {
        WebElement element = webDriver.findElement(firstQuestion);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }
}