package Serialization;

import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {


		User user = new User();
		
		user.name ="Shanky";
		user.password = "pass123";
		
		FileOutputStream fileOut = new FileOutputStream("Userinfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object Info Saved :)");
	
		long serVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		
		System.out.println(serVersionUID);
	}

}
