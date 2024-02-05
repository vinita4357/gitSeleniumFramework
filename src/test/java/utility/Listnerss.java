package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listnerss implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("On test start"+""+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success"+""+result.getName());
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On test failure"+""+result.getName());
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On test skipped"+""+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On test onTestFailedButWithinSuccessPercentage"+""+result.getName());
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On test onTestFailedButWithinSuccessPercentage"+""+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On starte"+""+context.getName());
	
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On finish"+""+context.getName());
		
	}
	

	
}
