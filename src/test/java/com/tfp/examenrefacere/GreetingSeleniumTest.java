package com.tfp.examenrefacere;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class GreetingSeleniumTest {

    private static WebDriver chromeDriver;

    @BeforeAll
    public static void init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


        chromeDriver = new ChromeDriver(options);
    }

    @Test
    public void submitData() throws InterruptedException {
        chromeDriver.get("http://localhost:3000/");
        GreetingPageFactory pageFactory = PageFactory.initElements(chromeDriver, GreetingPageFactory.class);


        pageFactory.getGreetingID().sendKeys("10");
        pageFactory.getDescription().sendKeys("Test 10 - Selenium Test");
        pageFactory.getPrice().sendKeys("23");
        pageFactory.getTypeID().sendKeys("1");
        pageFactory.getCategoryID().sendKeys("1");

        pageFactory.getSubmit().click();

        Thread.sleep(100);

        Assertions.assertEquals("Greeting was added!", pageFactory.getSuccessMessage().getText());
    }


}
