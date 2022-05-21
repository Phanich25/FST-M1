package activity;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity12_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Navigate to the page having frames.
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is : " + pageTitle);
        //Switch to the first frame and get its details.
        driver.switchTo().frame(0);
        System.out.println("Now we are in parent frame.");
        String frameHeading = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("There is no  heading for the parent frame. " + frameHeading);
        //Switch to the nested frame in the first frame and get its details.
        driver.switchTo().frame(0);
        System.out.println("Now we are in the first frame of a nested frame.");
        frameHeading = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("The heading of the first frame is : " + frameHeading);
        //Navigate to the parent frame.
        driver.switchTo().parentFrame();
        //Switch to the second nested frame.
        driver.switchTo().frame(1);
        System.out.println("Now we are in the second frame of a nested frame.");
        frameHeading = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("The heading of the second frame is : " + frameHeading);
        //Switch to the main page.
        driver.switchTo().defaultContent();
        //Close the browser.
        driver.quit();
    }
}
