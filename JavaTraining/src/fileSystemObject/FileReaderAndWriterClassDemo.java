package fileSystemObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderAndWriterClassDemo {
	static FileReader fip;
	static FileWriter fop;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		try
		{
			fip = new FileReader(".\\Files\\DSC_0002.jpg");
			fop = new FileWriter(".\\Files\\DSC_0004.jpg");
			int data = 0;
			while((data-fip.read()!=-1))
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
		long stop = System.currentTimeMillis();
		System.out.println("Total TIme Taken= "+(stop-start));

	}
}