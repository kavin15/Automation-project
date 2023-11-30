package basic_programs;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Autosug 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> ag = d.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		for(int i=0;i<ag.size();i++)
		{
			System.out.println(ag.get(i).getText()); 
		}
		d.close();
		Thread.sleep(5000);
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.flipkart.com/");
		System.out.println("=============FlipKart==============");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d1.findElement(By.xpath("//button[.='✕']")).click();
		d1.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		List<WebElement> ag1 = d1.findElements(By.xpath("//span[contains(text(),'iphone 14 pro max')]/.."));
		for(int i=0;i<ag1.size();i++)
		{
			System.out.println(ag1.get(i).getText()); 
		}
		d1.close();
	}
}
