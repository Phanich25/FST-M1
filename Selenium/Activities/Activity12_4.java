package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Activity12_4 {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        //Navigate to the given url to handle popups.
        driver.get("https://www.training-support.net/selenium/popups");
        //Fetch the details of the page and print them.
        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is : " + pageTitle);
        //Fetch the details of the signinButton.
        WebElement signinButton = driver.findElement(By.cssSelector("Button.ui.huge.inverted.orange.button"));
        //Create an actions object.
        Actions actionSequence = new Actions(driver);
        //Prepare an action sequence to hover over the siginbutton.
        actionSequence.moveToElement(signinButton).pause(Duration.ofMillis(3000)).build().perform();
        //Get the hover text.
        String hoverText = signinButton.getAttribute("data-tooltip");
        System.out.println("The text seen after mouse hover is : " + hoverText);
        //Click on the signin button.
        signinButton.click();
        //Enter the user name in the new popup window.
        driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
        //Enter the password in the new popup window.
        driver.findElement(By.cssSelector("input#password")).sendKeys("password");
        //driver.findElement(By.xpath("//button[@type='submit']")).submit();
        //Click on the login button.
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //Get the confirmation text after logging in.
        String confirmationText = driver.findElement(By.cssSelector("div#action-confirmation")).getText();
        //Print the confirmation text.
        System.out.println("Confirmation text after logging in is : " + confirmationText);
        //Close the browser.
        driver.quit();
    }
}
