import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportdemowithTestng {
	ExtentHtmlReporter reporter1;
	ExtentReports extent1;
	@BeforeTest
	public void setup() {
		 reporter1=new ExtentHtmlReporter("C:\\Users\\vinita.chauhan\\eclipse-workspace\\SeleniumFramework\\test-output\\ER.html");
		 extent1=new ExtentReports();
		extent1.attachReporter(reporter1);
	}
	
	@Test
	public void test1() throws IOException {
		ExtentTest test=extent1.createTest("googlesearch","this is test");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vinita.chauhan\\Documents\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//driver.get("https://google.com");
		FileInputStream f=new FileInputStream(new File("C:\\Users\\vinita.chauhan\\eclipse-workspace\\SeleniumFramework\\src\\test\\resources\\data.properties"));
		Properties p =new Properties();
		p.load(f);
		driver.get(p.getProperty("url"));
test.info( "Starting testcase");
		
	driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("selenium");
	driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	test.pass("test passes");
		
	}
@AfterTest	
public void teardown() {
	extent1.flush();
	}
}
