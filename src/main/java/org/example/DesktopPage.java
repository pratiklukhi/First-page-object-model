package org.example;

import org.openqa.selenium.By;

public class DesktopPage extends ComputersPage{
    By _desktop=By.xpath("//h2/a[@href='/desktops']");

   // Click on Desktop
    public void desktop(){
        clickOnElement(_desktop);
    }
}
