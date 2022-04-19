package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity2 {
    public static void main(String[] args)
    {
        //Create a new instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Open the browser and navigate to training support page.
        driver.get("https://www.training-support.net");
        //Get the title of the web page.
        String pageTitle = driver.getTitle();
        //Print the title of the page in console.
        System.out.println("Title of the page is : " + pageTitle);
        //Find the "About Us" link based on id.
        WebElement idElement = driver.findElement(By.id("about-link"));
        //Capture the idElement's text.
        String idElementText = idElement.getText();
        //Print the idElementText's text.
        System.out.println("Text of the About us link based on id is :  "+ idElementText);
        //Find the "About Us" link based on className.
        WebElement classNameElement = driver.findElement(By.className("inverted"));
        //Capture the classNameElement's text.
        String classNameElementText = classNameElement.getText();
        //Print the classNameElement's text.
        System.out.println("Text of the About us link based on className is :  "+ classNameElementText);
        //Find the "About Us" link based on linkText.
        WebElement linkTextElement = driver.findElement(By.linkText("About Us"));
        //Capture the linkTextElement's text.
        String linkTextElementText = linkTextElement.getText();
        //Print the linkTextElement's text.
        System.out.println("Text of the About us link based on linkText is :  "+ linkTextElementText);
        //Find the "About Us" link based on cssSelector.
        WebElement cssSelectorElement = driver.findElement(By.cssSelector(".green"));
        //Capture the cssSelectorElement's text.
        String cssSelectorElementText = cssSelectorElement.getText();
        //Print the cssSelectorElement's text.
        System.out.println("Text of the About us link based on cssSelector is :  "+ cssSelectorElementText);
        //Close the browser.
        driver.close();
    }
}