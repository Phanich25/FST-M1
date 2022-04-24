package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {
    public static void main(String[] args) {
        //Get an instance of the firefox browser.
        WebDriver driver = new FirefoxDriver();
        //Navigate to  https://training-support.net/selenium/selects
        driver.get("https://training-support.net/selenium/selects");
        //Get the title of the page.
        String pageTitle = driver.getTitle();
        //Print the title of the page.
        System.out.println("The title of the navigated page is : " + pageTitle);
        //Find the multiselect element.
        WebElement multiSelectDropdown = driver.findElement(By.id("multi-select"));
        //Find the selected element.
        WebElement selected = driver.findElement(By.id("multi-value"));
        //Find the text of the multiselect dropdown.
        System.out.println(multiSelectDropdown.getText());
        //create a select element for the multiselect dropdown.
        Select select = new Select(multiSelectDropdown);
        //If the given select is a multilist, perform the following operations.
        if (select.isMultiple()) {
            //select the option "NodeJS" by value.
            select.selectByValue("node");
            System.out.println(selected.getText());
            //select the option "Javascript" by visible text.
            select.selectByVisibleText("Javascript");
            System.out.println(selected.getText());
            //select the options 4,5,6 by index.
            for (int index = 4; index <= 6; index++) {
                select.selectByIndex(index);
            }
            System.out.println(selected.getText());
            //Deselect "NodeJS" by value.
            select.deselectByValue("node");
            System.out.println(selected.getText());
            //Deselect by index 7.
            select.deselectByIndex(7);
            System.out.println(selected.getText());
            //Print the first selected option.
            System.out.println(select.getFirstSelectedOption());
            //Fetch the list of all selected options.
            for (WebElement e : select.getAllSelectedOptions()) {
                System.out.println(e.getText());
            }
            //Deselect all the options.
            select.deselectAll();
            System.out.println(selected.getText());
        }
        //close the browser.
        driver.close();
    }
}