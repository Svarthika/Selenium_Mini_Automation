package org.example;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class WebtableDemo {

    @Description("Verify the invalid Login, Error message is expected")
    @Link("https:\\testdefect.com")
    @Owner("Varthika Surthy")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void Web_Table_printdata() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start--maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://awesomeqa.com/webtable1.html");

       WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]"));

        List<WebElement> rows_table = table.findElements(By.tagName("tr"));

        for(int i=0;i<rows_table.size();i++){
            List<WebElement> col = rows_table.get(i).findElements(By.tagName("td"));
            for(WebElement c:col){
                System.out.println(c.getText());
            }
        }
    }
}