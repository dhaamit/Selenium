package propertiesFile;

import java.io.FileInputStream;
import java.util.Properties;

public class WorkWithPropertiesFile {

	public static void main(String[] args) throws Throwable, Throwable {
		Properties prop=new Properties();
		prop.load(new FileInputStream(".\\src\\propertiesFile\\Global.properties"));
		
		System.out.println(prop.getProperty("Browsertype"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("TestEnvi"));
	}

}
