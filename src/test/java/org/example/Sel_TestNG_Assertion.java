package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Sel_TestNG_Assertion {
    @Test
    public void Assertion_TestNG() {


    WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        driver.quit();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com");

        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com");
}

}

