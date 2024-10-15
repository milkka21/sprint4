package ru.yandex.practikum;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class OrderMainTest extends BaseUiTest{
    @Test
    public void orderNotFoundShouldBeDisplayed() {
        webDriver.findElement(By.className("Header_Link__1TAG7")).click();
        webDriver.findElement(By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")).sendKeys("123");
        webDriver.findElement(By.xpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']")).click();
        boolean isDisplayed = webDriver.findElement(By.cssSelector(".Track_NotFound__6oaoY")).isDisplayed();
        Assert.assertTrue("Order not found image is not displayed", isDisplayed);
    }
    @Test
    public void orderNotFoundShouldBeDisplayedPOM() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOrderStatusButton();
        mainPage.enterOrderNumber("123");
        mainPage.clickOrderButton();
        OrderStatusPage orderStatusPage = new OrderStatusPage(webDriver);
        boolean isDisplayed = orderStatusPage.orderNotFoundIsDisplayed();
        Assert.assertTrue("Order not found image is not displayed", isDisplayed);
    }
}