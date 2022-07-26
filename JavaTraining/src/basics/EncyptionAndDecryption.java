package basics;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;


public class EncyptionAndDecryption {

	
public static void main(String[] args) {
		
		String name="Srinivas Narayan";
		String encryptname = Encryptname(name);
		System.out.println("Encrypt form of name : "+encryptname);//U3Jpbml2YXMgTmFyYXlhbg==

		String ename="U3Jpbml2YXMgTmFyYXlhbg==";
		String decryptname = Decryptname(ename);
		System.out.println("Decrypted form of name: "+decryptname);
	}
	
	public static String Encryptname(String name){
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(name.getBytes());
		return new String(encode);
	}
	
	public static String Decryptname(String ename){
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(ename.getBytes());
		return new String(decode);
	}
}
