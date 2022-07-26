package fileSystemObject;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class WorkWithJSON {

	public static void main(String[] args) throws Throwable, Throwable, Throwable 
	{
		JSONParser parser=new JSONParser();
		 Object obj = parser.parse(new FileReader(".\\Files\\testJson.json"));
		 JSONObject jobj=(JSONObject)obj;
		 Object arrayObject = jobj.get("LoginCredential");
		 //System.out.println(arrayObject);
		 JSONArray jarrayobject=(JSONArray)arrayObject;
		// System.out.println(jarrayobject.size());
		 
		 for(Object x : jarrayobject){
			 JSONObject jo=(JSONObject)x;
			 System.out.println(jo.get("cname"));
			 System.out.println(jo.get("cpwd"));
		 }
	}
}
