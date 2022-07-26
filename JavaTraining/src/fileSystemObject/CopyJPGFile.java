package fileSystemObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJPGFile {
	static FileInputStream fip;
	static FileOutputStream fop;
	
	public static void main(String[] args) throws Throwable {
		try
		{
			fip=new FileInputStream(".\\Files\\DSC_0002.jpg");
			fop=new FileOutputStream(".\\Files\\DSC_0002_copy.jpg");
			int data;
			while((data=fip.read())!=-1)
			{
				fop.write(data);
			}
		}
		catch(Throwable t) {
			
		}
		finally 
		{
			fip.close();
			fop.close();
			System.out.println("Done");
		}
	}

}
