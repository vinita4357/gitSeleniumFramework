import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sizelocationofwebelement {
	@Test
	public void opentab() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver d=new EdgeDriver();
	
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement w=d.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[1]/img"));
		System.out.print(w.getLocation());
		System.out.print(w.getSize());
		
	}
	

}
