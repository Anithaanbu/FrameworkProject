package org.testng;
//priority,groups,rerun
import java.io.IOException;
import java.util.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.Baseclass;
import org.utility.Loginpojo;


public class Logintestng extends Baseclass{
	@BeforeClass(alwaysRun=true)
	private void browser() {
		launchChrome();
		winmax();
	}
	@AfterClass
	private void browserclose() {
		closeBrowser();
	}
//valid username and invalid password
	@Test(priority=-5,invocationCount=2,groups= {"smoke","fruit"})
	private void tc3() throws IOException, InterruptedException {
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		fill(p.getTxtuser(),getData(2,0,"sheet2"));
		fill(p.getTxtpass(),getData(2,1,"sheet2"));
		//btnclick(p.getBtnlogin());
		Thread.sleep(2000);	
	}
//valid username and invalid password
	@Test(priority=2,enabled=false,groups="sanity")
	private void tc2() throws IOException, InterruptedException {
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		fill(p.getTxtuser(),getData(1,0,"sheet2"));
		fill(p.getTxtpass(),getData(1,1,"sheet2"));
		//btnclick(p.getLogin());
		Thread.sleep(2000);	
	}
//valid username and invalid password
	@Test(priority=-2,groups="sanity")
	private void tc1() throws IOException, InterruptedException {
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		fill(p.getTxtuser(),getData(3,0,"sheet2"));
		fill(p.getTxtpass(),getData(3,1,"sheet2"));
		//btnclick(p.getLogin());
		Thread.sleep(2000);	
		}
//valid username and invalid password
	@Test(priority=4,groups="smoke",retryAnalyzer=Failed.class)
	private void tc5() throws IOException, InterruptedException {
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		Assert.assertTrue(false, "checking");
		fill(p.getTxtuser(),getData(5,0,"sheet2"));
		fill(p.getTxtpass(),getData(5,1,"sheet2"));
		//btnclick(p.getLogin());
		Thread.sleep(2000);	
			}
//valid username and invalid password
	@Test(priority=5,groups="smoke")
	private void tc4() throws IOException, InterruptedException {
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		fill(p.getTxtuser(),getData(4,0,"sheet2"));
		fill(p.getTxtpass(),getData(4,1,"sheet2"));
		//btnclick(p.getLogin());
		Thread.sleep(2000);	
			}
@BeforeMethod(alwaysRun=true)
private void start(){
	System.out.println(new Date());
	loadurl("https://www.thriftbooks.com/");
}
@AfterMethod
private void end(){
	System.out.println(new Date());
}

}



