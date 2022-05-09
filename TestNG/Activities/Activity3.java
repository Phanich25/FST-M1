package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Activity3 {
    WebDriver driver;
    @BeforeClass
    void openBrowser()
    {
        //create new instance of the firefox driver.
        driver = new FirefoxDriver();
        //Navigate to the webpage.
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @Test
    void loginTest()
    {
        //Find the username field.
        WebElement userName = driver.findElement(By.cssSelector("#username"));
        //Enter the username.
        userName.sendKeys("admin");
        //Find the password field.
        WebElement passWord = driver.findElement(By.cssSelector("#password"));
        //Enter the password.
        passWord.sendKeys("password");
        //Find the login button.
        WebElement loginButton = driver.findElement(By.cssSelector("button.ui:nth-child(4)"));
        //Click on the login button.
        loginButton.click();
        //Find the confirmation message.
        WebElement confirmationMessage = driver.findElement(By.cssSelector("#action-confirmation"));
        //Validate the confirmation message.
        Assert.assertEquals(confirmationMessage.getText(),"Welcome Back, admin");
    }
    @AfterClass
    void closeBrowser()
    {
        //Close the browser.
        driver.quit();
    }
}
