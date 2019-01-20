package mavenAzim;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
ChromeDriver dr;
    @Test
	public void openBrowser() {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\shapl\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.childrensplace.com");
		
		dr.quit();
		
		
	}
}
