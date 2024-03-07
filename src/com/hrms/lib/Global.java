package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	
	WebDriver driver;
//Test data and objects/elements
	//*******Test Data
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pwd = "nareshit";
	public String efn = "Ritu";
	public String eln = "Hedau";
	
	//********Objects/Elements
	public String btn_Login = "Submit";
	public String txt_Username = "txtUserName";
	public String txt_Password = "txtPassword";
	public String link_Logout = "Logout";
	public String frame_name = "rightMenu";
	public String btn_Add = "//input[@value='Add']";
	public String txt_efname = "txtEmpFirstName";
	public String txt_elname = "txtEmpLastName";
	public String btn_Save = "btnEdit";
}
