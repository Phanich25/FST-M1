package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4_3 {
    public static void main(String[] args)
    {
        //Create a new instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Navigate to the target practice page and fetch it's title.
        driver.get("https://www.training-support.net/selenium/target-practice");
        String title = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the pages is : " + title);
        //Find the third header of the page to check if it exists and print it's text.
        WebElement thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']"));
        System.out.println("Third header is displayed: " + thirdHeader.getText() + " " + thirdHeader.isDisplayed());
        //Find the color of the fifth header.
        String fifthHeaderColor = driver.findElement(By.xpath("//h5[contains(@class,'green')]")).getCssValue("color");
        System.out.println("Fifth header's color  is: " + fifthHeaderColor);
        //Find the class of the violet color button.
        String violetColorButton = driver.findElement(By.xpath("//button[contains(@class,'violet')]")).getAttribute("class");
        System.out.println("violet color button class is   is: " + violetColorButton);
        //Find the text of the grey color button.
        String greyColorButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("Grey color button text is   is: " + greyColorButton);
        //Close the browser.
        driver.close();
    }
}
