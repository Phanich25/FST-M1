package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("The title of the page is : " + title);
        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        System.out.println("First name exists " + firstName.isDisplayed());
        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        System.out.println("Last name exists " + lastName.isDisplayed());
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        System.out.println("Email exists " + email.isDisplayed());
        WebElement contactNumber = driver.findElement(By.xpath("//input[@id='number']"));
        System.out.println("Contact Number exists " + contactNumber.isDisplayed());
        WebElement messageBox = driver.findElement(By.xpath("//textarea[@rows=2]"));
        System.out.println("Message Box exists " + messageBox.isDisplayed());
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        System.out.println("Submit button exists  " + submitButton.isDisplayed());
        WebElement resetButton = driver.findElement(By.xpath("//input[@type='reset']"));
        System.out.println("Reset button  exists " + resetButton.isDisplayed());
        firstName.sendKeys("Phani Kumar");
        lastName.sendKeys("Cherukuri");
        email.sendKeys("abc@gmail.com");
        contactNumber.sendKeys("1113224444");
        messageBox.sendKeys("hello world");
        submitButton.click();
        driver.quit();
    }
}
