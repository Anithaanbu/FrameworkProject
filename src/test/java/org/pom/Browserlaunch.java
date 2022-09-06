package org.pom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utility.Baseclass;
public class Browserlaunch extends Baseclass {
	public static void main(String[] args) throws IOException, InterruptedException {
		launchChrome();
		Thread.sleep(3000);
		loadurl("https://www.thriftbooks.com/" );
		Thread.sleep(15000);
		winmax();
		
		  
		WebElement log = driver.findElement(By.xpath("//div[@class='UserComponent-login']"));
		btnclick(log);
		Thread.sleep(300);
		winall();
		
		
		WebElement txtUsr = driver.findElement(By.name("ExistingAccount.EmailAddress"));
		fill(txtUsr,getData(2,0, "thrift"));
	
		rightclick(txtUsr);
		WebElement txtpass = driver.findElement(By.xpath("//input[@id='OldAccountPassword']"));
		fill(txtpass,getData(2,1,"thrift"));
		select(txtpass);
		
		
		
	}

}
