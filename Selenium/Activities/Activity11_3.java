package activity;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_3a {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Open the browser.
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        //Get the title of the page.
        String pageTitle =  driver.getTitle();
        //Print the title of the page.
        System.out.println("Title of the page is : " + pageTitle);
        //Search for the prompt button in the page.
        WebElement promptButton = driver.findElement(By.cssSelector("#prompt"));
        //Click on the prompt button.
        promptButton.click();
        //Wait till the alert related to prompt appears on the screen.
        wait.until(ExpectedConditions.alertIsPresent());
        //Switch the control to the alert window.
        Alert alert = driver.switchTo().alert();
        //Enter the text in the alert text box.
        alert.sendKeys("Yes, you are!");
        //Fetch the text for the prompt alert.
        String promptText = alert.getText();
        //Print the text.
        System.out.println("The text message from the prompt is : " + promptText);
        //Click on OK in the alert window.
        alert.accept();
        //Quit the browser.
        driver.quit();
    }
}