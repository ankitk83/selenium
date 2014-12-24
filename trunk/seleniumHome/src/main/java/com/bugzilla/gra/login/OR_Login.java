package com.bugzilla.gra.login;

import java.io.IOException;
import java.util.HashMap;

import com.bugzilla.controls.wrappers.WebEdit;
import com.bugzilla.global.values.StaticURLs;
import com.bugzilla.test.base.TestBase;

import static com.bugzilla.support.groups.StringUtil.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OR_Login {
	
	

	final public static String val_wl_login 	= "//li/a[@id='login_link_top']";
	final public static String val_we_username	= "//form/input[@id='Bugzilla_login_top']";
	final public static String val_we_password	= "//form/input[@id='Bugzilla_password_top']";
	final public static String val_wb_login		= "//form/input[@id='log_in_top']";
//	final public static String val_wl_logout	= "//li/a[contains(@href,'logout')]";
	final public static String val_wl_logout	= "//div[@id='common_links']/ul/li/a[@href='index.cgi?logout=1']";
	
	final public static String val_weel_loginWelcome = "//div[@id='welcome-admin']/p[contains(text(),'Welcome')]";


//	GRALoader cGlobalParams;
	
//	final WebDriver driver;
	TestBase PTL = new TestBase();
	
	//Login Link -- Login Page --s **
	@FindBy(xpath=val_wl_login)
	public WebElement wel_wl_login;
	
	@FindBy(xpath=val_we_username)
	private WebElement wel_we_username;
	
	@FindBy(xpath=val_we_password)
	private WebElement wel_we_password;
	
	@FindBy(xpath=val_wb_login)
	public WebElement wel_wb_login;
	
	@FindBy(xpath =val_weel_loginWelcome)
	public WebElement weel_txt_LoginWelcome;

	public WebEdit we_username;

	public WebEdit we_password;
	private WebEdit elem;
	
	@FindBy(xpath=val_wl_logout)
	WebElement wl_logout;
	
	
	
	public OR_Login(WebDriver localDriver){
//		this.driver = localDriver;
		PageFactory.initElements(localDriver, this);
//		System.out.println("****" + this.getClass().toString() + "*****");
		we_username = new WebEdit(wel_we_username);
		we_password = new WebEdit(wel_we_password);
//		we_username = new WebEdit(wel_we_username);
		
		

	}
	
//	public WebEdit we_username(){
//		we_username = new WebEdit(driver.findElement(By.xpath(val_we_username)));
//		return we_username;
//	}
}