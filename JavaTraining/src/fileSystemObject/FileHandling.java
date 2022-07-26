package fileSystemObject;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//		File f = new File("H:\\Java Notes\\File\\file.txt");
	//	File f = new File("H:\\Java Notes\\File\\file.xlsx");
	//	File f = new File("H:\\Java Notes\\File\\file.pdf");
		File f = new File("H:\\Java Notes\\File\\file.bmp");

		f.createNewFile();
	}

}
