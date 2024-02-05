

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportlistner {
public static void main(String[] args) throws IOException {
	ExtentHtmlReporter reporter =new ExtentHtmlReporter("C:\\Users\\vinita.chauhan\\eclipse-workspace\\SeleniumFramework\\test-output\\ExtentReport.html");
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(reporter);
	ExtentTest test=extent.createTest("googlesearch","this is test");
	
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
	extent.flush();
	test.pass("test passes");
}
}
