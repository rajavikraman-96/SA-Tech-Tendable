package com.tendable.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {
	
	public WebDriver driver;
	
	public AboutUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUs;

	public WebElement getContactUs() {
		return contactUs;
	}

	@FindBy(xpath = "//a[text()='Request A Demo']")
	private WebElement reqADemo;
	
	public WebElement getReqADemo() {
		return reqADemo;
	}


}
