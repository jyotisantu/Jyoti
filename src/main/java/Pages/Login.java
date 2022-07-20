package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Browser.Browser;
import Demo.DemoLog;

public class Login extends Browser {
	
	
	//private static final JavascriptExecutor JavascriptExecutor = null;

	public static void username(String username) {
		try {
			DemoLog.Sample(2);
			driver.findElement(By.id("user-name")).sendKeys(username);	
			Thread.sleep(500);
		}
		catch(Exception e) {
			DemoLog.Sample(3);
		    e.printStackTrace();
		
		}
	}
	
	public static void password(String password) {
		try {
			DemoLog.Sample(1);
			driver.findElement(By.id("password")).sendKeys(password);
			Thread.sleep(500);
		}
		catch(Exception e) {
			DemoLog.Sample(3);
			e.printStackTrace();
		}
	}
	
	public static void loginButton() {
		try {
			DemoLog.Sample(1);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(500);
		}
		catch(Exception e) {
			DemoLog.Sample(3);
			e.printStackTrace();
		}
	}
	
	public static String NavigateTheProduct(){
		
			String abcde = driver.getTitle();
			return abcde;
		
		
	}
	
}
