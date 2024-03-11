package com.tendable.base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public static void urlLaunch(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public static void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public static String getElementText(WebElement element, WebDriver driver) {
		return element.getText();
	}
	
	public static void inputValues(WebElement element, String values) {
		element.sendKeys(values);
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void jsClickOnElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public static boolean visibilityOfElement(WebElement element) {
		try {
			return element.isDisplayed();
		}catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public static void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
		

	}
}
