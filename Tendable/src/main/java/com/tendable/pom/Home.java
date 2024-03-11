package com.tendable.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	public WebDriver driver;
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Tendable Logo']")
	private WebElement tendableLogo;
	
	@FindBy(xpath = "//a[text()='Our Story']")
	private WebElement ourStory;
	
	@FindBy(xpath = "//a[text()='Our Solution']")
	private WebElement ourSolution;
	
	@FindBy(xpath = "//a[text()='Why Tendable?']")
	private WebElement whyTendable;
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUs;
	
	@FindBy(xpath = "//a[text()='Request A Demo']")
	private WebElement reqADemo;

	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement aboutUs;
	

	public WebElement getAboutUs() {
		return aboutUs;
	}

	public WebElement getTendableLogo() {
		return tendableLogo;
	}

	public WebElement getOurStory() {
		return ourStory;
	}

	public WebElement getOurSolution() {
		return ourSolution;
	}

	public WebElement getWhyTendable() {
		return whyTendable;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getReqADemo() {
		return reqADemo;
	}

	
}
