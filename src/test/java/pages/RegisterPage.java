package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    // Using the IDs from your HTML snippet
    By emailInput = By.id("email");
    By passwordInput = By.id("password");
    By confirmPasswordInput = By.id("confirmPassword");
    By registerButton = By.cssSelector("button[type='submit']");
    By messageLabel = By.cssSelector(".message");  // Adjust this if your app shows messages somewhere else

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).clear();
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordInput).clear();
        driver.findElement(confirmPasswordInput).sendKeys(confirmPassword);
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }

    public String getMessage() {
        try {
            return driver.findElement(messageLabel).getText();
        } catch (Exception e) {
            return "";
        }
    }
}
