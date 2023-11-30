package basic_programs;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Screen_shot 
{
	@Test
	public void screenShot() throws IOException, InterruptedException
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		TakesScreenshot t=(TakesScreenshot) d;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShot/googlepage.png");
		FileUtils.copyFile(src, dest);
		d.quit();
	}
}
