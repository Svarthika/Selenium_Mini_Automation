package org.example.Selenium_xpaths;

import io.qameta.allure.*;
import org.example.Utils.CommontoAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumProject_Mini3 extends CommontoAll {

    @Description("Verify the invalid Login, Error message is expected")
    @Link("https:\\testdefect.com")
    @Owner("Varthika Surthy")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void Test_OrangeHRM_login(){
        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));


        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        button.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement h6 = driver.findElement(By.xpath("//h6[text()=\"PIM\"]"));
        Assert.assertEquals(h6.getText(),"PIM");
        closeBrowser(driver);
    }
    }

