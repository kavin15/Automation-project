package basic_programs;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class HandlingExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f=new FileInputStream("./Data/login.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		for(int i=1;i<=wb.getSheet("sheet1").getLastRowNum();i++)
		{
			System.out.println(wb.getSheet("sheet1").getRow(i).getCell(0).getStringCellValue()+" -----> "+
		                        wb.getSheet("sheet1").getRow(i).getCell(1).getStringCellValue());
		}
	}
}
