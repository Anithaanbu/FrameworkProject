package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Baseclass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert b;
	public static Select s;
	public static WebDriverWait w;
	public static FluentWait<WebDriver> f;
//1
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
//2
	public static void loadurl(String url) {
		driver.get(url);
	}
//3
	public static void printCurrentturl() {
		System.out.println(driver.getCurrentUrl());
	}
//4
	public static void winmax() {
		driver.manage().window().maximize();
	}
//5
	public static void printTitle() {
	System.out.println(driver.getTitle());
	}
//6
	public static void fill(WebElement ele,String value) {
		ele.sendKeys(value);
	}
//7
	public static void btnclick(WebElement ele) {
		ele.click();	
	}
//8
	public static void launchfirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
//9
	public static void launchEdge() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
//10
	public static void closeBrowser() {
		driver.close();	
	}
//11
	public static void printurl() {
		System.out.println(driver.getCurrentUrl());
		}
//12
	public static void quitBrowser() {
		driver.quit();
	}
//13
	public static void text(WebElement ele) {
		System.out.println(ele.getText());
	}
//14
	public static void attribute(WebElement ele) {
		System.out.println(ele.getAttribute("Value"));	
	}
//15
	public static void rightclick(WebElement ele) {
		a=new Actions(driver);
		a.contextClick(ele).perform();	
	}
//16
	public static void mouseover(WebElement ele) {
		a=new Actions(driver);
		a.moveToElement(ele).perform();	
	}
//17
	public static void drag(WebElement src,WebElement des) {
		a=new Actions(driver);
		a.dragAndDrop(src,des).perform();	
	}
//18
	public static void select(WebElement ele) {
		a=new Actions(driver);
		a.doubleClick(ele).perform();	
	}
//19
	public static void up() {
		a=new Actions(driver);
	    a.keyUp(Keys.SHIFT).perform();	
	}
//20
	public static void down() {
		a=new Actions(driver);
	    a.keyDown(Keys.SHIFT).perform();	
	}
//21
	public static void press() throws AWTException {
		r=new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);		
	}
//22
	public static void pressup() throws AWTException {
		r=new Robot();
	    r.keyPress(KeyEvent.VK_UP);		
	}
//21
	public static void release () throws AWTException {
		r=new Robot();
	    r.keyRelease(KeyEvent.VK_DOWN);		
	}
//22
	public static void releaseup () throws AWTException {
		r=new Robot();
	    r.keyRelease(KeyEvent.VK_UP);		
	}
//23
	public static void pressE() throws AWTException {
		r=new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);		
	}
//24
	public static void releaseE() throws AWTException {
		r=new Robot();
	    r.keyRelease(KeyEvent.VK_ENTER);		
	}
//25
	public static void alertAccept() {
	b=driver.switchTo().alert();
	b.accept();
	}
//26
	public static void alertdismiss() {
		b=driver.switchTo().alert();
		b.dismiss();
		}
//27
	public static void alertsendkeys() {
		b=driver.switchTo().alert();
		b.sendKeys("value");
	}
//28
	public static void alertgettext() {
		b=driver.switchTo().alert();
		String text = b.getText();
		System.out.println(text);
	}
//29
	public static void screen() throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("");
		FileUtils.copyFile(src, des);
	}
//30
	public static void jscripttxtpass(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value',value we want to enter)",ele);
	}
//31
	public static void jscripttext(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object o = js.executeScript("return arguments[0].getAttribute('value')",ele);
		String s= (String)o;
		System.out.println(s);		
	}
//32
	public static void jscriptclick(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click",ele);
	}
//33
	public static void jscriptscroll(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",ele);
	}
//34
	public static void jscriptscrollup(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
	}
//35
	public static void frame(WebElement ref) {
		driver.switchTo().frame(ref);	
	}
//36
	public static void frame(String id) {
		driver.switchTo().frame(id);	
	}
//37
	public static void frames(String name) {
		driver.switchTo().frame(name);	
	}
//38
	public static void frames(int index) {
		driver.switchTo().frame(index);	
	}
//39
	public static void frames() {
		driver.switchTo().parentFrame();	
	}
//40
	public static void frame() {
		driver.switchTo().defaultContent();
	}
//41
	public static void winparent() {
		String parentId = driver.getWindowHandle();
	}
