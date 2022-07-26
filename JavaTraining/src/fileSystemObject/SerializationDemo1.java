package fileSystemObject;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializationDemo1 {
	static FileInputStream fip;
	static ObjectInputStream oip;
	
	public static void main(String[] args) throws Throwable {
		try{
			fip=new FileInputStream(".\\Files\\emp.ser");
			oip=new ObjectInputStream(fip);
			Object o = oip.readObject();
			
			EmployeeInfo emp=(EmployeeInfo)o;
			System.out.println("Emp id "+emp.empid);
			System.out.println("Emp name "+emp.name);
			System.out.println("Emp pwd "+emp.password);
		}catch(Throwable t){
			
		}finally{
			fip.close();
			oip.close();
		}

	}
}
