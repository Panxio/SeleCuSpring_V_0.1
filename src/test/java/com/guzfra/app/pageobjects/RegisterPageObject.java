package com.guzfra.app.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class RegisterPageObject {

   @Autowired
    public RegisterPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Primero realizo el mapeo de lo objetos que se encuentran en la página Web
    @FindBy(xpath = "//*[@id='gender-male']")
    private WebElement genderMaleRdBtn;
    @FindBy(xpath = "//*[@id='gender-female']")
    private WebElement genderFemaleRdBtn;
    @FindBy(id = "FirstName")
    private WebElement firstNameTxtBox;
    @FindBy(xpath = "//*[@name='LastName']")
    private WebElement lastNameTxtBox;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    private WebElement dateOfBirthDay;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    private WebElement dateOfBirthMonth;
    @FindBy(xpath = "//*[@name='DateOfBirthYear']")
    private WebElement dateOfBirthYear;
    @FindBy(id = "Email")
    private WebElement email;
    @FindBy(id = "Newsletter")
    private WebElement newletter;
    @FindBy(id = "Password")
    private WebElement password;
    @FindBy(id = "ConfirmPassword")
    private WebElement confirmPassword;
    @FindBy(id = "register-button")
    private WebElement registerBtn;

}
