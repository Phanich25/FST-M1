package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        //Get an instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Navigate to  https://training-support.net/selenium/dynamic-controls
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //Get the title of the page.
        String pageTitle = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the navigated page is : " + pageTitle);
        //Find and click on the checkbox toggle button
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Wait till the checkbox disappears.
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("toggled")));
        //Find and click on the checkbox toggle button
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        //Wait till the checkbox appears.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("toggled")));
        //Check the checkbox.
        driver.findElement(By.name("toggled")).click();
        //Close the browser.
        driver.close();
    }
}
