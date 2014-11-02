package com.bugzilla.test.auth;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bugzilla.global.values.StaticURLs;
import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.support.groups.PreTestLoader;


public class BasicLoginLogout extends PreTestLoader{
	
	@Test
	public void BasicLoginLogout() throws IOException{
		BrowserDriver.get(StaticURLs.bugZillaHome);
		ts.testLoginAction(m1);
//		graLogin.fn_plainLogin(m1);
		graLogout.fn_Logout();
	}
    

}
