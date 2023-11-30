package basic_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo1 
{
	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
	}
}
