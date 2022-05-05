package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_3a {
public static void main(String[] args)
{
    WebDriver driver = new FirefoxDriver();
    Actions dragAndDrop = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    //Navigate to the desired page.
    driver.get("https://training-support.net/selenium/drag-drop");
    //wait for the ball to be displayed on the screen.
    wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
    //Capture webelements for ball , drop zone1, drop zone2.
    WebElement draggable = driver.findElement(By.id("draggable"));
    WebElement dropZone1 = driver.findElement(By.id("droppable"));
    WebElement dropZone2 = driver.findElement(By.id("dropzone2"));
    //drag the ball to the drop zone1.
    //compile the action sequence to drag the ball and drop it in zone1.
    Action actionSequence1 = dragAndDrop.dragAndDrop(draggable, dropZone1).build();
    actionSequence1.perform();
    wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone1,"background-color"));
    System.out.println("Entered drop zone1");
    //drag the ball to the drop zone2.
    //compile the action sequence to drag the ball and drop it in zone2.
    Action actionSequence2 = dragAndDrop.dragAndDrop(draggable,dropZone2).build();
    actionSequence2.perform();
    wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone2,"background-color"));
    System.out.println("Entered drop zone2");
    //Close the browser.
    driver.close();
}
}
