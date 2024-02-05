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
import org.testng.IReporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getalllinks implements IReporter{
	
	@Test
	public void geturl() {
		WebDriverManager.edgedriver().setup();
		WebDriver d=new EdgeDriver();
	
		d.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	Select s=new Select(d.findElement(By.xpath("//select")));
	List<WebElement> ll=s.getOptions();
	ArrayList<String> l=new ArrayList<String>();
	ArrayList<String> l2=new ArrayList<String>();
		System.out.println(l.size());
		for(WebElement w:ll) {
			l.add(w.getText());
			l2.add(w.getText());
		}
		
		Collections.sort(l2);
		if(l.equals(l2)) {
			System.out.print("dropdown sorted");
		}
			else {
				System.out.print("dropdown not sorted");
			}
	}
	
		
	


}
