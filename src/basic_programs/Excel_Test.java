package basic_programs;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Excel_Test 
{
	@Test
	public void actitime() throws IOException, InterruptedException
	{
		WebDriver d=new ChromeDriver();
		FileLib f1=new FileLib();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FileInputStream f=new FileInputStream("./Data/d.property");
		Properties p=new Properties();
		p.load(f);
		d.get(p.getProperty("url"));
		d.findElement(By.id("username")).sendKeys(p.getProperty("username"));
		d.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
		d.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		String tit = d.getTitle();
		d.findElement(By.id("logoutLink")).click();
		FileInputStream e=new FileInputStream("./Data/login.xlsx");
		Workbook wb = WorkbookFactory.create(e);
		for(int i=1;i<=wb.getSheet("sheet1").getLastRowNum();i++)
		{
			d.findElement(By.id("username")).sendKeys(wb.getSheet("sheet1").getRow(i).getCell(0).getStringCellValue());
			d.findElement(By.name("pwd")).sendKeys(wb.getSheet("sheet1").getRow(i).getCell(1).getStringCellValue());
			d.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			String tit1 = d.getTitle();
			if(tit.equals(tit1))
			{
				f1.setExcelData("sheet1", i, 2, "pass");
				d.findElement(By.id("logoutLink")).click();
				
			}
			else
			{
				f1.setExcelData("sheet1", i, 2, "fail");
				d.navigate().refresh();
			}
		}
		d.quit();
	}
}
