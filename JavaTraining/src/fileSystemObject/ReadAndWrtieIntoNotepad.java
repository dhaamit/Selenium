package fileSystemObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrtieIntoNotepad {
	static FileInputStream fip;
	static FileOutputStream fop;
	
	public static void main(String[] args) throws Throwable {
		try
		{
			fip=new FileInputStream(".\\Files\\Topics.txt");
			fop=new FileOutputStream(".\\Files\\Topics_copy1.txt");
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
