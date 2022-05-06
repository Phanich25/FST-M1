package activity;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4a {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Open the browser.
        driver.get("https://www.training-support.net/selenium/tab-opener");
        //Get the title of the first tab.
        String pageTitle = driver.getTitle();
        //Print the title of the first tab.
        System.out.println("Title of the page is : " + pageTitle);
        //Get the handle of the first tab.
        String parentHandle = driver.getWindowHandle();
        //Print the handle of the first tab.
        System.out.println("Parent handle is : " + parentHandle);
        //Find the clickMe button on the first tab.
        WebElement clickMe = driver.findElement(By.cssSelector("#launcher"));
        //Click the Click Me button.
        clickMe.click();
        //Wait till the second tab also gets loaded.
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        //Get the current list of handles.
        Set<String> handles = driver.getWindowHandles();
        //Print the current list of handles.
        System.out.println("List of handles after two tabs: " + handles);
        String secondHandle = "";
        //Switch to the latest handle.
        for (String handle : handles) {
            if (handle != parentHandle)
                driver.switchTo().window(handle);

        }
        //Get the handle of the second tab.
        secondHandle = driver.getWindowHandle();
        //Print the handle for the third tab.
        System.out.println("Second Handle is : " + secondHandle);
        //Wait till the button on the second tab gets displayed.
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        //Get the title of the second tab.
        String secondTabTitle = driver.getTitle();
        //Print the title of the second tab.
        System.out.println("Second Tab title is : " + secondTabTitle);
        //Get the heading of the second tab.
        WebElement secondTabHeading = driver.findElement(By.cssSelector("div.content:nth-child(2)"));
        //Print the second heading.
        System.out.println("Second tab heading is : " + secondTabHeading.getText());
        //Find the OpenAnotherOne button in the second tab.
        WebElement openAnotherOne = driver.findElement(By.id("actionButton"));
        //Click on the OpenAnotherOne button.
        openAnotherOne.click();
        //Wait till third tab gets opened.
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        //Get the current list of handles.
        handles = driver.getWindowHandles();
        //Print the current list of handles.
        System.out.println("List of handles after three tabs: " + handles);
        //Switch to the latest handle.
        for (String handle : handles) {
            //if ((handle != parentHandle) && (handle != secondHandle))
            //System.out.println("handle = " + handle);
            driver.switchTo().window(handle);
        }
        //Get the handle for the third tab.
        String thirdHandle = driver.getWindowHandle();
        //Print the handle for the third tab.
        System.out.println("Third Handle is : " + thirdHandle);
        //Wait until the heading on the third tab gets displayed.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'successfully')]")));
        //Get the title of the third tab.
        String thirdTabTitle = driver.getTitle();
        //Print the title of the third tab.
        System.out.println("Third Tab title is : " + thirdTabTitle);
        //Get the heading of the third tab.
        WebElement thirdTabHeading = driver.findElement(By.cssSelector("div.content:nth-child(2)"));
        //Print the heading of the third tab.
        System.out.println("Third tab heading is : " + thirdTabHeading.getText());
        //Quit the browser.
        driver.quit();
    }
}