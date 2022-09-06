package org.testng;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.Baseclass;
import org.utility.Loginpojo;

public class Paralleltestng extends Baseclass{
	@BeforeClass
	private void browser() {
		launchChrome();
		winmax();
	}
	@AfterClass
	private void browserclose() {
		closeBrowser();
	}
//valid username and invalid password
	@Test(priority=-5,invocationCount=2)
	private void tc33() throws IOException, InterruptedException {
		long id=Thread.currentThread().getId();
		System.out.println("Test33:"+id);
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		fill(p.getTxtuser(),getData(2,0,"sheet2"));
		fill(p.getTxtpass(),getData(2,1,"sheet2"));
		//btnclick(p.getBtnlogin());
		Thread.sleep(2000);	
	}
//valid username and invalid password
	@Test(priority=2,enabled=false)
	private void tc22() throws IOException, InterruptedException {
		System.out.println("Test 22:"+Thread.currentThread().getId());
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		fill(p.getTxtuser(),getData(1,0,"sheet2"));
		fill(p.getTxtpass(),getData(1,1,"sheet2"));
		//btnclick(p.getLogin());
		Thread.sleep(2000);	
	}
//valid username and invalid password
	@Test(priority=-2)
	private void tc11() throws IOException, InterruptedException {
		System.out.println("Test 11:"+Thread.currentThread().getId());
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		fill(p.getTxtuser(),getData(3,0,"sheet2"));
		fill(p.getTxtpass(),getData(3,1,"sheet2"));
		//btnclick(p.getLogin());
		Thread.sleep(2000);	
		}
//valid username and invalid password
	@Test(priority=4)
	private void tc55() throws IOException, InterruptedException {
		System.out.println("Test 55:"+Thread.currentThread().getId());
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		fill(p.getTxtuser(),getData(5,0,"sheet2"));
		fill(p.getTxtpass(),getData(5,1,"sheet2"));
		//btnclick(p.getLogin());
		Thread.sleep(2000);	
			}
//valid username and invalid password
	@Test(priority=5)
	private void tc44() throws IOException, InterruptedException {
		System.out.println("Test 44:"+Thread.currentThread().getId());
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		fill(p.getTxtuser(),getData(4,0,"sheet2"));
		fill(p.getTxtpass(),getData(4,1,"sheet2"));
		//btnclick(p.getLogin());
		Thread.sleep(2000);	
			}
@BeforeMethod
private void start(){
	System.out.println(new Date());
	loadurl("https://www.thriftbooks.com/");
}
@AfterMethod
private void end(){
	System.out.println(new Date());
}

	
	
	
	

}
