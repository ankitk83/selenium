package com.bugzilla.test.auth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;

public class BasicLoginLogout {
	
	
		WebDriver local_webDriver = new FirefoxDriver();
		GRA_Login login = PageFactory.initElements(local_webDriver, GRA_Login.class);
		GRA_Logout logout = PageFactory.initElements(local_webDriver, GRA_Logout.class);
	
	
	@Test
	public void BasicCheck(){
		local_webDriver.get("http://10.0.0.20/bugzilla");
		login.fn_plainLogin();
		logout.fn_Logout();
	}
    
	@AfterTest
	public void closeAll(){
		local_webDriver.close();
		local_webDriver.quit();
	}

}
