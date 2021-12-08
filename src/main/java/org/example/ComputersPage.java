package org.example;

import org.openqa.selenium.By;

public class ComputersPage extends HomePage{
By _computers=By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a[@href='/computers']");

// Click on Computers
    public void computer(){
        clickOnElement(_computers);
    }
}
