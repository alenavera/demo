package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class Facebook_objects {
	private WebDriver driver;
	Facebook_objects (){
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="//input[@id='mailbox:login-input']")
	WebElement email;
	@FindBy(className="input[@class='o-control']")
	WebElement sub;
	
	@FindBy(id="//input[@id='mailbox:password-input']")
	WebElement pwd;
	
	void send(String em,String pw) {
		
		email.sendKeys(em);
		sub.click();
		pwd.sendKeys(pw);
		sub.click();
	}
}
