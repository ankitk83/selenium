package com.bugzilla.support.groups;



//import org.openqa.selenium.support.PageFactory;




import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bugzilla.gra.createbug.GRA_CreateBug;
import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.gra.login.Test_Login;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;
import com.bugzilla.gra.searchbug.GRA_SearchBug;



public class GRALoader {
	
	public HashMap<String, String> m1 = new HashMap<String, String>();

	
	public GRA_Login graLogin;
	public GRA_Logout graLogout;
	public GRA_TopNav graTopNav;
	public GRA_CreateBug graCreateBug;
	public GRA_SearchBug graSearchBug;
	public Test_Login ts;
	
	
	public void fn_loadClasses(String methodName, WebDriver driverObject){
		
		switch(methodName){
		case "BasicLoginLogout":
			ts = new Test_Login(driverObject);
			graLogin = new GRA_Login(driverObject);//.initElements(driverObject, GRA_Login.class);
			graLogout = new GRA_Logout(driverObject);//.initElements(driverObject, GRA_Logout.class);
		break;
			
		case "PlainVanila":
			ts = new Test_Login(driverObject);
			graLogin = new GRA_Login(driverObject);
			graLogout = new GRA_Logout(driverObject);
			graTopNav = new GRA_TopNav(driverObject);//.initElements(driverObject, GRA_TopNav.class);
		break;
		
		case "CreateNewBug":
			ts = new Test_Login(driverObject);
			graLogin = new GRA_Login(driverObject);
			graLogout = new GRA_Logout(driverObject);
			graTopNav = new GRA_TopNav(driverObject);
			graCreateBug = new GRA_CreateBug(driverObject);//.initElements(driverObject, GRA_CreateBug.class);
		break;
		
		case "PlainSearch":
			ts = new Test_Login(driverObject);
			graLogin = new GRA_Login(driverObject);
			graLogout = new GRA_Logout(driverObject);
			graTopNav = new GRA_TopNav(driverObject);
			graSearchBug = new GRA_SearchBug(driverObject);
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
	
	public void setData(String className){
		
		switch(className){
		case "BasicLoginLogout":
			this.m1.put("UserName", "ankit.kapoor83@gmail.com");
			this.m1.put("Password", "password");
		break;
			
		case "PlainVanila":
			this.m1.put("UserName", "ankit.kapoor83@gmail.com");
			this.m1.put("Password", "password");
		break;
		
		case "CreateNewBug":
			this.m1.put("UserName", "ankit.kapoor83@gmail.com");
			this.m1.put("Password", "password");
		break;
		
		case "PlainSearch":
			this.m1.put("UserName", "ankit.kapoor83@gmail.com");
			this.m1.put("Password", "password");
		break;
		}


	}
	
	public Object getGlobalParams(String keyVal){
		
		return this.m1;
		
	}
	

}
