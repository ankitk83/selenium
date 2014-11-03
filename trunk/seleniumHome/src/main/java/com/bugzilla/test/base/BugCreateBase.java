package com.bugzilla.test.base;



//import org.openqa.selenium.support.PageFactory;




import org.testng.annotations.BeforeMethod;

import com.bugzilla.gra.createbug.GRA_CreateBug;
import com.bugzilla.gra.login.GRA_LoginLogout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;



public class BugCreateBase extends TestBase{
	

	@BeforeMethod
	public void dataSetter(){
			graLoginLogout = new GRA_LoginLogout(eDriver);
			graTopNav = new GRA_TopNav(eDriver);
			graCreateBug = new GRA_CreateBug(eDriver);//.initElements(driverObject, GRA_CreateBug.class);
	}
	
	
	// i think this should also move to TestBase. will do it once we have many FeatuereBases
	@BeforeMethod
	public void setData(){
			this.m1.put("UserName", "ankit.kapoor83@gmail.com");
			this.m1.put("Password", "password");

	}
	

}
