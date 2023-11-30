package com.actitime.generic;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
public class BaseClass 
{
	public static WebDriver d;
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterClass
	public void closeBrowser() 
	{
		Reporter.log("closeBrowser",true);	
		d.quit();;
	}	
	@BeforeMethod
	public void login() throws IOException 
	{
		Reporter.log("login",true);	
		FileLib f=new FileLib();
		d.get(f.getPropertyData("url"));
		LoginPage l=new LoginPage(d);
		l.setLogin(f.getPropertyData("username"),f.getPropertyData("password"));
	}
	@AfterMethod
	public void logOut() 
	{
		Reporter.log("logOut",true);
		HomePage h=new HomePage(d);
		h.setLogout();
	}
}
