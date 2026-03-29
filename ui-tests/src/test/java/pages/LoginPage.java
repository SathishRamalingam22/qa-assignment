package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@type='submit']");
    By errorMsg = By.xpath("//p[contains(@class,'alert-content-text')]");

    public void login(String user, String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }

    public String getErrorMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg)).getText();
    }
}
