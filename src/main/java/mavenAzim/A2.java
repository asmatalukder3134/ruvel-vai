package mavenAzim;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {
	A1 a;
ChromeDriver dr;
	A2(ChromeDriver dr){
		this.dr=dr;
	}
	
	public void mousoverOnGirl() {
		a=new A1(dr);
		a.mousOver(By.xpath(""));
	}
	public tops clickOnTops() {
		a.click(By.xpath(""));
		return  new tops(dr);
	}
}
