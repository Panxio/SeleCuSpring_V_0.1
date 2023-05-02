package com.guzfra.app.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterServices {

    //Importo la clase pageObject y lo instancio para poder traer los datos a los servicios.
    @Autowired
    private RegisterPageObject registerPageObject;
    private WebDriver driver;

    @Autowired
    public RegisterServices(WebDriver driver){
        this.driver = driver;
    }

    //Genero los servicios o metodos que están relacionados con los objetos de la página y sus respectiva funcionalidad
    public void go (String url){
        this.driver.get(url);
        this.driver.manage().window().maximize();
    }//--> metodo que resibira una url
    public void selectMale() {
        this.registerPageObject.getGenderMaleRdBtn().click();
    }

    public void selectFemale(){
        this.registerPageObject.getGenderFemaleRdBtn().click();
    }

    public void writeFirstName(String Firstname){
        this.registerPageObject.getFirstNameTxtBox().sendKeys(Firstname);
    }

    public  void writeLastName (String LastName){
        this.registerPageObject.getLastNameTxtBox().sendKeys(LastName);
    }
    public void selectBirthDay (String day){
        new Select(this.registerPageObject.getDateOfBirthDay()).selectByValue(day);
    }
    public void selectBirthMonth(String month){
        new Select(this.registerPageObject.getDateOfBirthMonth()).selectByValue(month);
    }
    public void selectBirthYear(String year){
        new Select(this.registerPageObject.getDateOfBirthYear()).selectByValue(year);
    }
    public void writeEmail (String email) {
        this.registerPageObject.getEmail().sendKeys(email);
    }
    public void uncheckNewsletter (){
        this.registerPageObject.getNewletter().click();
    }
    public void setPassword (String pass){
        this.registerPageObject.getPassword().sendKeys(pass);
    }
    public void setConfirmPassword(String confirmPass){
        this.registerPageObject.getConfirmPassword().sendKeys(confirmPass);
    }
    public void setRegisterBtn(){
        this.registerPageObject.getRegisterBtn().click();
    }
 }
