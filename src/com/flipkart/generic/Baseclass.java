package com.flipkart.generic;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.flipkart.pom.Googlepage;
public class Baseclass 
{
	public WebDriver driver;
 @BeforeClass
 public void openBrowser()
 {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
 }
 @BeforeMethod
 public void enterPage()
 {
	 driver.get("https://www.google.com/webhp");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 Googlepage sc=new Googlepage(driver);
	 sc.enterName();
	 sc.searching();
	 sc.clicking();
 }
 @AfterClass
 public void closeBrowser()
 {
	 driver.quit();
 }
 public void mouseAction(Actions a,WebElement w) throws InterruptedException
 {
	 Thread.sleep(2000);
	 a.moveToElement(w).click().perform();
 }
}
