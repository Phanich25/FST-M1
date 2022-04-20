package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Activity8_1 {
    public static void main(String[] args) {
        //Get an instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Navigate to  https://training-support.net/selenium/tables
        driver.get("https://training-support.net/selenium/tables");
        //Get the title of the page.
        String pageTitle = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the navigated page is : " + pageTitle);
        //Find the column list.
        List<WebElement> colList = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
        //Find the row list.
        List<WebElement> rowList = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
        //Print the number of columns.
        System.out.println("total number of columns in striped table is : " + colList.size());
        //Print the number of rows.
        System.out.println("total number of rows in striped table is : " + rowList.size());
        //Fetch the cells from the third row.
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td"));
        //Print the cells from the third row.
        System.out.println("Listing out the third row elements");
        for (WebElement cell : thirdRow)
        {
            System.out.println("Cell value is : " + cell.getText());
        }
        //Fetch the 2nd row, 2nd column element.
        WebElement Cell2R_2C = driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
        //Print the 2nd row, 2nd column element.
        System.out.println("The value available in 2nd row and 2nd column is : " + Cell2R_2C.getText());
        //Close the browser.
        driver.close();
    }
}