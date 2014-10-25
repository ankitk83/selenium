
package com.bugzilla.gra.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OR_LoginLib {


	final public static String val_wl_login 	= "//li/a[@id='login_link_top']";
	final public static String val_we_username	= "//form/input[@id='Bugzilla_login_top']";
	final public static String val_we_password	= "//form/input[@id='Bugzilla_password_top']";
	final public static String val_wb_login		= "//form/input[@id='log_in_top']";
//	final public static String val_wl_logout	= "//li/a[contains(@href,'logout')]";
	final public static String val_wl_logout	= "//div[@id='common_links']/ul/li/a[@href='index.cgi?logout=1']";
}
