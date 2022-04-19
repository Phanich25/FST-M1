package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) {
        //Get an instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Navigate to  https://training-support.net/selenium/dynamic-controls
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //Get the title of the page.
        String pageTitle = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the navigated page is : " + pageTitle);
        //Find the checkbox on the given page.
        WebElement checkBox = driver.findElement(By.cssSelector("input.willDisappear"));
        //check whether checkbox is available or not in the given page.
        if (checkBox.isDisplayed() && !checkBox.isSelected())
            System.out.println("checkbox is not selected  on the screen.");
        //select the checkbox.
        System.out.println("text is : " + checkBox.getText());
        checkBox.click();
        //print the selection status of the checkbox.
        System.out.println("Checkbox selection status is : " + checkBox.isSelected());
        System.out.println("class of checkBox is : " + checkBox.getAttribute("class"));
        //Verify whether checkbox is selected or not.
        if (checkBox.isDisplayed() && checkBox.isSelected())
            System.out.println("after selecting checkbox , checkbox is selected on the screen.");
        //Close the browser.
        driver.close();
    }
}
