package Pages;

import org.openqa.selenium.By;

import Browser.Browser;
import Demo.DemoLog;

public class Loginfeature extends Browser {
	public static void OpenUrl(String a)
	{
		try
		{
			DemoLog.Sample(2);
			Browser.openBrowser();
			Browser.openURL(a);
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
		}
	}
	
	public static void UserId(String userid)
	{
		try
		{
			DemoLog.Sample(1);
			Login.username(userid);
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
		}
	}
	
	public static void PassId(String passid)
	{
		try
		{
			DemoLog.Sample(1);
			Login.password(passid);
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
		}
	}
	
	public static void LogInBtn()
	{
		try
		{
			DemoLog.Sample(1);
			Login.loginButton();
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
		}
	}
	
	public static void NextPg() throws InterruptedException
	{
		try
		{
			DemoLog.Sample(1);
			Login.NavigateTheProduct();
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
		}
	}
	
	public static void Suser(String uid)
	{
		try
		{
			DemoLog.Sample(1);
			Login.username(uid);
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
		}
	}
	
	public static void Spass(String pass)
	{
		try
		{
			DemoLog.Sample(1);
			Login.password(pass);
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
		}
	}
	
	public static void Login_Button()
	{
		try
		{
			DemoLog.Sample(1);
			Login.loginButton();
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
		}
	}
	
	public static String ProdDetails() throws InterruptedException
	{
		String text = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText();
		return text;
	}

	
}
