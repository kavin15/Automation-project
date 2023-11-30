package com.filpkart.testscript;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.flipkart.generic.Baseclass;
import com.flipkart.pom.AmazonHome;
@Listeners(com.flipkart.generic.Listners.class)
public class Amazon extends Baseclass
{
	@Test
	public void addToKart() throws InterruptedException
	{
		AmazonHome a=new AmazonHome(driver);
		a.searchBox("bldc ceiling fan");
		a.clickAuto();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[.='Crompton']")).click();
		Amazon ad=new Amazon();
		Actions a1=new Actions(driver);
		Thread.sleep(2000);
		ad.mouseAction(a1,driver.findElement(By.xpath("//span[.='4 Stars & Up']")));
		WebElement w2 = driver.findElement(By.id("low-price"));
		Thread.sleep(2000);
		a1.moveToElement(w2).sendKeys(w2, "1500").perform();
		driver.findElement(By.id("high-price")).sendKeys("5000");
		Thread.sleep(2000);
		ad.mouseAction(a1,driver.findElement(By.xpath("//span[@class='a-button-text']")));
		driver.findElement(By.xpath("//span[contains(text(),'Crompton')] ")).click();
		Thread.sleep(3000);
		Set<String> tab = driver.getWindowHandles();
		ArrayList<String> t=new ArrayList<String>(tab);
		String st = t.get(1);
		driver.switchTo().window(st);
		Thread.sleep(10000);
		ad.mouseAction(a1,driver.findElement(By.id("submit.add-to-cart-announce")));
		Thread.sleep(2000);
		ad.mouseAction(a1,driver.findElement(By.id("attachSiNoCoverage-announce")));
		Thread.sleep(2000);
		a.proceedButton();
		a.userNAme("kavinsakthivel1999@gmail.com");
		ad.mouseAction(a1,driver.findElement(By.xpath("//span[contains(text(),'Continue')]")));
		a.password("kavi@mp1521");
		ad.mouseAction(a1,driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")));
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Add a new address')]")).click();
		a.firstName("Kavin");
		a.mobile("9600719126");
		a.pincode("638314");
		a.landMark("Noolkaari Thottam");
		a.sunmitAddress();
	}

}
