package com.simpleTest.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {
	
	public static WebDriver driver;
	public static final String chromeDriverPath = "/Users/miheliwanaishamuding/Downloads/chromedriver";
	
	@Given("^A user is on google homepage$")
	public void a_user_is_on_google_homepage() throws Throwable {
		System.out.println("This is 1st step");
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com");
	   
	}

	@When("^The user enter text into the search box$")
	public void the_user_enter_text_into_the_search_box() throws Throwable {
		System.out.println("This is 2nd step");
		driver.findElement(By.xpath("//input[@name='q' and @title='Search']")).sendKeys("Xinjiang");
	}

	@And("^Click on the search button$")
	public void click_on_the_search_button() throws Throwable {
		System.out.println("This is 3rd step");
		WebElement searchBtn = driver.findElement(By.xpath("//input[@name ='btnK']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
		searchBtn.click();
	    
	}

//	@Then("^Verify the text is in the heading$")
//	public void verify_the_text_is_in_the_heading() throws Throwable {
//		System.out.println("This is 4th step");
//		WebElement elmTitle = driver.findElement(By.partialLinkText("Xinjiang - Wikipedia"));
//		//WebElement elmTitle = driver.findElement(By.xpath("//h3[@class ='LC20lb']"));
//		Assert.assertTrue("Title Not Found", 
//				elmTitle.getText().equals("Xinjiang - Wikipedia"));
//		
//	}

	@Then("^The user click on the wiki link$")
	public void the_user_click_on_the_wiki_link() throws Throwable {
		Thread.sleep(3000);
		String xpath = "//h3[.='Xinjiang - Wikipedia']";
		driver.findElement(By.xpath(xpath)).click();
	    
	}

	@Then("^Verify the text presents in the title$")
	public void verify_the_text_presents_in_the_title() throws Throwable {
		WebElement elmHeading = driver.findElement(By.id("firstHeading"));
		if (elmHeading.isDisplayed() && elmHeading.getText().equalsIgnoreCase("Xinjiang")) {
			System.out.println("header is right");
		} else {
			System.out.println("header is not right");
		}
	}




}
