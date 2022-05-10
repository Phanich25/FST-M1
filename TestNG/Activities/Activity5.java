package Activity5Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;
    @BeforeClass(alwaysRun = true)
    void setUp()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test(groups={"HeaderTests","ButtonTests"})
    void testCase1()
    {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,"Target Practice");
    }
    @Test(dependsOnMethods = {"testCase1"}, groups={"HeaderTests"})
    void testCase2()
    {
        WebElement thirdHeader = driver.findElement(By.cssSelector("div>h3#third-header"));
        String thirdHeaderText = thirdHeader.getText();
        Assert.assertEquals("Third header",thirdHeaderText);
    }
    @Test(dependsOnMethods = {"testCase1"}, groups={"HeaderTests"})
    void testCase3()
    {
        WebElement fifthHeader = driver.findElement(By.cssSelector("div>h5.ui.green.header"));
        String color = fifthHeader.getCssValue("color");
        //System.out.println(color);
        Assert.assertEquals("rgb(33, 186, 69)",color);
    }
    @Test(dependsOnMethods = {"testCase1"}, groups={"ButtonTests"})
    void testCase4()
    {
        WebElement oliveButton = driver.findElement(By.cssSelector("div.column>div>button.olive"));
        String oliveButtonText = oliveButton.getText();
        Assert.assertEquals("Olive",oliveButtonText);
    }
    @Test(dependsOnMethods = {"testCase1"}, groups={"ButtonTests"})
    void testCase5()
    {
        WebElement brownButton = driver.findElement(By.cssSelector("div.column>div.spaced>button.brown"));
        String color = brownButton.getCssValue("color");
        //System.out.println(color);
        Assert.assertEquals("rgb(255, 255, 255)",color);
    }
    @AfterClass(alwaysRun = true)
    void tearDown()
    {
        driver.quit();
    }
}