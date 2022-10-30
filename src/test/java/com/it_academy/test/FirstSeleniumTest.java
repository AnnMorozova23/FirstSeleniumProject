package com.it_academy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FirstSeleniumTest {

    @Test
    public void webDriverOpenCloseTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

        List<WebElement> filters =
                driver.findElements(By.xpath("//div[@class='schema-filter__fieldset' "
                        + "and contains(., 'Произ')]//li//*[contains(@class, 'checkbox-text')]"));

       List<String> filterNames = filters
               .stream()
               .map(el -> el.getText())
               .collect(Collectors.toList());


        WebElement element = driver.findElement(By.xpath(""));
        String text = element.getText();



        driver.quit();
    }

}
