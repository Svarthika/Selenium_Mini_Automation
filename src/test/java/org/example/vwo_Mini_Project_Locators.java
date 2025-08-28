package org.example;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class vwo_Mini_Project_Locators {
    @Description("Verify the invalid Login, Error message is expected")
    @Link("https:\\testdefect.com")
    @Owner("Varthika Surthy")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void Verify_Vwo_Invalid_Login() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start--maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com");
       // driver.manage().window().maximize();

        WebElement input_email_box = driver.findElement(By.id("login-username"));
        WebElement password_input_box = driver.findElement(By.name("password"));
        WebElement btn_SignIn= driver.findElement(By.id("js-login-btn"));
        WebElement Error_Invalid_msg = driver.findElement(By.id("js-notification-box-msg"));

        input_email_box.sendKeys("admin@gmail.com");
        password_input_box.sendKeys("1234");
        btn_SignIn.click();
        Thread.sleep (2000);
        Assert.assertEquals(Error_Invalid_msg.getText(),"Your email, password, IP address or location did not match");
       driver.quit();
    }


}
