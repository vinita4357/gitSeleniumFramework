import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.*;

import java.util.Base64;
import java.util.Iterator;
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
import org.testng.annotations.Test;

public class BrowserTest {
	@Test(expectedExceptions=NoSuchElementException.class)
public void openbrowser() throws IOException, InterruptedException ,NoSuchElementException{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\vinita.chauhan\\Documents\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	//driver.get("https://google.com");
	FileInputStream f=new FileInputStream(new File("C:\\Users\\vinita.chauhan\\eclipse-workspace\\SeleniumFramework\\src\\test\\resources\\data.properties"));
	Properties p =new Properties();
	p.load(f);
	driver.get(p.getProperty("url"));

	
driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("selenium");
driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//*[@type='submit']")).click();

//driver.switchTo().newWindow(WindowType.WINDOW);
driver.switchTo().newWindow(WindowType.TAB);
driver.get(p.getProperty("url"));
driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Uft");
driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//*[@type='submit']")).click();
Set<String> s=driver.getWindowHandles();
Object mainwindow=driver.getWindowHandle();
Iterator i=s.iterator();
while(i.hasNext()) {
	String childwindow=i.next().toString();
	if(!childwindow.equals(mainwindow)) {
		driver.switchTo().window((String) childwindow);
		
		break;
	}

	
}
driver.findElement(By.partialLinkText("browserstack1")).click();
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.cssSelector("button#developers-dd-toggle")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@title='Release Notes']/../following-sibling::div/a[1]")).click();

 
}
}
