package com.bugzilla.gra.login;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bugzilla.test.base.BugCreateBase;


public class GRA_LoginLogout {
	
	BugCreateBase g1;
	
	OR_Login LoginLogoutPage;
	public GRA_LoginLogout(WebDriver driver){
		LoginLogoutPage = new OR_Login(driver);
		g1 = new BugCreateBase();
	}
	
	
	public void fn_TopNavLogin(HashMap<String, String> m12){
		LoginLogoutPage.wel_wl_login.click();
		System.out.println("class Name:" + this.getClass().getSimpleName() + "...121swsds22s2");
		LoginLogoutPage.we_username.set(m12.get("UserName"));
		LoginLogoutPage.we_password.set(m12.get("Password"));
		LoginLogoutPage.wel_wb_login.click();
	}
	public void fn_Logout(){
		LoginLogoutPage.wl_logout.click();
	}

	
}
