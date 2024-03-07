package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utility.Log;
import org.testng.Reporter;
public class General extends Global {
//reusable functions
	public void openApplication()
	{
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("App opened");
		  Log.info("App opened");
	}
	public void closeApplication()
	{
		driver.quit();
		System.out.println("App closed");
		Log.info("App closed");
	}
	public void login()
	{
		driver.findElement(By.name(txt_Username)).sendKeys(un);
		driver.findElement(By.name(txt_Password)).sendKeys(pwd);
		driver.findElement(By.name(btn_Login)).click();
		System.out.println("Login done");
		Log.info("Login done");
		
	}
	public void logout() {
		driver.findElement(By.linkText(link_Logout));
		System.out.println("Logout done");
		Log.info("Logout done");
	}
	
	public void addEmployee()
	{
		driver.findElement(By.xpath(btn_Add)).click();;
		driver.findElement(By.name(txt_efname)).sendKeys(efn);
		driver.findElement(By.name(txt_elname)).sendKeys(eln);
		driver.findElement(By.id(btn_Save)).click();
		System.out.println("Employee added");
		Log.info("Employee added");
	}
	
	public void enterFrame()
	{
		driver.switchTo().frame(frame_name);
		System.out.println("Frame enter");
		Log.info("Frame enter");
	}
	
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Frame exit");
		Log.info("Frame exit");
	}
}
