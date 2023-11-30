package basic_programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class DuplicateValue 
{
	@Test
	public void handleListBox(){
		WebDriver driver=new ChromeDriver();
		String url="file:///D:/h.html";
		System.out.println(url);
		driver.get("url");
		WebElement mtrlb = driver.findElement(By.id("mtr"));
		Select s= new Select(mtrlb);
		java.util.List<WebElement> menu = s.getOptions();
		ArrayList<String> al = new ArrayList<String>();
		HashSet<String> h1=new HashSet<>();
		for(int i=0;i<menu.size();i++)
		{
			al.add(menu.get(i).getText());
		}
		Collections.sort(al);
		int k=al.size()-1;
		for(int i=k;i>0;i--)
		{
			String text=al.get(i);
			if(text.equals(al.get(i-1)))
			{
				h1.add(text);
			}
		}
		System.out.println(h1);
		driver.close();
	}
}
