package com.bugzilla.gra.createbug;

import static com.bugzilla.gra.createbug.OR_CreateBug.*;

import com.bugzilla.support.groups.PreTestLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GRA_CreateBug {


	@FindBy(xpath=val_we_bugSummary)
	WebElement we_bugSummary;
	
	@FindBy(xpath=val_we_bugDescription)
	WebElement we_bugDescription;
	
	@FindBy(xpath=val_wb_submitBug)
	WebElement wb_submitBug;
	
	public GRA_CreateBug(WebDriver localDriver){
		PageFactory.initElements(localDriver, this);
		System.out.println("****" + this.getClass().toString() + "*****");

	}
	
	public void fn_CreateBug(){
		we_bugSummary.sendKeys("blank val for now");
		we_bugDescription.sendKeys("test description");
		wb_submitBug.click();
		
	}

}
