package ru.yandex.practikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;



@RunWith(Parameterized.class)
public class TestCheckHref extends BaseUiTest{

    private final String expected;
    private final String nameLogo;

    public TestCheckHref(String expected, String nameLogo) {
        this.expected = expected;
        this.nameLogo = nameLogo;
    }

    @Parameterized.Parameters
    public static Object[][] getQuest() {
        return new Object[][]{
                {"https://yandex.ru/", "Yandex"},
                {"https://qa-scooter.praktikum-services.ru/", "Scooter"}
        };
    }

    @Test
    public void checkHref() {
        MainPage mainPage = new MainPage(webDriver);

        assertEquals("Ссылка не корректная", expected, mainPage.checkLogo(nameLogo));
    }
}
