package com.herokuapp.internet.the.pages;



import com.herokuapp.internet.the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {


    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");
    By secureArea = By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");
    By ErrorMessage =By.id("flash");



    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public String getSecureAreaMessage(){
        return getTextFromElement(secureArea);
    }


    public void enterUsername(String username){
        sendTextToElement(usernameField,username);
    }

    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickLoginButton(){
        clickOnElement(loginButton);
    }


    public String getErrorMessage (){
        return getTextFromElement(ErrorMessage);
    }


}
