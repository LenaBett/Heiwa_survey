package com.heiwa.surveyapp.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUnitTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://34.16.186.151:8080/HeiwaSurvey/");
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        usernameInput.sendKeys("Lena");
        passwordInput.sendKeys("1234");

        loginButton.click();


        //driver.quit();
    }
}

