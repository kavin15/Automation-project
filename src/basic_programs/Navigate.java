package basic_programs;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class Navigate 
{
	private WebDriver d;
	@Test
	public void navigation() throws AWTException
	{
		d=new EdgeDriver();
		d.get("https://www.google.co.in/");
		d.navigate().refresh();
		d.findElement(By.name("q")).sendKeys("wipro");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		d.navigate().back();
		d.quit();
	}
}
