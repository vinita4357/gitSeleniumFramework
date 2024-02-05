import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

public class downloadfile 
{
@Test()
public void openbrowser() throws IOException, InterruptedException, AWTException {
	String path="C:\\Users\\vinita.chauhan\\Documents";
	
	HashMap preferences=new HashMap();
	preferences.put("plugins.always_open_pdf_externally", true);
	preferences.put("download.default_directory", path);
	EdgeOptions e=new EdgeOptions();
	e.setExperimentalOption("prefs", preferences);
	System.setProperty("webdriver.edge.driver", "C:\\Users\\vinita.chauhan\\Documents\\msedgedriver.exe");

	WebDriver driver=new EdgeDriver(e);

	
	driver.get("https://www.selenium.dev/downloads");
	driver.manage().window().maximize();
driver.findElement(By.xpath("/html/body/div/main/div[3]/div[3]/div/div[2]/p[2]/a")).click();



}




}
