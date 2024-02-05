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

public class datepicker 
{
@Test()
public void openbrowser() throws IOException, InterruptedException, AWTException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\vinita.chauhan\\Documents\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://www.redbus.in/");
	driver.findElement(By.xpath("//*[@id='onwardCal']/div")).click();
	String y="2024";
	String m="Feb";
	String date="6";
	
	try {
	while(true) {
		String dateyear=driver.findElement(By.xpath("//*[@id='onwardCal']//*[contains(@class,'DayNavigator')]/div/div/..")).getText();
		String[] dateyear1=dateyear.split(" ");
		String year=dateyear1[1].substring(0, 4);
		String month=dateyear1[0];
		Thread.sleep(10000);
		if(y.equalsIgnoreCase(year) && m.equalsIgnoreCase(month)) {
			break;
			
		}
		else {
		
		 driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
		
	
		}
		
	}
	}
	catch(Exception e) {
		System.out.print(e.getMessage());
	}

}




}
