package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.time.Duration;

//import static sun.security.krb5.internal.KDCOptions.with;

public class TestVWOLogin {

            @Test
            public void TestLogin(){
                WebDriver driver = new ChromeDriver();
                driver.get("https://app.vwo.com/#/login");
                System.out.println(driver.getCurrentUrl());
//
//              WebElement drop_down = driver.findElement(By.xpath("//p/select"));
//                drop_down.click();
//
//                Select drop_down_select = new Select(drop_down);
//                drop_down_select.selectByIndex(4);
//                drop_down_select.getAllSelectedOptions();
                WebElement element = driver.findElement(By.xpath("//input[@id=\"login-username\"]"));
                WebElement element2 = driver.findElement(By.xpath("//input[@id=\"login-password\"]"));
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)) ;

//                try {
//                    Thread.sleep(300);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                element.sendKeys("Hi");
                element2.sendKeys("Hello");

                WebElement element3 = driver.findElement(By.id("js-login-btn"));
                element3.click();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                WebElement element4 =  driver.findElement(By.xpath("(//div[@id='js-notification-box-msg'])[1]"));
               String text = element4.getText();
                Assert.assertEquals(text,"Your email, password, IP address or location did not match");

                System.out.println(text);
               if(text.equals("Your email, password, IP address or location did not match")){
                   System.out.println("Test case passed");
                }



    }



}
