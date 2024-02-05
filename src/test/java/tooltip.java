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

public class tooltip {
	
	@Test
	public void geturl() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver d=new EdgeDriver();
	
		d.get("https://jqueryui.com/tooltip/");
		WebElement w=d.findElement(By.xpath("//*[@id='content']/iframe"));
		d.switchTo().frame(w);
		String x=d.findElement(By.id("age")).getAttribute("title");
		System.out.print(x);

		
		
	}
	
		
	


}
