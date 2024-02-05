import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opennewtab {
	@Test
	public void opentab() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver d=new EdgeDriver();
	
		d.get("https://demo.nopcommerce.com/");
		Thread.sleep(5000);
		WebElement w=d.findElement(By.xpath("//*[contains(text(),'Register')]"));
		
		String x=w.getAttribute("href");
		d.switchTo().newWindow(WindowType.TAB);
		d.get(x);

		d.switchTo().newWindow(WindowType.WINDOW);
		d.get("https://google.com");
		Set<String> s=d.getWindowHandles();
		System.out.print(s.size());
		for(String s1:s) {
			d.switchTo().window(s1);
				if(d.getTitle().contains("Register")) {
					d.findElement(By.xpath("//*[contains(text(),'Female')]/../input")).click();
					break;
				}
			
		}
		
	}
	

}
