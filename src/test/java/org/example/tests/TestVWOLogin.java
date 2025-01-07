package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestVWOLogin {

            @Test
            public void TestLogin(){
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
                System.out.println(driver.getCurrentUrl());

              WebElement drop_down = driver.findElement(By.xpath("//p/select"));
                drop_down.click();

                Select drop_down_select = new Select(drop_down);
                drop_down_select.selectByIndex(4);
                drop_down_select.getAllSelectedOptions();
    }



}