//42
	public static void winall() {
		String parentId = driver.getWindowHandle();
		 Set<String> allwindowsId = driver.getWindowHandles();
		 for(String each:allwindowsId) {
			 if(!parentId.equals(each)) {
				 driver.switchTo().window(each);			 
			 }
		 }
	}
//43
	public static void window(String windowsId) {
		driver.switchTo().window(windowsId);	
	}
//44
	public static void drop(WebElement ref) {
		s=new Select(ref);
		boolean a = s.isMultiple();
		System.out.println(a);
	}
//45
	public static void dropvalue(WebElement ref,String value) {
		s=new Select(ref);
		s.selectByValue(value);
	}
//46
	public static void droptext(WebElement ref,String text) {
		s=new Select(ref);
		s.selectByVisibleText(text);
	}
//47
	public static void dropindex(WebElement ref,int index) {
		s=new Select(ref);
		s.selectByIndex(index);
	}
	
//48
	public static void dropoptions(WebElement ref,int index) {
		s=new Select(ref);
	    List<WebElement> alloptions = s.getOptions();
	    for(WebElement each:alloptions) {
	    	System.out.println(each.getText()); 	
	    }
	}
//49
	public static void seloptions(WebElement ref,int index) {
		s=new Select(ref);
	    List<WebElement> allSelOptions = s.getAllSelectedOptions();
	    for(WebElement each:allSelOptions) {
	    	System.out.println(each.getText()); 	
	    }   
	}
//50
	public static void firstseloptions(WebElement ref,int index) {
		s=new Select(ref);
	     WebElement o = s.getFirstSelectedOption();
	    	System.out.println(o); 	
	}
//51	
	public static void deselval(WebElement ref,String value) {
		s=new Select(ref);
		s.deselectByValue(value);
	}
//52
	public static void deseltext(WebElement ref,String text) {
		s=new Select(ref);
		s.deselectByVisibleText(text);
	}
//53
	public static void deselindex(WebElement ref,int index) {
		s=new Select(ref);
		s.deselectByIndex(index);
	}
//54
	public static void deselall(WebElement ref) {
		s=new Select(ref);
		s.deselectAll();
	}
//55
	public static void alertpresent(WebElement ref) {
		w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.alertIsPresent());
		b=driver.switchTo().alert();
		b.accept();	
	}
//56
	public static void implicit() {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
	
//57
	public static void frameavailable(WebElement ref) {
		w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ref));
		driver.switchTo().frame(ref);
	}
//58
	public static void elementclickabble(WebElement ref) {
		w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(ref));
	}
//59
	public static void fluentalert(WebElement ref) {
		f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
		f.until(ExpectedConditions.alertIsPresent());
		b=driver.switchTo().alert();
		b.accept();	
	}
//60
	public static void fluent(WebElement ref,String ref1) {
		FluentWait<WebDriver>f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
		f.until(ExpectedConditions.invisibilityOfElementLocated(By.name(ref1)));
	}
//61
	public static String getData(int rval,int cval,String val) throws IOException  {
		File f = new File("F:\\eclipse-workspace\\FrameworkProject\\src\\test\\resources\\TestData\\data.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet s= w.getSheet(val);
		Row r=s.getRow(rval);
		Cell c=r.getCell(cval);
		int CellType=c.getCellType();
		String value="";
		if(CellType==1) {
        	 value = c.getStringCellValue();
        }
        else if (DateUtil.isCellDateFormatted(c)) {	
        	Date d = c.getDateCellValue();
        	SimpleDateFormat sim = new SimpleDateFormat("dd,MMM,YYYY");
        	 value = sim.format(d);
        	System.out.println(value);
        	 }
        else {
        	double d = c.getNumericCellValue();
        	long l=(long)d;
        	 value=String.valueOf(l);
	}
		return value;
	}
//62	
	public static void createexcel(String sval,int rval,int cval,String setvalue ) throws IOException {
			File f=new File("F:\\eclipse-workspace\\FrameworkProject\\src\\test\\resources\\TestData\\data.xlsx");
			boolean a = f.createNewFile();
			System.out.println(a);
			Workbook w=new XSSFWorkbook();
			Sheet s=w.getSheet(sval);
			Row r=s.createRow(rval);
			Cell c=r.createCell(cval);
			c.setCellValue(setvalue);
			FileOutputStream fout=new FileOutputStream(f);
			w.write(fout);
			System.out.println("success");
		}
	
	
}

	
	


