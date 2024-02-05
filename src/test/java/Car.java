import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Car 
{
@Test()
public void openbrowser() throws IOException, InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\vinita.chauhan\\Documents\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	//driver.get("https://google.com");
	FileInputStream f=new FileInputStream(new File("C:\\Users\\vinita.chauhan\\eclipse-workspace\\SeleniumFramework\\src\\test\\resources\\data.properties"));
	Properties p =new Properties();
	p.load(f);
	driver.get("https://demoqa.com/text-box");
driver.findElement(By.id("userName")).sendKeys("vinita");
driver.findElement(By.id("userEmail")).sendKeys("chauhan");
driver.findElement(By.id("currentAddress")).sendKeys("Mharalgaon");
Actions a=new Actions(driver);
WebElement ca=driver.findElement(By.id("currentAddress"));
a.keyDown(Keys.CONTROL);
a.sendKeys("a");
a.keyUp(Keys.CONTROL);
a.build().perform();

a.keyDown(Keys.CONTROL);
a.sendKeys("c");
a.keyUp(Keys.CONTROL);
a.build().perform();
a.sendKeys(Keys.TAB);
a.build().perform();
a.keyDown(Keys.CONTROL);
a.sendKeys("v");
a.keyUp(Keys.CONTROL);
a.build().perform();

}
}
