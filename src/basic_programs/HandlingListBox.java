package basic_programs;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class HandlingListBox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
 @Test
 public void handleListBox()
 {
	 WebDriver d=new ChromeDriver();
	 d.get("file:///C:/Users/Admin/Desktop/h.html");
	 WebElement mt = d.findElement(By.id("mtr"));
	 Select s=new Select(mt);
	 List<WebElement> list = s.getOptions();
     for(int i=0;i<list.size();i++)
     {
    	 Reporter.log(list.get(i).getText(), true);
     } 
     d.close();
 }
}
