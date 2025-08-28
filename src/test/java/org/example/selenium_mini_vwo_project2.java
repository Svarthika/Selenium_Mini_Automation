package org.example;

import io.qameta.allure.*;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class selenium_mini_vwo_project2 {
    @Description("Verify the invalid Login, Error message is expected")
    @Link("https:\\testdefect.com")
    @Owner("Varthika Surthy")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void verify_invalid_login() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start--maximised");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com");

        WebElement link_Start_Trial = driver.findElement(By.linkText("Start a free trial"));
        link_Start_Trial.click();
        WebElement input_email_box = driver.findElement(By.id("page-v1-step1-email"));
        input_email_box.sendKeys("test");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement  error_message = driver.findElement(By.xpath("//*[text()='The email address you entered is incorrect.']"))   ;

        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

driver.quit();

    }
}
