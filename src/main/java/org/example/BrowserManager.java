package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage {

    public void openBrowser(){
        // Open Browser
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }

    public void closeBrowser(){
        driver.close();
    }

}
