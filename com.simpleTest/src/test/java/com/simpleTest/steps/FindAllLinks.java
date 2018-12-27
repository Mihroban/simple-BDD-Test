package com.simpleTest.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FindAllLinks {
	
	public static WebDriver driver;
	public static final String chromeDriverPath = "/Users/miheliwanaishamuding/Downloads/chromedriver";
	
	
	@Given("^I am on the google home page$")
	public void i_am_on_the_google_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	    

	}

	@Then("^I validate all links are displayed$")
	public void i_validate_all_links_are_displayed() throws Throwable {
		
		List<String> expectedLinkElem= new ArrayList<String>(); 
		expectedLinkElem.add("Store");
		expectedLinkElem.add("Gmail");
		expectedLinkElem.add("Images");
		expectedLinkElem.add("NO, THANKS");
		//expectedLinkElem.add("SHOW ME WHAT'S NEW");
		expectedLinkElem.add("Privacy");
		expectedLinkElem.add("Terms");
		expectedLinkElem.add("Settings");
		expectedLinkElem.add("Advertising");
		expectedLinkElem.add("Business");
		//expectedLinkElem.add("Discover the story");
		expectedLinkElem.add("register today");
		expectedLinkElem.add("Sign in");
		expectedLinkElem.add("START CHECKUP");
		System.out.println(expectedLinkElem.size());
		System.out.println(expectedLinkElem);
		
		List<String> actualLinkElem = new ArrayList<String>();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));		 		
		
		for (int i = 0; i< allLinks.size(); i++)
		{	
			System.out.println(actualLinkElem.add(allLinks.get(i).getText()));
			System.out.println(actualLinkElem);
	} 

		
		for (String expected : expectedLinkElem) 
		{	
			if (actualLinkElem.contains(expected)) {					
			  System.out.println("Search function verified");
	    } else {
	          System.out.println("Search function verification failed");
	    }
	  }
		
		
	}
}
