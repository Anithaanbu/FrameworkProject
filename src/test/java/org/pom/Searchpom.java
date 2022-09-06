package org.pom;
//1.1search by passing value from excel using pojo class.select the cost of a book.right click and select inspect
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.utility.Baseclass;
import org.utility.Homepojo;
	public class Searchpom extends Baseclass{
	 
		public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		launchChrome();
		loadurl("https://www.thriftbooks.com/" );
		winmax();
		Homepojo p=new Homepojo();
		fill(p.getSearchtxt(), getData(1,2,"thrift"));
		
		WebElement click = p.getBtnlogin();
		btnclick(click);
		WebElement scroll = p.getScroll();
		jscriptscrollup(scroll);
		WebElement inspect = p.getInspect();
		select(inspect);
	rightclick(inspect);
		for(int i=0;i<5;i++) {
			press();
			release();
		}
		pressE();
	releaseE();
	


	}}



