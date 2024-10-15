package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPage extends BasePage{
    private  By notFoundImage = By.cssSelector(".Track_NotFound__6oaoY");
    public OrderStatusPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean orderNotFoundIsDisplayed() {
        return webDriver.findElement(notFoundImage).isDisplayed();
    }


}