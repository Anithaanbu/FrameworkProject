package org.pom;
//mouseover books,click animals and get the title of firstbook using pojoclass
import org.openqa.selenium.WebElement;
import org.utility.Baseclass;
import org.utility.Mouseoverpojo;

public class Mouseoverpom extends Baseclass{
	public static void main(String[] args) {
		launchChrome();
		loadurl("https://www.thriftbooks.com/");
		winmax();
		Mouseoverpojo p=new Mouseoverpojo();
		WebElement books = p.getBooks();
		mouseover(books);
		WebElement animals = p.getAnimals();
		btnclick(animals);
		WebElement text = p.getText();
		text(text);
		
		
		
	}

}
