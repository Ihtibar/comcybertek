package com.cybertek.SeleniumConceptionalKnowledges;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Element_VS_Elements {

    public static void main(String[] args) throws InterruptedException {
        // findelement ==> can only be initialized to WebElement
        // findelemnts ==> can be initilized to COllection types(collection, List, LinkList).

        WebDriverManager.chromedriver().setup();
        WebDriver isim= new ChromeDriver();

        isim.navigate().to("https://www.facebook.com/");

//	WebElement myelemnt1=isim.findElement(By.xpath(".//*[@id='u_0_s']/span[1]/label"));
        // only for Female' elemnt.
//		myelemnt1.click();

        List<WebElement> myelemnt2=isim.findElements(By.xpath(".//*[@id='u_0_s']/span/label"));
        // elemnts for male and female both

        for(int i=0; i<myelemnt2.size(); i++) {
            String A=myelemnt2.get(i).getText();
            System.out.println(A);
            if(A.equals("Female")){
                myelemnt2.get(i).click();
            }
            if(A.equals("Male")) {
                myelemnt2.get(i).click();
            }
            Thread.sleep(3000);
        }



        Thread.sleep(5000);
        isim.quit();

    }
}
