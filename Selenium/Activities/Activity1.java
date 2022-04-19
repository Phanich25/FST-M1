package activity;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Activity1 {
    public static void main(String[] args)
    {
        //create new instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Open the browser and navigate to training support.
        driver.get("https://www.training-support.net");
        //Close the browser.
        driver.close();
    }
}