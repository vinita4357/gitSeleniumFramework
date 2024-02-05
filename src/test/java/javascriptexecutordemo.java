import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecutordemo {
	@Test
	public void opentab() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver d=new EdgeDriver();
	
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement w=d.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[1]/img"));
		WebElement w2=d.findElement(By.xpath("//*[@type='submit']"));
		d.manage().window().maximize();
		//highlight a webelement
		JavascriptExecutor js=((JavascriptExecutor)d);
		js.executeScript("arguments[0].style.border='3px solid green'", w);
		//get title
		System.out.print(js.executeScript("return document.title;").toString());
		//click
		js.executeScript("arguments[0].click();", w2);
		//generate alert
		js.executeScript("alert('"+"alert"+"')");
		//refresh page
		js.executeScript("history.go(0)");
		//scroll
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//zoom to 50 percent
		js.executeScript("document.body.style.zoom='50%'");
		
	}
	

}
