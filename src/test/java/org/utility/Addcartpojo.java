package org.utility;
//mouseover collectiblebooks and click signed books.select first book,click add to cart and print the cost of the book
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Baseclass;

public class Addcartpojo extends Baseclass{
	public Addcartpojo(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Collectible Books']")
	private WebElement collectiblebooks;
	@FindBy(xpath="//a[text()='Signed Books']")
	private WebElement signedbooks;
	
	@FindBy(xpath="//p[text()='Dune']")
	private WebElement selbook;
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement addtocart;
	@FindBy(xpath="//a[text()='View Cart']")
	private WebElement viewcart;
	
	@FindBy(xpath="//span[text()='672.00']")
	private WebElement cost;

	public WebElement getCollectiblebooks() {
		return collectiblebooks;
	}

	public WebElement getSignedbooks() {
		return signedbooks;
	}

	public WebElement getSelbook() {
		return selbook;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getViewcart() {
		return viewcart;
	}

	public WebElement getCost() {
		return cost;
	}
	

}
