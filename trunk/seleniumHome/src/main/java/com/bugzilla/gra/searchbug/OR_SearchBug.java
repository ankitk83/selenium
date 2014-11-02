package com.bugzilla.gra.searchbug;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bugzilla.controls.wrappers.WebList;


public class OR_SearchBug {
	
	final public static String val_we_bugStatus		= "//tr/td/select[@id='bug_status']";
	final public static String val_lst_bugStatus	= "//tr/td/select[@id='bug_aastatus']";
	final public static String val_wb_search 		= "//td/input[@id='search']";
//													   tr/td/select[@id='bug_status']
	

	@FindBy(xpath=val_we_bugStatus)
	public WebElement wel_lst_bugStatus;
	
	@FindBy(xpath=val_lst_bugStatus)
	public WebElement wel_lst_bugStatuss;
	
	
	
	@FindBy(xpath=val_wb_search)
	public WebElement wel_wb_search;
	
	public WebList lst_bugStatus;// = new Select(wel_lst_bugStatus);
	public WebList lst_bugStatuss;// = new Select(wel_lst_bugStatus);
	
	public OR_SearchBug(WebDriver localDriver){
		PageFactory.initElements(localDriver, this);
//		lst_bugStatus = new Select();
		lst_bugStatus = new WebList(wel_lst_bugStatus);
		lst_bugStatuss = new WebList(wel_lst_bugStatuss);
	}
	

}
