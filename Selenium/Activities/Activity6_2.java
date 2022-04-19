package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) {
        //Get an instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Navigate to  https://training-support.net/selenium/ajax
        driver.get("https://training-support.net/selenium/ajax");
        //Get the title of the page.
        String pageTitle = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the navigated page is : " + pageTitle);
        //Find and click on the change content button.
        driver.findElement(By.xpath("//div[@id='ajax-content']/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Wait till the hello message appears.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ajax-content']/h1")));
        // Capture the "Hello!" message.
        String helloMessage = driver.findElement(By.xpath("//div[@id='ajax-content']/h1")).getText();
        //Print the hello message.
        System.out.println("The message displayed is : " + helloMessage);
        String additionalMessage = driver.findElement(By.xpath("//div[@id='ajax-content']/h3")).getText();
        System.out.println("The additional message displayed is : " + additionalMessage);
        //Wait till the "I'm late!"message appears.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ajax-content']/h3[contains(text(),'late')]")));
        // Capture the "I'm late!" message.
        String lateMessage = driver.findElement(By.xpath("//div[@id='ajax-content']/h3")).getText();
        //Print the late message.
        System.out.println("The message displayed is : " + lateMessage);
        //Close the browser.
        driver.close();
    }
}
