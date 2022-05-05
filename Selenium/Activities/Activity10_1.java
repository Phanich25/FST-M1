package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1a {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        //Open the browser.
        driver.get("https://www.training-support.net/selenium/input-events");
        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is : " + pageTitle);
        WebElement Cube = driver.findElement(By.id("wrapD3Cube"));
        //Left click.
        actions.click(Cube);
        WebElement cubeValue = driver.findElement(By.className("active"));
        System.out.println(" on left clicking: " + cubeValue.getText());
        //Double click.
        actions.doubleClick(Cube).perform();
        cubeValue=driver.findElement(By.className("active"));
        System.out.println(" on double clicking: " + cubeValue.getText());
        //Right click.
        actions.contextClick(Cube).perform();
        cubeValue=driver.findElement(By.className("active"));
        System.out.println(" on right clicking: " + cubeValue.getText());
        //Close the browser.
        driver.close();
    }
}