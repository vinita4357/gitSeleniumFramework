import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

import org.apache.commons.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class readexcel {
	@Test(expectedExceptions=NoSuchElementException.class)
public void openbrowser() throws IOException, InterruptedException ,NoSuchElementException, OpenXML4JException{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\vinita.chauhan\\Documents\\msedgedriver.exe");
	
	WebDriver driver=new EdgeDriver();
	//driver.get("https://google.com");
	FileInputStream f=new FileInputStream(new File("C:\\Users\\vinita.chauhan\\eclipse-workspace\\SeleniumFramework\\src\\test\\resources\\data.properties"));
	Properties p =new Properties();
	p.load(f);
	driver.get(p.getProperty("url"));
String file="C:\\Users\\vinita.chauhan\\eclipse-workspace\\SeleniumFramework\\Book1.xlsx";
FileInputStream fs=new FileInputStream(file);
Workbook w=WorkbookFactory.create(fs);
w.getSheet("Sheet1");
	
for (int i=1;i<=w.getSheet("Sheet1").getLastRowNum();i++) {
	for(int j=0;j<w.getSheet("Sheet1").getRow(i).getPhysicalNumberOfCells();j++) {
		String data=w.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(data);
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		Thread.sleep(5000);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));
		WebElement foo=wait.until(new Function<WebDriver,WebElement>(){
				public WebElement apply(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@type='submit']"));
		}
		});
		
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
}
fs.close();
}
}
