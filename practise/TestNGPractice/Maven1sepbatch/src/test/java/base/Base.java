package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
	public static Properties prop=null;
	public static void loadProperties() throws IOException
         {
         prop=new Properties();
		FileInputStream fis=new FileInputStream("./src\\test\\java\\config\\configProperties");
		prop.load(fis);

	}
}
