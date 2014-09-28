package org.selenium.test.firstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.selenium.gra.navigation.*;

import static org.selenium.properties.NavigationURLs.*;
public class FirstTest {
	
	
	WebDriver local_webDriver = new FirefoxDriver();
		
	@BeforeTest
	public void bt(){
		local_webDriver.get(QA1);
		
	}
	
	@AfterTest
	public void at(){
		//local_webDriver.close();
		
	}
	
	
	@Test 
	public void checkIt(){
        topNav t1 = PageFactory.initElements(local_webDriver, topNav.class);
        t1.click_project();

		
	}

}
