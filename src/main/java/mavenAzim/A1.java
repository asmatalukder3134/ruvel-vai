package mavenAzim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class A1 {
	ChromeDriver dr;
	A1(ChromeDriver dr){
	this.dr=dr;	
	}

	public void mousOver(By by) {
		Actions ac=new Actions(dr);
		ac.moveToElement(dr.findElement(by)).perform();
	}
	public void dropDown(String text) {
		Select s=new Select(dr.findElementByXPath(""));
		s.selectByVisibleText(text);
	}
	public void listWebElement(By by) {
		List<WebElement> e=dr.findElements(by);
		
	}
	public void click(By by) {
		dr.findElement(by).click();
	}
	public void sendkey(By by) {
		dr.findElement(by).sendKeys();
	}
	public void githubtesting(){
	}
		
	
}

