package org.utility;
//2.pojoclass for loginpage 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Baseclass;

public class Loginpojo extends Baseclass{
	public Loginpojo() {
		PageFactory.initElements(driver, this);
	}
//2.private webelement
	@FindBy(xpath="//div[text()='Log In']")
	private WebElement btnlogin;
	
	@FindBy(xpath="//input[@name='ExistingAccount.EmailAddress']")
	private WebElement txtuser;
	@FindBy(xpath="//input[@name='ExistingAccount.Password']")
	private WebElement txtpass;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;
	
	
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getLogin() {
		return login;
	}



}
