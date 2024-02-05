import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;

import java.nio.charset.StandardCharsets;
import java.time.Duration;

import org.apache.commons.*;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class brokenlinks {
	@Test(expectedExceptions=NoSuchElementException.class)
public void openbrowser()  {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\vinita.chauhan\\Documents\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://natesmith.design/scroll-transform-exploration");
	
driver.manage().window().maximize();
try {
	Thread.sleep(15000);
	List<WebElement> l=driver.findElements(By.tagName("a"));
	for(WebElement w:l) {
		String url=w.getAttribute("href");
		if(url==null||url.isEmpty()) {
			continue;
		}
		URL link=new URL(url);
	HttpURLConnection connection=(HttpURLConnection)link.openConnection();
	connection.connect();
	if(connection.getResponseCode()>=400){
		System.out.print("link broken");
	}
		
		
		
		
		
		
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	
}

	
	
		
	
}








}
