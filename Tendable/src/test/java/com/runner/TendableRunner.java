package com.runner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tendable.base.Base;
import com.tendable.pom.AboutUs;
import com.tendable.pom.ContactUs;
import com.tendable.pom.Home;
import com.tendable.pom.Marketing;
import com.tendable.pom.OurSolution;
import com.tendable.pom.OurStory;
import com.tendable.pom.Tendable;

public class TendableRunner extends Base {

	public static WebDriver driver;
	public static OurStory ourStory;
	public static Home home;
	public static OurSolution ourSolution;
	public static Tendable tend;
	public static AboutUs about;
	public static ContactUs contact;
	public static Marketing mark;

	@BeforeMethod
	private void browserStart() {
		driver = new ChromeDriver();
		maximizeWindow(driver);
		home = new Home(driver);
		ourStory = new OurStory(driver);
		ourSolution = new OurSolution(driver);
		tend = new Tendable(driver);
		about = new AboutUs(driver);
		contact = new ContactUs(driver);
		mark = new Marketing(driver);
	}

	@Test
	private void tendableTest() {

		urlLaunch(driver, "https://www.tendable.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		clickOnElement(home.getOurStory());
		boolean homeReq = visibilityOfElement(ourStory.getReqADemo());
		clickOnElement(ourStory.getOurSolution());
		boolean ourStoryReq = visibilityOfElement(ourStory.getReqADemo());
		clickOnElement(ourStory.getOurSolution());
		boolean ourSolReq = visibilityOfElement(ourSolution.getReqADemo());
		clickOnElement(ourSolution.getWhyTendable());
		boolean tendReq = visibilityOfElement(tend.getReqADemo());
		clickOnElement(tend.getAboutUs());
		boolean aboutReq = visibilityOfElement(about.getReqADemo());
		clickOnElement(about.getContactUs());
		if (homeReq && ourStoryReq && ourSolReq && tendReq && aboutReq) {
			clickOnElement(contact.getMarketingContact());
			inputValues(mark.getName(), "RajaVikraman");
			inputValues(mark.getOrganizationName(), "SA Tech");
			inputValues(mark.getPhoneNumber(), "1234567890");
			inputValues(mark.getEmail(), "abc@gmail.com");
			selectByVisibleText(mark.getJobRole(), "Other");
			jsClickOnElement(driver, mark.getAgree());
			jsClickOnElement(driver, mark.getSubmit());
			boolean errorMsg = visibilityOfElement(mark.getErrorMsg());
			Assert.assertTrue(errorMsg);
		}

	}

}
