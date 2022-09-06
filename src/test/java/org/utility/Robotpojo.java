package org.utility;
//mouseover music click New realeases,select bestseller in dropdown and click the 1st book
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Baseclass;

public class Robotpojo extends Baseclass{
	public Robotpojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Music']")
	private WebElement music;
	@FindBy(xpath="(//a[text()='New Releases'])[1]")
	private WebElement newrelease;
	@FindBy(id="Search-sortBar-sortby-description")
	private WebElement dropdown;
	@FindBy(xpath="//p[text()='The Very Best of Jackson Browne']")
	private WebElement scroll;
	@FindBy(xpath="//p[text()='The Essential Michael Jackson']")
	private WebElement sbook;
	@FindBy(xpath="//h1[text()='Essential Michael Jackson']")
	private WebElement text;
	
	public WebElement getMusic() {
		return music;
	}
	public WebElement getNewrelease() {
		return newrelease;
	}
	public WebElement getDropdown() {
		return dropdown;
	}
	public WebElement getSbook() {
		return sbook;
	}
	public WebElement getScroll() {
		return scroll;
	}
	public WebElement getText() {
		return text;
	}

}
