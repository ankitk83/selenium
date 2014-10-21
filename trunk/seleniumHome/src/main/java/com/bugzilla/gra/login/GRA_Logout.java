package com.bugzilla.gra.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.bugzilla.gra.login.OR_LoginLib.*;

public class GRA_Logout {
	
	@FindBy(xpath=val_wl_logout)
	WebElement wl_logout;
	
	
	public GRA_Logout(WebDriver localDriver){
		PageFactory.initElements(localDriver, this);
	}
	
	public void fn_Logout(){
		wl_logout.click();
	}

}
