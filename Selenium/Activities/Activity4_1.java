package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args)  throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("The tile is : " + title);
        WebElement element = driver.findElement(By.xpath("//a[@href='about']"));
        Thread.sleep(1000);
        element.click();
        String newPageTitle=driver.getTitle();
        System.out.println("The new page title is : " + newPageTitle);
        driver.close();
    }
}
