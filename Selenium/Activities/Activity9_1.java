package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) {
        //Get an instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Navigate to  https://training-support.net/selenium/selects
        driver.get("https://training-support.net/selenium/selects");
        //Get the title of the page.
        String pageTitle = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the navigated page is : " + pageTitle);
        //Find the dropdown element.
        WebElement dropdown = driver.findElement(By.tagName("select"));
        //Find the chosen element.
        WebElement chosen = driver.findElement(By.id("single-value"));
        //Make a new select object.
        Select select = new Select(dropdown);
        //select the second option by visible text.
        select.selectByVisibleText("Option 2");
        //print the second option by visible text.
        System.out.println("The chosen option by visible text is : " + chosen.getText());
        //select the third option by index.
        select.selectByIndex(3);
        //print the third option by index.
        System.out.println("The chosen option by index is : " + chosen.getText());
        //select the fourth option by value.
        select.selectByValue("4");
        //print the fourth option by value.
        System.out.println("The chosen option by select value is : " + chosen.getText());
        //Get all the options.
        List<WebElement> options = select.getOptions();
        //Print all the options.
        for (WebElement option : options)
        {
            System.out.println(option.getText());
        }
        //Close the browser.
        driver.close();
    }
}