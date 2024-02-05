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

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.Now;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

public class screenshot 
{
@Test()
public void openbrowser() throws IOException, InterruptedException, AWTException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\vinita.chauhan\\Documents\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();

	
driver.get("https://demo.nopcommerce.com");
TakesScreenshot scrShot =((TakesScreenshot)driver);
File src=scrShot.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("C:\\Users\\vinita.chauhan\\eclipse-workspace\\SeleniumFramework\\src\\test\\java\\test.png"));
	
//screenshot of a section
WebElement w=driver.findElement(By.xpath("//*[@id='small-searchterms']"));
File s1=	w.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(s1, new File("C:\\\\Users\\\\vinita.chauhan\\\\eclipse-workspace\\\\SeleniumFramework\\\\src\\\\test\\\\java\\\\test1.png"));
	
}




}
