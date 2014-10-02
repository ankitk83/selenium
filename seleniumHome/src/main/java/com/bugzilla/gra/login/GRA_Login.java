package com.bugzilla.gra.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bugzilla.repository.login.OR_LoginLib.*;
public class GRA_Login {
	
	
	//Login Link -- Login Page --s **
	@FindBy(xpath=val_wl_login)
	public WebElement wl_login;
	
	@FindBy(xpath=val_we_username)
	public WebElement we_username;
	
	@FindBy(xpath=val_we_password)
	public WebElement we_password;
	
	@FindBy(xpath=val_wb_login)
	public WebElement wb_login;
	
	public void fn_plainLogin(){
		wl_login.click();
		we_username.sendKeys("ankit.kapoor83@gmail.com");
		we_password.sendKeys("password");
		wb_login.click();
	}
	
	
	
}
