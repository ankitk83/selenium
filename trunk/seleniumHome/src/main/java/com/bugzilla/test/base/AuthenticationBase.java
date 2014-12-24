package com.bugzilla.test.base;

import org.testng.annotations.BeforeMethod;

import com.bugzilla.gra.createbug.GRA_CreateBug;
import com.bugzilla.gra.login.GRA_LoginLogout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;

public class AuthenticationBase extends TestBase{

	@BeforeMethod
	public void dataSetter(){
			graLoginLogout = new GRA_LoginLogout(eDriver);
			graTopNav = new GRA_TopNav(eDriver);
	}
	
	
	// i think this should also move to TestBase. will do it once we have many FeatuereBases
	@BeforeMethod
	public void setData(){
			this.m1.put("UserName", "ankitkapoor83@gmail.com");
			this.m1.put("Password", "password");

	}
	
}
