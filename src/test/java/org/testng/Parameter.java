package org.testng;
//parameter, dataprovider,Grouping
import java.io.IOException;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utility.Baseclass;
import org.utility.Loginpojo;

public class Parameter extends Baseclass{
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
		Assert.assertTrue(false, "checking");
		fill(p.getTxtpass(),getData(2,1,"sheet2"));
		//btnclick(p.getBtnlogin());
		Thread.sleep(2000);	
	}
//valid username and invalid password
	@Test(priority=7,dataProvider="loginData",groups="sanity")
	private void tc2(String s1,String s2) throws IOException, InterruptedException {
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		fill(p.getTxtuser(),s1);
		fill(p.getTxtpass(),s2);
		//btnclick(p.getLogin());
		Thread.sleep(2000);	
	}
//valid username and invalid password
	@Parameters({"thrift","fruits"})
	@Test(priority=-1,groups="smoke")
	private void tc1(String s1,String s2) throws IOException, InterruptedException {
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		fill(p.getTxtuser(),s1);
		fill(p.getTxtpass(),s2);
		//btnclick(p.getLogin());
		Thread.sleep(2000);	
		}
//valid username and invalid password
	@Parameters({"crckt","fruit"})
	@Test(priority=4,groups="sanity")
	private void tc4(@Optional("selenium")String s1,@Optional("grapes")String s2) throws IOException, InterruptedException {
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		fill(p.getTxtuser(),s1);
		fill(p.getTxtpass(),s2);
		//btnclick(p.getLogin());
		Thread.sleep(2000);	
			}
//valid username and invalid password
	
	@Test(groups="smoke")
   	private void tc5() throws IOException, InterruptedException {
		SoftAssert s=new SoftAssert();
		s.assertTrue(false, "Testing");
		System.out.println("pass");
		Loginpojo p=new Loginpojo();
		btnclick(p.getBtnlogin());
		s.assertAll();
		fill(p.getTxtuser(),getData(5,0,"sheet2"));
		fill(p.getTxtpass(),getData(5,1,"sheet2"));
	//	btnclick(p.getLogin());
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

@DataProvider(name="loginData")
private Object[][] Data(){
	return new Object[][] {
		{"greens","greens@123"},
		{"sql","sql@123"}
		
	};
}

}



