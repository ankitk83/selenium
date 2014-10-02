package com.bugzilla.gra.nav.TopNav;

import static com.bugzilla.repository.Nav.TopNav.OR_TopNav.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GRA_TopNav {
	
	@FindBy(xpath=val_wl_newBug)
	WebElement wl_newBug;
	
	public void fn_navigateToNewBug(){
		wl_newBug.click();
	}

}
