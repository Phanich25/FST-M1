package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args)
    {
        //Get an instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Navigate to  https://training-support.net/selenium/dynamic-controls
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //Get the title of the page.
        String pageTitle = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the navigated page is : " + pageTitle);
        //Find the checkbox on the given page.
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        //check whether checkbox is available or not in the given page.
        if (checkBox.isDisplayed())
            System.out.println("checkbox is displayed on the screen.");
        //Find the Remove Checkbox button.
        WebElement removeCheckbox = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        //Click on the Remove Checkbox button.
        removeCheckbox.click();
        //Print the result of the isDisplayed() method for checkbox.
        System.out.println("After toggling , checkBox.isDisplayed() value is : " + checkBox.isDisplayed());
        //Verify if the checkbox is available or not.
        if (!checkBox.isDisplayed())
            System.out.println("after clicking on remove checkbox , checkbox is no more displayed on the screen.");
        //Close the browser.
        driver.close();

    }
}
