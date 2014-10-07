package com.bugzilla.test.auth;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.support.groups.PreTestLoader;

@Test
public class BasicLoginLogout extends PreTestLoader{
	WebDriver local_webDriver ;
	GRA_Login login;
			GRA_Logout logout; 

	@BeforeTest
	public void callSuperClass(){

		 local_webDriver = getBrowser();
		 login = PageFactory.initElements(local_webDriver, GRA_Login.class);
		 logout = PageFactory.initElements(local_webDriver, GRA_Logout.class);
	}
	
	public void BasicCheck() throws IOException{
		local_webDriver.get("http://10.0.0.20/bugzilla");
		login.fn_plainLogin(m1);
		logout.fn_Logout();
	}
    
	@AfterTest
	public void closeAll(){
		local_webDriver.close();
		local_webDriver.quit();
	}

}
