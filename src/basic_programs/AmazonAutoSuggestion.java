package basic_programs;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class AmazonAutoSuggestion 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		ChromeOptions c=new ChromeOptions();
		c.addArguments("__disable_notification");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.findElement(By.name("field-keywords")).sendKeys("iphone 14pro max");
		List<WebElement> we = d.findElements(By.xpath("//div[contains(text(),'iphone 14pro max')]"));
		for(int i=0;i<we.size();i++)
		{
			System.out.println(we.get(i).getText());
		}
	}
}