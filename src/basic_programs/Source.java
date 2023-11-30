package basic_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
public class Source 
{
	WebDriver d;
	@Parameters("browser")
	@Test
	public void pageSource(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			d=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			d=new EdgeDriver();
		}
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		d.manage().deleteAllCookies();
		String html = d.getPageSource();
		System.out.println(html);
		d.quit();
	}
}
