package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
    public static void main(String[] args) {
        //Get an instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Navigate to  https://training-support.net/selenium/dynamic-attributes
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        //Get the title of the page.
        String pageTitle = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the navigated page is : " + pageTitle);
        //Find the username field.
        WebElement userName = driver.findElement(By.cssSelector("input[class$='username']"));
        //Enter the username.
        userName.sendKeys("isadmin");
        //Find the password field.
        WebElement password = driver.findElement(By.cssSelector("input[class$='password']"));
        //Enter the password.
        password.sendKeys("ibm_0123");
        //Find the confirm password field.
        WebElement confirmPassword = driver.findElement(By.cssSelector("div.field:nth-child(4) > input:nth-child(2)"));
        //Enter the confirm password.
        confirmPassword.sendKeys("ibm_0123");
        //Find the email field.
        WebElement email = driver.findElement(By.cssSelector("input[class^='email']"));
        //Enter the email
        email.sendKeys("abc@gmail.com");
        //Find the Sign Up button.
        WebElement signupButton = driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]"));
        //Click on the Sign Up button.
        signupButton.click();
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
