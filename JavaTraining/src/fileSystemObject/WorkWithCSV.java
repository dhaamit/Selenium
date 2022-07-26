package fileSystemObject;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class WorkWithCSV {

	public static void main(String[] args) throws Throwable {
		CSVReader reader=new CSVReader(new FileReader(".\\Files\\TestDataForCSV.csv"));
		List<String[]> li = reader.readAll();
		System.out.println("Row count ="+li.size());
		
	
		String[] str = li.get(0);
		System.out.println("col count ="+str.length);
		
		for(int i=0;i<li.size();i++){
			String[] str1 = li.get(i);
			for(int j=0;j<str1.length;j++){
				System.out.println(str1[j]);
			}
		}
	}

}
