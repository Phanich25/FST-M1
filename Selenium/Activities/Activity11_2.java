package activity;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_2a {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Open the browser.
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        //Fetch the title of the page.
        String pageTitle = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the page is : " + pageTitle);
        //Find the button related to confirmation message.
        WebElement confirmButton = driver.findElement(By.xpath("//button[contains(@class,'blue')]"));
        //Click on the button to generate confirmation alert.
        confirmButton.click();
        //Wait till the alert appears on the screen.
        wait.until(ExpectedConditions.alertIsPresent());
        //Switch the control to the alert message.
        Alert alert = driver.switchTo().alert();
        //Fetch the text for the alert message.
        String confirmText = alert.getText();
        //Print the text from the confirmation alert.
        System.out.println("The text in the confirmation message is : " + confirmText);
        //Click on the OK button in the alert.
        alert.accept();
        //Once again click on the button to generate confirmation alert.
        confirmButton.click();
        //Wait till the alert appears on the screen.
        wait.until(ExpectedConditions.alertIsPresent());
        //Switch the control to the alert message.
        driver.switchTo().alert().dismiss();
        //Quit the browser
        driver.quit();

    }
}
