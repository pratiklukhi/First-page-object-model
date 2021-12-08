package org.example;

import org.openqa.selenium.By;

public class NewsCommentsPage extends HomePage {
    By _addNewComment = By.id("AddNewComment_CommentTitle");
    By _addNewCommentText = By.id("AddNewComment_CommentText");
    By _clickOnNewCommentButton = By.xpath("//button[@name='add-comment']");

    public void newComment() {

        typeText(_addNewComment, "Nice Product");

        // Type comment
        typeText(_addNewCommentText, "This is an amazing product. I like this most.");

        // Click on button of New comment
        clickOnElement(_clickOnNewCommentButton);
    }
}