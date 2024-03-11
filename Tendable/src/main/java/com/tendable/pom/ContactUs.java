package com.tendable.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {
	
	public WebDriver driver;
	
	public ContactUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Marketing')]//following-sibling::div/button")
	private WebElement marketingContact;

	@FindBy(xpath = "//input[@name='fullName']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@placeholder='Organisation Name ']")
	private WebElement organizationName;
	
	@FindBy(xpath = "//input[@name='cellPhone']")
	private WebElement phoneNumber;
	
	@FindBy(xpath = "//label[@for='form-input-email']//following-sibling::input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//select[@name='jobRole']")
	private WebElement jobRole;
	
	@FindBy(xpath = "//label[text()='I Agree']/input")
	private WebElement agree;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//li[text()='This field is required']")
	private WebElement errorMsg;
	

	public WebElement getMarketingContact() {
		return marketingContact;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getOrganizationName() {
		return organizationName;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getJobRole() {
		return jobRole;
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}
	
	
}
