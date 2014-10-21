package com.bugzilla.gra.nav.TopNav;

import static com.bugzilla.gra.nav.TopNav.OR_TopNav.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GRA_TopNav {
	
	@FindBy(xpath=val_wl_newBug)
	WebElement wl_newBug;
	@FindBy(xpath=val_wl_search)
	WebElement wl_search;
	
	public GRA_TopNav(WebDriver localDriver){
		PageFactory.initElements(localDriver, this);
	}
	
	public void fn_searchBugs(){
		wl_search.click();
	}
	
	public void fn_navigateToNewBug(){
		wl_newBug.click();
	}

}
