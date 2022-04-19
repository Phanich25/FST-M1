package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args){
        //Get an instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Navigate to  https://training-support.net/selenium/dynamic-attributes
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        //Get the title of the page.
        String pageTitle = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the navigated page is : " + pageTitle);
        //Find the username field.
        WebElement userName = driver.findElement(By.xpath("//input[contains(@class,'username')]"));
        //Enter the username.
        userName.sendKeys("admin");
        //Find the password field.
        WebElement password = driver.findElement(By.xpath("//input[contains(@class,'password')]"));
        //Enter the password.
        password.sendKeys("password");
        //Find the login button.
        WebElement submitButton = driver.findElement(By.xpath("//button[@class='ui button']"));
        //Click on the Login button.
        submitButton.click();
        //Find the confirmation message.
        WebElement confirmMessage = driver.findElement(By.id("action-confirmation"));
        //Retrieve the confirmation message.
        String confirmationMessage = confirmMessage.getText();
        //Print the confirmation message.
        System.out.print("Confirmation message is : " + confirmationMessage);
        //Close the browser.
        driver.close();

    }
}
