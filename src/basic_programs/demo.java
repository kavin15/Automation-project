package basic_programs;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   WebDriver d=new EdgeDriver();//
	   d.get("https://www.flipkart.com/");
	   d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	   d.findElement(By.xpath("//span[text()='Login']/../../../../span")).click();
	   d.findElement(By.name("q")).sendKeys("iphone 14pro max");
	   d.findElement(By.xpath("//button")).click();
	   List<WebElement> f = d.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]"));
	   List<WebElement> c = d.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]"));
	   for(int i=0;i<f.size();i++)
	   {
		   System.out.println(f.get(i).getText()+"------->"+c.get(i).getText());
	   }
	   d.quit();
	}
}
