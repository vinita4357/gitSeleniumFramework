import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

public class actionsclasskeypresses 
{
@Test()
public void openbrowser() throws IOException, InterruptedException, AWTException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\vinita.chauhan\\Documents\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
/***
	
driver.get("https://the-internet.herokuapp.com/key_presses");
Thread.sleep(20000);
Actions a=new Actions(driver);

WebElement element=driver.findElement(By.xpath("//*[@id='target']"));
Thread.sleep(10000);

a.moveToElement(element).sendKeys(Keys.PAGE_UP).build().perform();
*/
	driver.get("https://text-compare.com/");
	Thread.sleep(20000);
	Actions a=new Actions(driver);

	WebElement element=driver.findElement(By.xpath("//*[@id='inputText1']"));
	element.sendKeys("welcome to selenium");
	
	a.keyDown(Keys.CONTROL);
	a.sendKeys("A");
	a.keyUp(Keys.CONTROL);
	a.build().perform();
	
	a.keyDown(Keys.CONTROL);
	a.sendKeys("C");
	a.keyUp(Keys.CONTROL);
	a.build().perform();
	
	a.sendKeys(Keys.TAB);
	a.build().perform();
	a.keyDown(Keys.CONTROL);
	a.sendKeys("V");
	a.keyUp(Keys.CONTROL);
	a.build().perform();
	
	
	
	
	
	
	
	
	
	
	
}




}
