package activity;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1a {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        //Open the browser.
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        //Get the title of the page.
        String pageTitle = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the page  is : " + pageTitle);
        //Get the details of the button for alert message.
        WebElement alertButton = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
        //Click on the alert button.
        alertButton.click();
        //Switch to the alert message window.
        Alert alert = driver.switchTo().alert();
        //Fetch the text from the alert message.
        String alertText = alert.getText();
        //Print the text from the alert message.
        System.out.println("The text in the alert message is : " + alertText);
        //Click OK on the alert message.
        alert.accept();
        //Quit the browser.
        driver.quit();
    }
}
