package com.tendable.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurSolution {
	
	public WebDriver driver;
	public OurSolution(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='Why Tendable?']")
	private WebElement whyTendable;
	
	public WebElement getWhyTendable() {
		return whyTendable;
	}


	@FindBy(xpath = "//a[text()='Request A Demo']")
	private WebElement reqADemo;
	
	public WebElement getReqADemo() {
		return reqADemo;
	}

}
