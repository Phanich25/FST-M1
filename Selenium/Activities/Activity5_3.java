package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        //Get an instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Navigate to  https://training-support.net/selenium/dynamic-controls
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //Get the title of the page.
        String pageTitle = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the navigated page is : " + pageTitle);
        //Find the input box on the given page.
        WebElement inputBox = driver.findElement(By.id("input-text"));
        //check whether inputBox is available or not in the given page.
        if (inputBox.isDisplayed() && !inputBox.isEnabled())
            System.out.println("Input Box is not enabled.");
        //print the text of the input box.
        System.out.println("text is : " + inputBox.getText());
        //Find the button for toggling input box.
        WebElement toggleInputBox = driver.findElement(By.id("toggleInput"));
        //Click on the toggle input box button.
        toggleInputBox.click();
        //print the enabled status of the input box.
        System.out.println("Input box enablement status is : " + inputBox.isEnabled());
        System.out.println("Class of Input Box is : " + inputBox.getAttribute("class"));
        //Verify whether input box is enabled or not.
        if (inputBox.isDisplayed() && inputBox.isEnabled())
            System.out.println("after toggling to enable input box , input box is enabled on the screen.");
        //Close the browser.
        driver.close();
    }
}
