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

public class Activity12_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Navigate to the page having frames.
        driver.get("https://www.training-support.net/selenium/iframes");
        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is :" + pageTitle);
        //Switch to the first frame and get its details.
        driver.switchTo().frame(0);
        System.out.println("Now we are in frame: 1");
        String frameHeading = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("The heading of the first frame is : " + frameHeading);
        //Get the details of the button from first frame before clicking it
        WebElement actionButton = driver.findElement(By.xpath("//button[@id='actionButton']"));
        String buttonText = actionButton.getText();
        String color = actionButton.getCssValue("background-color");
        System.out.println("The text of the button before clicking is : " + buttonText);
        System.out.println("The color of the button before clicking is : " + color);
        actionButton.click();
        //Get the details of the button from first frame after clicking it.
        buttonText=actionButton.getText();
        color=actionButton.getCssValue("background-color");
        System.out.println("The text of the button after clicking is : " + buttonText);
        System.out.println("The color of the button after clicking is : " + color);
        //Switch to the main page.
        driver.switchTo().defaultContent();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //Switch to the second frame and get the details.
        driver.switchTo().frame(1);
        System.out.println("Now we are in frame: 2");
        frameHeading = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("The heading of the second frame is : " + frameHeading);
        //Get the details of the button from second frame before clicking it.
        actionButton = driver.findElement(By.xpath("//button[@id='actionButton']"));
        buttonText = actionButton.getText();
        color = actionButton.getCssValue("background-color");
        System.out.println("The text of the button before clicking is : " + buttonText);
        System.out.println("The color of the button before clicking is : " + color);
        actionButton.click();
        //WebElement we = wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//button[@id='actionButton']"),"Button Pressed")
        //wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//button[@id='actionButton']"),"Click Me!"));
        //Get the details of the button from second frame after clicking it.
        buttonText=actionButton.getText();
        color=actionButton.getCssValue("background-color");
        System.out.println("The text of the button after clicking is : " + buttonText);
        System.out.println("The color of the button after clicking is : " + color);
        //Switch to the main page.
        driver.switchTo().defaultContent();
        //Close the browser.
        driver.quit();
    }
}
