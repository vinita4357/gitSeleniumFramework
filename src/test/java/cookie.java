import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Cookie;

import io.github.bonigarcia.wdm.WebDriverManager;


public class cookie extends testbasebrowser{
	
	cookie(){
		
		//	super();
		
	}
	@Test
	public void cookie() throws InterruptedException {
	//	WebDriverManager.edgedriver().setup();
		//WebDriver d=new EdgeDriver();
	
		driver.get("https://demo.nopcommerce.com/");
		Set<Cookie> s=driver.manage().getCookies();
		for(Cookie c:s) {
			System.out.println(c.getName()+"..... "+c.getValue());
		}
		
		System.out.print(s.size());
		driver.manage().addCookie(new Cookie("vini","2"));
		Set<Cookie> s1=driver.manage().getCookies();
		System.out.print(s1.size());
		for(Cookie c1:s1) {
			System.out.println(c1.getName()+"..... "+c1.getValue());
		}
		
		driver.manage().deleteAllCookies();
	}
	

}
