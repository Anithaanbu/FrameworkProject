package org.pom;
//mouseover collectiblebooks and click signed books.select first book,click add to cart and print the cost of the book
import org.openqa.selenium.WebElement;
import org.utility.Addcartpojo;
import org.utility.Baseclass;

public class Addcartpom extends Baseclass{
	public static void main(String[] args) throws InterruptedException {
		launchChrome();
		loadurl("https://www.thriftbooks.com/");
		winmax();
		Addcartpojo p=new Addcartpojo();
		WebElement collectiblebooks = p.getCollectiblebooks();
		mouseover(collectiblebooks);
		WebElement signedbooks = p.getSignedbooks();
		btnclick(signedbooks);
		
		winparent();
		winall();
		implicit();
		WebElement selbook = p.getSelbook();
		btnclick(selbook);
		implicit();
		winparent();
		winall();
		WebElement addtocart = p.getAddtocart();
		btnclick(addtocart);
		WebElement viewcart = p.getViewcart();
		btnclick(viewcart);
		WebElement cost = p.getCost();
		text(cost);
		
	}

}
