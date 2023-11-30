package basic_programs;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class AutoSuggestion 
{
	public static void main(String[] args) 
	{
		WebDriver d=new EdgeDriver();
		d.get("https://www.google.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		d.findElement(By.name("q")).sendKeys("wipro jobs");
		List<WebElement> wh = d.findElements(By.xpath("//span[contains(text(),'wipro jobs')]"));
		for(int i=0;i<wh.size();i++)
		{
			String s = wh.get(i).getText();
			System.out.println(s);
		}
		d.quit();
	}
}
