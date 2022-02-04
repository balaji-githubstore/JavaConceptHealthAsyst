package com.healthasyst.oops;

import com.healthasyst.encaps.Student;

interface WebDriver
{
	void quit();
	String getTitle();
	public abstract void close();
	void getCurrentUrl();
}
interface TakeScreenshot
{
	void getScreenshot();
}
interface JavaScriptExecutor
{
	void executeScrip();
}
class ChromeDriver implements WebDriver,TakeScreenshot,JavaScriptExecutor
{
	public ChromeDriver()
	{
		System.out.println("launch chrome");
	}
	public void quit()
	{
		System.out.println("close the chrome browser");
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getCurrentUrl() {
		// TODO Auto-generated method stub
		
	}
	
	public void chromeDemo()
	{
		System.out.println("chrome demo");
	}
	@Override
	public void getScreenshot() {
		System.out.println("take screen ch shot");
		
	}
	@Override
	public void executeScrip() {
		// TODO Auto-generated method stub
		
	}
}

class FirefoxDriver implements WebDriver, TakeScreenshot, JavaScriptExecutor
{
	public FirefoxDriver()
	{
		System.out.println("firefox browser");
	}
	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getCurrentUrl() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getScreenshot() {
		System.out.println("take screen shot ff");
		
	}
	@Override
	public void executeScrip() {
		// TODO Auto-generated method stub
		
	}
	
}

public class BrowserTest {
	
	public static void main(String[] args) {
		
//		WebDriver driver =new ChromeDriver();
//		driver.quit(); //Method to be called is resolved during run time.
		
		String browser="ch";
//		WebDriver driver=null;
//		
//		if(browser.equalsIgnoreCase("ch"))
//		{
//			driver=new ChromeDriver(); //launch browser
//		}
//		else
//		{
//			driver=new FirefoxDriver(); 
//		}
		
		WebDriver driver=new FirefoxDriver();
		
		driver.quit();
		driver.close();
		driver.getCurrentUrl();
		driver.getTitle();
		
		TakeScreenshot ts= (TakeScreenshot) driver;
		ts.getScreenshot();
		
		
//		ChromeDriver d=(ChromeDriver) driver;
//		d.chromeDemo();
		
		JavaScriptExecutor js=(JavaScriptExecutor) driver;
		js.executeScrip();
		

		
	}

}







