package org.testng;
//crossbrowser
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.Baseclass;

public class Crossbrowser extends Baseclass{
	@Parameters({"browser"})
	@Test
	private void tc1(String name) {
		System.out.println("Launch chrome");
	if(name.equals("chrome")) {
		launchChrome();
	}
	else if(name.equals("ff")){
		launchfirefox();
	}
	else {
		launchEdge();
	}
	loadurl("https://www.thriftbooks.com/");

}

}
