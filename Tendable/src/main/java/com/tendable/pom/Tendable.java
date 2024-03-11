package com.tendable.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tendable {

	public WebDriver driver;

	public Tendable(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement aboutUs;

	public WebElement getAboutUs() {
		return aboutUs;
	}

	@FindBy(xpath = "//a[text()='Request A Demo']")
	private WebElement reqADemo;

	public WebElement getReqADemo() {
		return reqADemo;
	}

}
