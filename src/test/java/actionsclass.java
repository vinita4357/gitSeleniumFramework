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

import org.junit.Assert;
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
import org.testng.ITestListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(utility.Listnerss.class)

public class actionsclass extends testbasebrowser {
	public actionsclass() {
		// super();
	}
@Test(timeOut=60000,successPercentage=60,invocationCount=2)
	public void openbrowser() throws IOException, InterruptedException, AWTException {

//context click	

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Thread.sleep(10000);
		SoftAssert s=new SoftAssert();
		s.assertEquals(element.isDisplayed(), true);
//Assert.assertEquals(element.isDisplayed(), false);
		a.moveToElement(element).contextClick().sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN)
				.sendKeys(Keys.ENTER).build().perform();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(10000);
		alert.dismiss();
	s.assertAll();
	
//double click
	}

	@Test(dependsOnMethods={"openbrowser"})
	public void doubleclick() throws IOException, InterruptedException, AWTException {
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		driver.switchTo().frame("iframeResult");
		WebElement element1 = driver.findElement(By.xpath("/html/body/button"));
		Thread.sleep(10000);
		element1.click();
		a.moveToElement(element1).doubleClick().build().perform();
	}

	@Test
	public void draganddrp() throws InterruptedException {
//drag and drop
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement src = driver.findElement(By.xpath("//*[@id='box6']"));
		WebElement tgt = driver.findElement(By.xpath("//*[@id='box106']"));
		Thread.sleep(10000);
		src.click();
		tgt.click();
		a.moveToElement(src).clickAndHold().dragAndDrop(src, tgt).build().perform();

//mouse hover

		a.moveToElement(src).build().perform();

	}

}
