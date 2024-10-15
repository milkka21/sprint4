package ru.yandex.practikum;
import org.junit.Assert;
import org.junit.Test;


public class OrderTest extends BaseUiTest {

    @Test
    public void textOrder (){
        Order order = new Order(webDriver);
        order.clickOrderButton();
        order.enterName("Олег");
        order.enterSurname("Ломоносов");
        order.enterAddress("Ломоносовский проспек 11");
        order.clickStation();
        order.clickStationBulvar();
        order.enterNumber("89999999999");
        order.clickNextButton ();
        order.clickDayOrder ("18.10.2024");
        order.clickEmptySpace();
        order.clickArenda();
        order.clickArendaTwoDay();
        order.clickColorBlack();
        order.enterCourier("ваба лабба даб");
        order.clickButtonOrderOne();
        order.clickYesButton();
        boolean isDisplayed = order.displayButtonViev();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
        order.clickButtonViewOrder();


    }

    @Test
    public void textOrderTwo (){
        Order order = new Order(webDriver);
        order.scrollToMiddleButton();
        order.clickOrderButtonMiddle();
        order.enterName("Канье");
        order.enterSurname("Уэст");
        order.enterAddress("Ленинский проспек 11");
        order.clickStation();
        order.clickStationSokolniki();
        order.enterNumber("89999999978");
        order.clickNextButton ();
        order.clickDayOrder("25.10.2024");
        order.clickEmptySpace();
        order.clickArenda();
        order.clickArendahreeDay();
        order.clickColorGray();
        order.enterCourier("бла бла бла");
        order.clickButtonOrderOne();
        order.clickYesButton();
        boolean isDisplayed = order.displayButtonViev();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
        order.clickButtonViewOrder();


    }
    @Test
    public void CheckOrder () {
        Order order = new Order(webDriver);
        order.clickOrderButton();

        order.enterName("dfkdfj");
        order.clickEmptySpace();
        boolean isName = order.ErrorNameText();
        Assert.assertTrue("ошибочка", isName );



    }
}