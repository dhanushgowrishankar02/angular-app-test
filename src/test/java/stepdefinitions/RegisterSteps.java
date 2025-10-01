package stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterSteps {

    WebDriver driver;
    RegisterPage registerPage;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        registerPage = new RegisterPage(driver);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("I am on the register page")
    public void i_am_on_the_register_page() {
        driver.get("http://localhost:4200/register");  // change if needed
    }

    @When("I enter email {string}, password {string} and confirm password {string}")
    public void i_enter_email_password_and_confirm_password(String email, String password, String confirmPassword) {
        registerPage.enterEmail(email);
        registerPage.enterPassword(password);
        registerPage.enterConfirmPassword(confirmPassword);
    }


    @And("I click on the register button")
    public void i_click_on_the_register_button() {
        registerPage.clickRegister();
    }

    @Then("I should see the registration message {string}")
    public void i_should_see_the_registration_message(String message) {
        // implementation
    }

}
