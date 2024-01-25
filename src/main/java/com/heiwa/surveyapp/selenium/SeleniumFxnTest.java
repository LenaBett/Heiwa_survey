package com.heiwa.surveyapp.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class SeleniumFxnTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/HeiwaSurvey/");

        //register
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        WebElement registerUsername = driver.findElement(By.id("username"));
        registerUsername.sendKeys("Max");

        WebElement newPassword = driver.findElement(By.id("password"));
        newPassword.sendKeys("12345");

        WebElement confirmPassword= driver.findElement(By.id("confirmPassword"));
        confirmPassword.sendKeys("12345");

        WebElement registerButton = driver.findElement(By.cssSelector("button[type='submit']"));
        registerButton.click();

        // login
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        usernameInput.sendKeys("Max");
        passwordInput.sendKeys("12345");

        loginButton.click();

        // create survey
        WebElement createSurveyLink = driver.findElement(By.linkText("CREATE SURVEY"));
        createSurveyLink.click();
        WebElement titleInput = driver.findElement(By.id("title"));
        titleInput.sendKeys("Sample Survey");
        WebElement descriptionInput = driver.findElement(By.id("description"));
        descriptionInput.sendKeys("Let's try this");
        WebElement questionTextInput = driver.findElement(By.id("questionText"));
        questionTextInput.sendKeys("How will it work?");
        WebElement createButton = driver.findElement(By.cssSelector("button[type='submit']"));
        createButton.click();

        System.out.println("Successful");

    }

}



