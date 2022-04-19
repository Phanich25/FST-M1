package activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Activity3 {
    public static void main(String[] args) throws Exception
    {
        //Get an instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Navigate to the simple form page.
        driver.get("https://training-support.net/selenium/simple-form");
        //Get the title of the simple form page.
        String formTitle = driver.getTitle();
        //Print the title of the form page.
        System.out.println("The tile of the form is : "+ formTitle);
        //Find the first name element.
        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        //Enter the first name field.
        firstNameElement.sendKeys("Phanikumar");
        //Find the last name element.
        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        //Enter the last name field.
        lastNameElement.sendKeys("Cherukuri");
        //Find the email field.
        WebElement emailElement = driver.findElement(By.id("email"));
        //Enter the email field.
        emailElement.sendKeys("abc@gmail.com");
        //Find the contact number field.
        WebElement numberElement = driver.findElement(By.id("number"));
        //Enter the contact number.
        numberElement.sendKeys("1113334444");
        //Find the submit button on the page.
        WebElement submitButton = driver.findElement(By.cssSelector("input.green"));
        //Click on the submit button.
        submitButton.click();
        //Run the sleep method for thread.
        Thread.sleep(100);
        //Close all the browsers.
        driver.quit();
    }
}