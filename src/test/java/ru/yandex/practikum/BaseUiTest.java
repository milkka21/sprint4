package ru.yandex.practikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public abstract class BaseUiTest {
   protected WebDriver webDriver;
          @Before
          public void setup() {
              webDriver = new ChromeDriver();
              WebDriverManager.chromedriver().setup();
              ChromeOptions options = new ChromeOptions();
              options.addArguments("--start-maximized");
              options.addArguments("--remote-allow-origins=*");
              System.setProperty("webdriver.chrome.driver", "/Users/milkka/Downloads/chromedriver-mac-arm64/chromedriver");
              webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
              webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
              webDriver.get("https://qa-scooter.praktikum-services.ru/");
      }

    @After
    public void tearDown() {
        webDriver.close();
        webDriver.quit();
    }

}