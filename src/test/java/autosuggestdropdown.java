import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestdropdown {
	
	@Test
	public void geturl() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver d=new EdgeDriver();
	
		d.get("https://google.com");
		d.findElement(By.xpath("//*[@title='Search']")).sendKeys("selenium");
		Thread.sleep(10000);
	List<WebElement> l=d.findElements(By.xpath("//*[@class='G43f7e']/li//*[@class='wM6W7d']/span/b"));
	
		
		for(WebElement w:l) {
			if(w.getText().contains("rich foods")) {
				w.click();
				break;
			}
		}
		
		
	}
	
		
	


}
