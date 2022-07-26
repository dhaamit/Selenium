package fileSystemObject;

import xls.ShineXlsReader;

public class WorkingWithExcel {

	public static void main(String[] args) {
		ShineXlsReader xls = new ShineXlsReader(".\\Files\\TestData.xlsx");
		int rowCount = xls.getRowCount("Sheet1");
		int colCount = xls.getColumnCount("Sheet1");
		
		System.out.println("Row count = "+rowCount);
		System.out.println("Column count = "+colCount);
		
	/*	for(int i=1;i<=rowCount;i++) {
			for (int j=0;j<=colCount; j++)
			{
				String cellData = xls.getCellData("Sheet1", j, i);
				System.out.println(cellData);
			}
		}*/
		
		//xls.addSheet("Sheet4");
		xls.addColumn("Sheet4", "DOB");
		xls.setCellData("Sheet4", "DOB", 2, "25101989");
			
	}

}
