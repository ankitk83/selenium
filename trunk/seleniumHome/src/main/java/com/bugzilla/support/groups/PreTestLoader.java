package com.bugzilla.support.groups;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;

import com.bugzilla.gra.createbug.GRA_CreateBug;
import com.bugzilla.gra.login.*;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;
//import com.bugzilla.gra.login.GRA_Logout;
import com.google.common.base.CaseFormat;

public class PreTestLoader {

	private String oEnv;
	private String oBrows;
	protected WebDriver BrowserDriver;
	public static HashMap m1;
	public WebDriver local_webDriver;
	
	
	public GRA_Login graLogin;
	public GRA_Logout graLogout;
	public GRA_TopNav graTopNav;
	public GRA_CreateBug graCreateBug;
	private String methodName;
	
	
	
	/*
	 * 
	 */
	public static void fn_loadTestData(){
		m1 = new HashMap();
		m1.put("UserName","ankit.kapoor83@gmail.com");
		m1.put("Password","password");
		
	}
	
	@BeforeMethod
	public void nameBefore(Method method)
	{
	    System.out.println("Test name: " + method.getName()); 
	    methodName = method.getName();

	}
	
	
	@BeforeMethod
	@Parameters({"environment","browser"})
	public void getParams(@Optional String env, String brows, Method method) throws IOException{
	    System.out.println("Test name: " + method.getName());
	    methodName = method.getName();
		

		System.out.println("called 1");
		this.oEnv = env;
		System.out.println("called from beforetest:::" + brows);
		this.oBrows = brows;
		System.out.println("class Name:" + this.getClass().getSimpleName() + "...");
		System.out.println("[][]" + this.oBrows.toString().toUpperCase().trim()+ "[][]");
		System.out.println(Thread.currentThread().getStackTrace());
		System.out.println("--------------------");
		fn_setLoadBrowser();
		fn_loadTestData();
		fn_loadClasses(methodName);
		

	}
	
	
	@AfterMethod
	public void closeAllItems(){
		BrowserDriver.close();
		BrowserDriver = null;
		graLogin = null;
		
	}
	
	
	private void fn_loadClasses(String MethodName){
		System.out.println("entering loadClass method");
		
		switch (MethodName){
		case "PlainVanila":
			
			graLogin = PageFactory.initElements(BrowserDriver, GRA_Login.class);
			graLogout = PageFactory.initElements(BrowserDriver, GRA_Logout.class);
			graTopNav = PageFactory.initElements(BrowserDriver, GRA_TopNav.class);
			System.out.println("loaded" + MethodName);
		break;
		
		case "CreateNewBug":
			
			graLogin = PageFactory.initElements(BrowserDriver, GRA_Login.class);
			graLogout = PageFactory.initElements(BrowserDriver, GRA_Logout.class);
			graTopNav = PageFactory.initElements(BrowserDriver, GRA_TopNav.class);
			graCreateBug = PageFactory.initElements(BrowserDriver, GRA_CreateBug.class);
			System.out.println("loaded" + MethodName);
		break;
		
		case "BasicLoginLogout":
			
			graLogin = PageFactory.initElements(BrowserDriver, GRA_Login.class);
			graLogout = PageFactory.initElements(BrowserDriver, GRA_Logout.class);
			System.out.println("loaded" + MethodName);
		break;
		
		case "PlainSearch":
			
			graLogin = PageFactory.initElements(BrowserDriver, GRA_Login.class);
			graLogout = PageFactory.initElements(BrowserDriver, GRA_Logout.class);
			graTopNav = PageFactory.initElements(BrowserDriver, GRA_TopNav.class);
			System.out.println("loaded" + MethodName);
		break;
		
		
		}
		
	}
	
	
	
	private void fn_setLoadBrowser(){
		switch (this.oBrows.toString().toUpperCase().trim()) {
		
		case "FIREFOX":
			BrowserDriver = new FirefoxDriver();		
			break;

			
		case "CHROME":
			System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
			this.BrowserDriver = new ChromeDriver();		
			break;
			
		default:
			break;
		}
	}
	
	
	public WebDriver getBrowser(){
		return this.BrowserDriver;
	}

	
	/*
	 * 
	 */
	public WebDriver getLocal_webDriver() {
		return local_webDriver;
	}

	/*
	 * 
	 */
	public void setLocal_webDriver(WebDriver local_webDriver) {
		this.local_webDriver = local_webDriver;
	}
	


//@AfterTest
//public void closeBrowsers(){
//	this.local_webDriver.close();
//	this.local_webDriver.quit();
//}
}