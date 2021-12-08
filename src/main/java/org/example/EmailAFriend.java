package org.example;

import org.openqa.selenium.By;

public class EmailAFriend extends AppleMacBookProPage{
By _friendEmail = By.id("FriendEmail");
By _personalMessage = By.id("PersonalMessage");
By _sendEmail = By.xpath("//button[@class='button-1 send-email-a-friend-button']");
    public void emailAFriend1(){
        // Type Friend's Email
        typeText(_friendEmail, "prpatel19@gmail.com");

        // Type Personal message
        typeText(_personalMessage, "This is an amazing product.");

        // Click on button of Send Email
        clickOnElement(_sendEmail);

    }
}
