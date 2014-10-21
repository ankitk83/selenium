package com.bugzilla.gra.login;

import java.io.IOException;
import java.util.HashMap;

import com.bugzilla.support.groups.StaticURLs;
import com.bugzilla.support.groups.PreTestLoader;

import static com.bugzilla.support.groups.StringUtil.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.bugzilla.gra.login.OR_LoginLib.*;
public class GRA_Login {
	
	PreTestLoader PTL = new PreTestLoader();
	
	//Login Link -- Login Page --s **
	@FindBy(xpath=val_wl_login)
	public WebElement wl_login;
	
	@FindBy(xpath=val_we_username)
	public WebElement we_username;
	
	@FindBy(xpath=val_we_password)
	public WebElement we_password;
	
	@FindBy(xpath=val_wb_login)
	public WebElement wb_login;
	
	
	public GRA_Login(WebDriver localDriver){
		PageFactory.initElements(localDriver, this);
	}
	
	public void fn_plainLogin(HashMap m1){
//		String username = fn_fetchStringFromMap;
		String UserName = (String) m1.get("UserName");
		String Password = (String) m1.get("Password");
		
		wl_login.click();
		we_username.sendKeys(UserName);
		we_password.sendKeys(Password);
		wb_login.click();
		
	}
	
	
	
}
