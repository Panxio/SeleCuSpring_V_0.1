package com.guzfra.app.stepdenitions;

import com.guzfra.app.conf.DriverConfig;
import com.guzfra.app.pageobjects.RegisterServices;
import com.guzfra.app.util.RandomEmailGenerator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@ContextConfiguration(classes = {DriverConfig.class})

@CucumberContextConfiguration
@SpringBootTest(classes = {DriverConfig.class})

public class RegisterStepDefs {
    @Autowired
    private RegisterServices registerServices;

    @Given("^Shofy wants to have an account$")
    public void shofy_wants_to_have_an_account() throws InterruptedException {

        String email = RandomEmailGenerator.generate();

        registerServices.go("https://demo.nopcommerce.com/register");
        registerServices.selectMale();
        registerServices.writeFirstName("Shofy");
        registerServices.writeLastName("Guzman");
        registerServices.selectBirthDay("27");
        registerServices.selectBirthMonth("2");
        registerServices.selectBirthYear("2022");
        registerServices.writeEmail(email);
        registerServices.uncheckNewsletter();
        registerServices.setPassword("123456");
        registerServices.setConfirmPassword("654321");

        registerServices.setRegisterBtn();

        Thread.sleep(7000);

    }
    @When("^She sends required information to get the account$")
    public void she_sends_required_information_to_get_the_account() {

    }
    @Then("^she sould be told that the account was created$")
    public void she_sould_be_told_that_the_account_was_created() {

    }
}
