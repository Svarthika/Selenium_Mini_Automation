package org.example;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class SVGDemo {
    @Description("Verify the invalid Login, Error message is expected")
    @Link("https:\\testdefect.com")
    @Owner("Varthika Surthy")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void SVG_Demo() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start--maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.com/");

        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name='svg']"));
        svgElements.get(0).click();

    }
    @Test
    public void SVG_Demo_Map() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start--maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        List<WebElement> states =driver.findElements(By.xpath("//*[local-name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
for(WebElement s : states){
    System.out.println(s.getAttribute("aria-label"));
    if(s.getAttribute("aria-label").contains("Tripura")){
        s.click();
    }
}
         }
}
