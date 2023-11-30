package basic_programs;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertyFileHandle 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream f=new FileInputStream("./Data/d.property");
		Properties p=new Properties();
		p.load(f);
		String s1 = p.getProperty("url");
		String s2 = p.getProperty("username");
		String s3 = p.getProperty("password");
		System.out.println(s1+" "+s2+" "+s3);
	}
}
