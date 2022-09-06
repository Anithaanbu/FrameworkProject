 package org.pom;
//2.2login using pojoclass2.1
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.utility.Baseclass;
import org.utility.Loginpojo;

public class Loginpom extends Baseclass{
	public static void main(String[] args) throws IOException, InterruptedException {
		launchChrome();
		
		loadurl("https://www.thriftbooks.com/" );
		winmax();
		Thread.sleep(9000);
		Loginpojo p=new Loginpojo();
		WebElement login = p.getBtnlogin();
		btnclick(login);
		WebElement txtuser = p.getTxtuser();
		fill(txtuser,getData(1,0,"thrift"));
		WebElement txtpass = p.getTxtpass();
		fill(txtpass,getData(1,1,"thrift"));
		//WebElement loginto = p.getLogin();
		//btnclick(loginto);
		
	}
	

}
