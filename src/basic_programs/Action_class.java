package basic_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
public class Action_class 
{
	@Test
	public void Actions()
	{
		WebDriver d=new ChromeDriver();
		Actions a= new Actions(d);
		d.get("https://www.google.com/");
		a.moveToElement(d.findElement(By.id("q")));
	}
}
