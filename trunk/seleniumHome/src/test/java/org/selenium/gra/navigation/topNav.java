package org.selenium.gra.navigation;

import static org.selenium.properties.ObjectPropertiesXPATH.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class topNav {
	
	
	@FindBy(xpath = wl_desc_project)
	private WebElement wl_project; 

	
	public void click_project(){
		wl_project.click();
	}
	
	
	
}
