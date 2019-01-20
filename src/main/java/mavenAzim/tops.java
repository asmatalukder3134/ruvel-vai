package mavenAzim;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tops {
	A1 b;
	ChromeDriver dr;
	tops(ChromeDriver dr){
		this.dr=dr;
	}
public Top clickOnTop() {
	 b=new A1(dr);
	 b.click(By.xpath(""));
	 return new Top(dr);
		
}
}