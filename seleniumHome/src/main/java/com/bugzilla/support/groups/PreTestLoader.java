package com.bugzilla.support.groups;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.bugzilla.gra.createbug.GRA_CreateBug;
import com.bugzilla.gra.login.GRA_Login;
import com.bugzilla.gra.login.GRA_Logout;
import com.bugzilla.gra.nav.TopNav.GRA_TopNav;
//import com.bugzilla.gra.login.GRA_Logout;

public class PreTestLoader extends GRALoader {

	private String oEnv;
	private String oBrows;
	protected WebDriver BrowserDriver;
	public static HashMap m1;
	public WebDriver local_webDriver;
	private String methodName;
	
	
	
	/*
	 * 
	 */
	public static void fn_loadTestData(){
		m1 = new HashMap();
		m1.put("UserName","ankit.kapoor83@gmail.com");
		m1.put("Password","password");
		
	}
	
//	@BeforeMethod
//	public void nameBefore(Method method)
//	{
//	    System.out.println("Test name: " + method.getName()); 
//	    methodName = method.getName();
//
//	}
//	
	
	@BeforeMethod
	@Parameters({"environment","browser"})
	public void fn_getParams(@Optional String env, String brows, Method method) throws IOException{
	    System.out.println("Test name: " + method.getName());
	    methodName = method.getName();
		System.out.println("called 1");
		this.oEnv = env;
		System.out.println("called from beforetest:::" + brows);
		this.oBrows = brows;
//		System.out.println("class Name:" + this.getClass().getSimpleName() + "...");
//		System.out.println("[][]" + this.oBrows.toString().toUpperCase().trim()+ "[][]");
//		System.out.println(Thread.currentThread().getStackTrace());
//		System.out.println("--------------------");
		fn_setLoadBrowser();
		fn_loadTestData();
//		fn_loadClasses(methodName);
		fn_loadClasses(methodName,BrowserDriver);

	}
	
	
	/*
	private void fn_loadClasses(String methodName2) {
		switch(methodName){
		case "BasicLoginLogout":
			System.out.println("Null Check before" + graLogout==null);

			graLogin = PageFactory.initElements(BrowserDriver, GRA_Login.class);
			graLogout = PageFactory.initElements(BrowserDriver, GRA_Logout.class);
			System.out.println("loaded from GRALOADER:::::::" + methodName);
			System.out.println("Null Check after" + graLogout==null);

			break;
			
	case "PlainVanila":
			System.out.println("Null Check before" + graLogout==null);
		graLogin = PageFactory.initElements(BrowserDriver, GRA_Login.class);
		graLogout = PageFactory.initElements(BrowserDriver, GRA_Logout.class);
		graTopNav = PageFactory.initElements(BrowserDriver, GRA_TopNav.class);
			System.out.println("loaded" + methodName);
			System.out.println("Null Check after" + graLogout==null);
	
		break;
		
		case "CreateNewBug":
			System.out.println("Null Check before" + graLogout==null);

			graLogin = PageFactory.initElements(BrowserDriver, GRA_Login.class);
			graLogout = PageFactory.initElements(BrowserDriver, GRA_Logout.class);
			graTopNav = PageFactory.initElements(BrowserDriver, GRA_TopNav.class);
			graCreateBug = PageFactory.initElements(BrowserDriver, GRA_CreateBug.class);
			System.out.println("loaded" + methodName);
			System.out.println("Null Check after" + graLogout==null);

		break;
		

		
		case "PlainSearch":
			
			graLogin = PageFactory.initElements(BrowserDriver, GRA_Login.class);
			graLogout = PageFactory.initElements(BrowserDriver, GRA_Logout.class);
			graTopNav = PageFactory.initElements(BrowserDriver, GRA_TopNav.class);
			System.out.println("loaded" + methodName);
			System.out.println("Null Check after" + graLogout==null);

		break;
		
		
		}
			
	}
*/
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
	
	
	
	@AfterMethod
	public void closeAllItems(){
		BrowserDriver.close();
		BrowserDriver = null;
		graLogin = null;
		graLogout = null;
		
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