package activities;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.sql.Driver;

public class Activity2 {
    WebDriver driver;
    @BeforeClass
    void openBrowser()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
    void testCase1()
    {
        String pageTitle=driver.getTitle();
        String actualTitle = "Target Practice";
        Assert.assertEquals(pageTitle,actualTitle);
    }
    @Test
    void testCase2()
    {
        WebElement button1 = driver.findElement(By.xpath("//div[@class='spaced']/button[contains(@class,'black')]"));
        Assert.assertTrue(button1.isDisplayed());
        Assert.assertEquals(button1.getText(),"black");
        //System.out.println(button1.getText());
    }
    @Test(enabled = false)
    void testCase3()
    {
        WebElement subHeading = driver.findElement(By.xpath("//div[@class='content']/div[@class='sub header']"));
        System.out.println(subHeading.getText());
        Assert.assertEquals(subHeading.getText(),"Practice your element targetting here!");
    }
    @Test
    void testCase4() throws SkipException {
        throw new SkipException("Skipping test case.");
    }
    @AfterClass
    void closeBrowser()
    {
        driver.quit();
    }
}
