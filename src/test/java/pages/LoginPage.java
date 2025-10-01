package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By usernameInput = By.id("email");
    By passwordInput = By.id("password");
    By loginButton = By.cssSelector("button[type='submit']");
    By errorMessage = By.cssSelector(".error");  // Adjust if your app uses a different selector

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        try {
            return driver.findElement(errorMessage).getText();
        } catch (Exception e) {
            return "";
        }
    }

    public boolean isOnDashboard() {
        // Check if current URL is exactly "http://localhost:4200/"
        return driver.getCurrentUrl().equals("http://localhost:4200/");
    }

}
