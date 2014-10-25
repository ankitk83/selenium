package com.bugzilla.support.groups;



//import org.openqa.selenium.support.PageFactory;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bugzilla.gra.createbug.GRA_CreateBug;
import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;

public class GRALoader {
	

	
	public GRA_Login graLogin;
	public GRA_Logout graLogout;
	public GRA_TopNav graTopNav;
	public GRA_CreateBug graCreateBug;
	
	
	public void fn_loadClasses(String methodName, WebDriver driverObject){
		
		switch(methodName){
		case "BasicLoginLogout":
			graLogin = new GRA_Login(driverObject);//.initElements(driverObject, GRA_Login.class);
			graLogout = new GRA_Logout(driverObject);//.initElements(driverObject, GRA_Logout.class);
		break;
			
		case "PlainVanila":
			graLogin = new GRA_Login(driverObject);
			graLogout = new GRA_Logout(driverObject);
			graTopNav = new GRA_TopNav(driverObject);//.initElements(driverObject, GRA_TopNav.class);
		break;
		
		case "CreateNewBug":
			graLogin = new GRA_Login(driverObject);
			graLogout = new GRA_Logout(driverObject);
			graTopNav = new GRA_TopNav(driverObject);
			graCreateBug = new GRA_CreateBug(driverObject);//.initElements(driverObject, GRA_CreateBug.class);
		break;
		
		case "PlainSearch":
			graLogin = new GRA_Login(driverObject);
			graLogout = new GRA_Logout(driverObject);
			graTopNav = new GRA_TopNav(driverObject);
			System.out.println("loaded" + methodName);
		break;
		}
	}
	
	public void fn_unloadClasses(String methodName){
		switch(methodName){
		case "BasicLoginLogout":
			break;
		}
	}
	

}
