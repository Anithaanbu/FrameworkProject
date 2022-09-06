package org.utility;
//1.pojo class for homepage search
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Baseclass;

public class Homepojo extends Baseclass {
	//1.Non parametrized constructor
	public Homepojo() {
		PageFactory.initElements(driver, this);
	}
//2.private webelement
	@FindBy(xpath="//input[@class='Search-input is-empty']")
	private WebElement searchtxt;
	
	@FindBy(xpath="//button[@class='Button']")
	private WebElement btnlogin;
	@FindBy(xpath="//div[text()='8.39']")
	private WebElement scroll;
	@FindBy(xpath="//div[text()='8.39']")
	private WebElement inspect;
	

	public WebElement getSearchtxt() {
		return searchtxt;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}


	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getInspect() {
		return inspect;
	}
	
	 
	

}


