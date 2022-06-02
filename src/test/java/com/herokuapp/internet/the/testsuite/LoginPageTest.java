package com.herokuapp.internet.the.testsuite;


import com.herokuapp.internet.the.pages.LoginPage;
import com.herokuapp.internet.the.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();


@Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

        loginPage.enterUsername("tomsmith");

        loginPage.enterPasswordField("SuperSecretPassword!");

        loginPage.clickLoginButton();

    // Verify the text “Secure Area”
        String expectedMessage = "Secure Area";
        String actualMessage= loginPage.getSecureAreaMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
        System.out.println("The changes has been done by Purvi");

    }


@Test
    public void verifyTheUsernameErrorMessage() {

        //locate and Enter “tomsmith1” username
        loginPage.enterUsername("tomsmith1");

        //locate and Enter “SuperSecretPassword!” password
        loginPage.enterPasswordField("SuperSecretPassword!");


        //Click on ‘LOGIN’ button
        loginPage.clickLoginButton();
        clickOnElement(By.xpath("//i[contains(text(),'Login')]"));

        // Verify the error message “Your username is invalid!”


        String expectedMessage = "Your username is invalid!\n" +
                "×";
        String actualMessage= loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage);



    }


@Test
    public void verifyThePasswordErrorMessage()  {

        //locate and Enter “tomsmith” username
        loginPage.enterUsername("tomsmith");


        //locate and Enter “SuperSecretPassword” password
        loginPage.enterPasswordField("SuperSecretPassword");

        //Click on ‘LOGIN’ button
        loginPage.clickLoginButton();

        //verifyExpectedAndActual(By.id("flash"), "Your password is invalid!");
        String expectedMessage = "Your password is invalid!\n" +
                "×";
        String actualMessage= loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage);



    }





}
