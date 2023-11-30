package basic_programs;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class Open_two 
{
	public static WebDriver d;
  @Test
  public void open()
  {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the browser");
	String s=sc.nextLine();
	if(s.equals("chrome"))
	{
	  d=new ChromeDriver();
	}
	else if(s.equals("edge"))
	{
		d=new EdgeDriver();
	}
	d.get("https://www.google.com/");
	d.close();
	sc.close();
  }
}
