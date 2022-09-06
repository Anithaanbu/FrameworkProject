package org.utility;
//mouseover books,click animals and get the title of firstbook using pojoclass
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Baseclass;

public class Mouseoverpojo extends Baseclass {
	public Mouseoverpojo() {
		PageFactory.initElements(driver, this);
	}
      @FindBy(xpath="//a[text()='Books']")
	     private WebElement books;
      @FindBy(xpath="//a[text()='Animals']")
	     private WebElement animals;
      @FindBy(xpath="//div[text()='If You Give a Mouse a Cookie']")
	     private WebElement text;
     
	public WebElement getBooks() {
		return books;
	}
	public WebElement getAnimals() {
		return animals;
	}
	public WebElement getText() {
		return text;
	}
      
      
     

}
