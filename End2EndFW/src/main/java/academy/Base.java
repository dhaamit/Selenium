package academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Base {

	public void intiializeDriver() throws FileNotFoundException
	{

		 Properties prop = new Properties();
		 FileInputStream fls = new FileInputStream("C:\\Users\\amitd\\Selenium-Workspace\\End2EndFW\\src\\main\\java\\academy\\data.properties");
		 
	}
}
