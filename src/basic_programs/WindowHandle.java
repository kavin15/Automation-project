package basic_programs;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandle 
{
	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://secure.indeed.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.id("apple-signin-button")).click();
		d.findElement(By.id("login-facebook-button")).click();
		String s = d.getWindowHandle();
		Set<String> a1 = d.getWindowHandles();
		for(String i:a1)
		{
			d.switchTo().window(i);
			if(s.equals(i)==false)
			{
				d.close();
			}
		}
	}
}
