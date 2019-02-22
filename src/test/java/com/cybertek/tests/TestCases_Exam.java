package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCases_Exam {

    public static void main(String[] args) throws InterruptedException {

        BasicauthenticationAddressbook();

        Thread.sleep(1200);
        BasicauthenticationZerobank();
        Thread.sleep(1200);
        searchAmazon();
        Thread.sleep(1200);
        retrievePassword();
        Thread.sleep(1200);
        clickOnLinks();
        Thread.sleep(1200);
        VerifyCheckBoxFunctionality();
        Thread.sleep(1200);
        MercuryToursRadioButtonFunctionality();
        Thread.sleep(1200);
        MercuryToursDepartureList();

    }


    public static void BasicauthenticationAddressbook() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("http://a.testaddressbook.com/sign_in");

        driver.manage().window().fullscreen();


        WebElement emailInput = driver.findElement(By.id("session_email"));
        emailInput.sendKeys("kexesobepu@zsero.com");


        WebElement passwordInput = driver.findElement(By.id("session_password"));
        passwordInput.sendKeys("password" + Keys.ENTER);


        WebElement currentUserName = driver.findElement(By.className("navbar-text"));


        if (currentUserName.getText().equals("kexesobepu@zsero.com")) {
            System.out.println("Pass | The user name has displayed");
        } else {
            System.out.println("Fail | The user name has not displayed");
        }


        if (driver.getTitle().contains("sign in")) {

            System.out.println("Failed ~~ title contains 'Sign in'");
        } else {
            System.out.println("Pass ~~ title does not contain 'Sign in'");
        }

        Thread.sleep(2000);

        driver.quit();


    }


    public static void BasicauthenticationZerobank() throws InterruptedException {
        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.manage().window().fullscreen();


        WebElement emailInput = driver.findElement(By.id("user_login"));
        emailInput.sendKeys("username");

        WebElement passwordInput = driver.findElement(By.id("user_password"));
        passwordInput.sendKeys("password");

        WebElement buttonSingIn = driver.findElement(By.name("submit"));
        buttonSingIn.click();


        WebElement currentUserName = driver.findElement(By.xpath("//*[@id=\"settingsBox\"]/ul/li[3]/a"));

        if (currentUserName.getText().equals("username")) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
            System.out.println("EXPTECTED: kexesobepu@zsero.com");
        }


        if (driver.getTitle().equals("Zero - Account Summary")) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }

        Thread.sleep(2000);

        driver.quit();


    }

    public static void searchAmazon() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        String searchTerm = "Laptops";

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://amazon.com");

        driver.manage().window().fullscreen();


        WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchBox.sendKeys(searchTerm);

        WebElement searchButton = driver.findElement(By.className("nav-input"));
        searchButton.click();

        if (driver.getTitle().contains(searchTerm)) {
            System.out.println("Pass | Title contains the search term");

        } else {
            System.out.println("Failed | Title does not contain the search term");
        }


        Thread.sleep(2000);

        driver.quit();

    }


    public static void retrievePassword() throws InterruptedException {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/forgot_password");


        driver.manage().window().fullscreen();


        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("frk.coskunn@cybertek");

        WebElement button1 = driver.findElement(By.id("form_submit"));
        button1.click();

        Thread.sleep(1500);


        if (driver.getCurrentUrl().contains("email_sent")) {
            System.out.println("Pass | URL contains email sent");
        } else {
            System.out.println("Failed | URL does not contain email sent");
        }

        Thread.sleep(2000);

        driver.quit();

    }

    public static void clickOnLinks() throws InterruptedException {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().fullscreen();


        Thread.sleep(1500);


        WebElement fileDownload = driver.findElement(By.partialLinkText("File Download"));
        fileDownload.click();

        Thread.sleep(2000);

        if (driver.getTitle().contains("download")) {
            System.out.println("PASS | The title contains 'download' ");
        } else {
            System.out.println("Failed ");
            System.out.println("expected: Title Contains 'download' ");
            System.out.println("Actual Result = " + driver.getTitle());

        }

        Thread.sleep(1500);


        driver.navigate().back();

        Thread.sleep(1000);

        WebElement fileUpload = driver.findElement(By.partialLinkText("File Upload"));
        fileUpload.click();

        Thread.sleep(500);


        if (driver.getTitle().contains("upload")) {

        } else {
            System.out.println("Failed ");
            System.out.println("expected: Title Contains 'upload' ");
            System.out.println("Actual Result = " + driver.getTitle());

        }


        Thread.sleep(2000);

        driver.quit();


    }

    public static void VerifyCheckBoxFunctionality() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement firstCheckBox = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));

        WebElement secondCheckBox = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));

        if (firstCheckBox.isSelected()) {
            System.out.println("First check box is selected");
        } else {
            System.out.println("First check box is not selected");
        }


        if (secondCheckBox.isSelected()) {
            System.out.println("Second check box is selected");
        } else {
            System.out.println("Second check box is not selected");
        }


        System.out.println("Clicking first check box");

        firstCheckBox.click();
        System.out.println("First box: " + firstCheckBox.isSelected());

        System.out.println("Second box : " + secondCheckBox.isSelected());

        System.out.println("Clicking Second Box");

        secondCheckBox.click();

        System.out.println("First box: " + firstCheckBox.isSelected());

        System.out.println("Second box : " + secondCheckBox.isSelected());

        Thread.sleep(1500);


        driver.quit();


    }

    public static void MercuryToursRadioButtonFunctionality() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://www.newtours.demoaut.com/");

        Thread.sleep(1500);

        WebElement singOn = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]"));
        singOn.click();

        Thread.sleep(1500);

        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("tutorial");

        Thread.sleep(1000);

        WebElement passWord = driver.findElement(By.name("password"));
        passWord.sendKeys("tutorial" + Keys.ENTER);


        WebElement roundTrip = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]"));
        WebElement oneWay = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));

        if (roundTrip.isSelected()) {
            System.out.println("Pass | Round Trip Selected");
        } else {
            System.out.println("Fail | Round Trip Has not Selected");
        }


        if (oneWay.isSelected()) {
            System.out.println("Fail | One way Selected");
        } else {
            System.out.println("Pass | One way Has not Selected by default");
        }


        System.out.println("Clicking One way");
        oneWay.click();

        System.out.println("Round Trip: " + roundTrip.isSelected());

        System.out.println("One Way: " + oneWay.isSelected());


        Thread.sleep(1500);

        driver.quit();

    }

    public static void MercuryToursDepartureList() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.get("http://www.newtours.demoaut.com/");


        String firstOption = "Acapulco";

        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("tutorial");

        Thread.sleep(1000);

        WebElement passWord = driver.findElement(By.name("password"));
        passWord.sendKeys("tutorial" + Keys.ENTER);


        Select dropBox = new Select(driver.findElement(By.name("fromPort")));

        if (dropBox.getFirstSelectedOption().getText().equals(firstOption)) {
            System.out.println("PASS | First Default Option is " + firstOption);
        } else {
            System.out.println("Fail | First Default Option is not " + firstOption);
        }


        List<WebElement> options = dropBox.getOptions();
        System.out.println("Options size: " + options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }


        //with visible text
        System.out.println("Selecting New York");
        dropBox.selectByVisibleText("New York");
        System.out.println("Selected Option: " + dropBox.getFirstSelectedOption().getText());


        //with select index

        System.out.println("Selecting Sydney");
        dropBox.selectByIndex(9);
        System.out.println("Selected Option: " + dropBox.getFirstSelectedOption().getText());


        //with value

        System.out.println("Selecting Frankfurt");
        dropBox.selectByValue("Frankfurt");
        System.out.println("Selected Option: " + dropBox.getFirstSelectedOption().getText());


        Thread.sleep(1200);

        driver.quit();


    }


}











