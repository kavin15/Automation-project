package basic_programs;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class CloseAll 
{
	@Test
	public void close() throws InterruptedException
	{
		WebDriver d=new ChromeDriver();
		d.get("https://secure.indeed.com/auth");
		d.findElement(By.id("apple-signin-button")).click();
		d.findElement(By.id("login-facebook-button")).click();
		Set<String> s = d.getWindowHandles();
		for(String i:s)
		{
			d.switchTo().window(i);
			Thread.sleep(5000);
			d.close();
		}
	}
}
