package org.testng;
import java.io.IOException;

//crossbrowser
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.Baseclass;
import org.utility.Loginpojo;

public class Crossbrowser extends Baseclass{
	@Parameters({"browser"})
	@Test
	private void tc1(String name) throws IOException, InterruptedException {
		
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
