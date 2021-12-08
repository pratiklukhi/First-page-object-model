package org.example;

import org.openqa.selenium.By;

public class NewReleaseComment extends Utils {
    By _addNewCommentTitle = By.id("AddNewComment_CommentTitle");
    By _addNewCommentText = By.id("AddNewComment_CommentText");
    By _newComment = By.xpath("//button[@name='add-comment']");

    public void newsCommentAdd() {

        // Type title
        typeText(_addNewCommentTitle, "Nice Product");

        // Type comment
        typeText(_addNewCommentText, "This is an amazing product. I like this most.");

        // Click on button of New comment
        clickOnElement(_newComment);
    }
}