package org.pom;
//dropdown and robotclass
//mouseover music click New realeases,select bestseller in dropdown and click the micheal jackson book and print the text
import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.utility.Baseclass;
import org.utility.Robotpojo;

public class Robotpom extends Baseclass{
	public static void main(String[] args) throws AWTException, InterruptedException {
		launchChrome();
		loadurl("https://www.thriftbooks.com/");
		winmax();
		Robotpojo p=new Robotpojo();
		WebElement music = p.getMusic();
		mouseover(music);
		WebElement newrelease = p.getNewrelease();
		btnclick(newrelease);
		WebElement dropdown = p.getDropdown();
		btnclick(dropdown);
		for(int i=0;i<3;i++) {
			pressup();
			releaseup();
		}
		pressE();
		Thread.sleep(1000);
		WebElement scroll = p.getScroll();
		jscriptscroll(scroll);
		WebElement sbook = p.getSbook();
		Thread.sleep(500);
		btnclick(sbook);
		WebElement text = p.getText();
		text(text);
		
		
		
	}
	

}
