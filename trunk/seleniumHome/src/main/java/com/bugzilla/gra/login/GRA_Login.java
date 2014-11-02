package com.bugzilla.gra.login;

import java.io.IOException;
import java.util.HashMap;

import com.bugzilla.controls.wrappers.WebEdit;
import com.bugzilla.global.values.StaticURLs;
import com.bugzilla.support.groups.PreTestLoader;

import static com.bugzilla.support.groups.StringUtil.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static com.bugzilla.gra.login.OR_LoginLib.*;

public class GRA_Login {
	
//	GRALoader cGlobalParams;
	
//	final WebDriver driver;
	PreTestLoader PTL = new PreTestLoader();
	
	//Login Link -- Login Page --s **
	@FindBy(xpath=val_wl_login)
	public WebElement wel_wl_login;
	
	@FindBy(xpath=val_we_username)
	private WebElement wel_we_username;
	
	@FindBy(xpath=val_we_password)
	private WebElement wel_we_password;
	
	@FindBy(xpath=val_wb_login)
	public WebElement wel_wb_login;

	public WebEdit we_username;

	public WebEdit we_password;
	private WebEdit elem;
	
	
	public GRA_Login(WebDriver localDriver){
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