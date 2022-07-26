package fileSystemObject;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	static FileOutputStream fos;
	static ObjectOutputStream oos;
	
	public static void main(String[] args) throws Throwable {
		try{
		fos=new FileOutputStream(".\\Files\\emp.ser");
		oos=new ObjectOutputStream(fos);
		EmployeeInfo emp=new EmployeeInfo(100, "RajaRam",12345);
		oos.writeObject(emp);
	
		}catch(Throwable t){
			
		}finally{
			fos.close();
			oos.close();
			System.out.println("Done");
		}

	}
}
