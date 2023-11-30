package basic_programs;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart 
{
	public static void main(String[] args)
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(options);
		d.get("https://www.flipkart.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		d.findElement(By.xpath("//span[.='✕']")).click();
		d.findElement(By.name("q")).sendKeys("iphone 14pro max");
		d.findElement(By.xpath("//span[contains(text(),'iphone')]")).click();
		List<WebElement> brand = d.findElements(By.xpath("//div[contains(text(),'iPhone 14 Pro Max')]"));
		List<WebElement> cost = d.findElements(By.xpath("//div[contains(text(),'iPhone 14 Pro Max')]/../../div[2]//div[1]/div[1]/div[1]"));
		for(int i=0;i<brand.size();i++)
		{
			System.out.println(brand.get(i).getText()+" -------> "+cost.get(i).getText());
		}
		d.quit();
	}

}
