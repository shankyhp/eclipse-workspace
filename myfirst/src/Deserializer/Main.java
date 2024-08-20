package Deserializer;


import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\biraj\\eclipse-workspace\\myfirst\\Userinfo.ser");
		ObjectInputStream in= new ObjectInputStream(fileIn);
		
		user = (User) in.readObject();
		in.close();
		fileIn.close();
	
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
	
		long serVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serVersionUID);
	}

}
