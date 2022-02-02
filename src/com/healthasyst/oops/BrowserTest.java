package com.healthasyst.oops;

interface WebDriver
{
	void quit();
	String getTitle();
	public abstract void close();
	void getCurrentUrl();
}

class ChromeDriver implements WebDriver
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
}

class FirefoxDriver implements WebDriver
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
	
}

public class BrowserTest {
	
	public static void main(String[] args) {
		
//		WebDriver driver =new ChromeDriver();
//		driver.quit(); //Method to be called is resolved during run time.
		
		String browser="hh";
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("ch"))
		{
			driver=new ChromeDriver(); //launch browser
		}
		else
		{
			driver=new FirefoxDriver(); 
		}
		
		
		driver.quit();
		
	}

}







