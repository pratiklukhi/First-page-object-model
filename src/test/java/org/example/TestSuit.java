package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage= new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();
    NewsCommentsPage newsCommentsPage = new NewsCommentsPage();
    NewReleaseComment newReleaseComment = new NewReleaseComment();
    NewCommentResultPage newCommentResultPage = new NewCommentResultPage();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    NavigateDesktopPage navigateDesktopPage = new NavigateDesktopPage();
    AppleMacBookProPage appleMacBookProPage = new AppleMacBookProPage();
    EmailAFriend emailAFriend = new EmailAFriend();
    EmailAFriendResult emailAFriendResult = new EmailAFriendResult();

    @Test
    public void userToBeAbleToRegistrationSuccessfully(){
        homePage.clickOnRegisterButton();
        registrationPage.enterRegistrationDetails();
        registrationSuccessPage.registrationResult();
    }

    @Test
    public void UserShouldBeAbleToAddNewComment() {
        homePage.clickOnDetailsButton();
        newsCommentsPage.newComment();
        newReleaseComment.newsCommentAdd();
        newCommentResultPage.newComment();
    }

    @Test
    public void UserShouldBeAbleToNavigateDesktopPage(){
        homePage.clickOnComputers();
        computersPage.computer();
        desktopPage.desktop();
        navigateDesktopPage.navigateDesktop();
    }

    @Test
    public void RegisteredUserShouldBeReferProductToFriend(){
        userToBeAbleToRegistrationSuccessfully();
        registrationSuccessPage.clickOnContinueOnRegistrationSuccessful();
        homePage.clickOnAppleMacBookPro();
        appleMacBookProPage.emailAFriend();
        emailAFriend.emailAFriend1();
        emailAFriendResult.messageSent();

    }
}
