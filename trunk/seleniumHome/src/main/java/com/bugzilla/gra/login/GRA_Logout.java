package com.bugzilla.gra.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.bugzilla.gra.login.OR_LoginLib.*;

public class GRA_Logout {
	
	@FindBy(xpath=val_wl_logout)
	WebElement wl_logout;
	
	public void fn_Logout(){
		wl_logout.click();
	}

}
