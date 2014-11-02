package com.bugzilla.gra.login;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bugzilla.support.groups.GRALoader;


public class Test_Login {
	
	GRALoader g1;
	
	GRA_Login LoginPage;
	public Test_Login(WebDriver driver){
		LoginPage = new GRA_Login(driver);
		g1 = new GRALoader();
	}
	@Test
	public void testLoginAction(HashMap<String, String> m12){
//		g1.g
		LoginPage.wel_wl_login.click();
		System.out.println("class Name:" + this.getClass().getSimpleName() + "...121swsds22s2");
		LoginPage.we_username.set(m12.get("UserName"));
		LoginPage.we_password.set(m12.get("Password"));
		LoginPage.wel_wb_login.click();
	}
	
}
