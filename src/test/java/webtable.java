import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {
	@Test
	public void gettable() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']//tr"));
		System.out.print(rows.size());
		List<WebElement> columns=driver.findElements(By.xpath("//*[@id='customers']//tr[2]/td"));
		System.out.println(columns.size());
		//print specific columns and row
	
		//	System.out.print(driver.findElement(By.xpath("//*[@id='customers']//tr[2]/td[1]")).getText());
	
	
	//print all row and columns
	
		for(int j=1;j<=columns.size();j++) {
			System.out.print(driver.findElement(By.xpath("//*[@id='customers']//tr[1]//th["+j+"]")).getText());
		}
		for(int i=2;i<=rows.size();i++) {
		for(int k=1;k<=columns.size();k++) {
			System.out.print(driver.findElement(By.xpath("//*[@id='customers']//tr["+i+"]//td["+k+"]")).getText());
			
		}
		System.out.println("");
	}
	}
		
	

}
