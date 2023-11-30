package basic_programs;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonAll 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.findElement(By.name("q")).sendKeys("Amazon");
		d.findElement(By.name("btnK")).click();
		List<WebElement> f1 = d.findElements(By.xpath("//a"));
		for(int i=0;i<f1.size();i++)
		{
			String s1 = f1.get(i).getAttribute("href");
			System.out.println(s1);
		}
		d.close();
	}
}
