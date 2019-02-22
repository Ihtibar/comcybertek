package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesExample extends TestBase {

    @Test
    public void printWholeTable(){
        login();
        WebElement table = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
        System.out.println(table.getText());

    }

     public void login(){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);

     }
     // printing the headers of the tables

    public void printAllHeaders(){
        login();
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));

        for(WebElement header:headers){
            System.out.println(header.getText());
        }
    }
    // prints the number of rows
    // prints all rows=== prints the whole again
    // prints the nth// => certian cell, single rows , prints the certian clumn
    // print by cordinated(row ,col)

    @Test
    public void printRow(){
        login();
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println("number of rows: " + allRows.size());

        System.out.println("printing row: " + 4);
        System.out.println(allRows.get(3).getText());

    }
    @Test
    public void printTableSize(){
        login();
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

        System.out.println("number of rows: "  + allRows.size());

        List<WebElement> allColumns = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));
        System.out.println("All Colums size: " + allColumns.size());


        /*
        print a row whith out using a list
         */

    }

    @Test
    public void printRow2(){
        login();
     WebElement aRow = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]"))  ;
        System.out.println(aRow.getText());



    }
    @Test
    public  void printAllCellsInOneRow(){
        login();
        List<WebElement> cells = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td"));
        for(WebElement header : cells){
            System.out.println(header.getText());
        }
    }
    /*
    print by cordinates : based on row and clomn number

     */
    @Test
    public void printByCoordinates(){
        login();
        WebElement cell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[11]"));
        System.out.println(cell.getText());
        System.out.println(getCell(6,11).getText());

    }

    public WebElement getCell(int row, int col){

        String xpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" +row +"]/td[" +col+"]";
        return driver.findElement(By.xpath(xpath));
    }
    /*
    print all the values in single clomn

     */
    @Test
    public void printColumn(){

        login();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for(WebElement header : allNames){
            System.out.println(header.getText());
        }
    }

        // find the select check box for a given name
    @Test
    public void selectCheckBox(){
        login();
        WebElement checkbox = driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[1]/input"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
    }
    /*
    verify that name 'Mark Smith ' exitsin the  names colum
    verify that city  'anytown' exits in the cities column

     */
    @Test
    public void test(){
        login();
        int nameIndex = getColumnIndex("Name");
        System.out.println(nameIndex);

        List<WebElement> allNames = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+ nameIndex +"]"));
        boolean found = false;

        for(int i = 0; i < allNames.size(); i++){
            if(allNames.get(i).getText().contains("Mark Smith")){
                found = true;
                break;
            }
        }

        Assert.assertTrue(found);

        found = false;
        int cityIndex = getColumnIndex(("City"));
        List<WebElement> allCities = driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+cityIndex+"]"));

        for(int i = 0; i < allCities.size(); i++) {
            if(allCities.get(i).getText().equals("Whitestone, British")) {
                found = true;
                break;
            }
        }

        Assert.assertTrue(found);

    }

    public int getColumnIndex(String name) {

        List<WebElement>allHeaders = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));

        for (int i = 0; i < allHeaders.size(); i++){
            if(allHeaders.get(i).getText().equals("Mark Smith")){

                return i + 1;
            }
        }

        return 0;
    }


}
