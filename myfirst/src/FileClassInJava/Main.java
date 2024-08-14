package FileClassInJava;

import java.io.File;
public class Main {

	public static void main(String[] args) {
		
		File file =new File("Secret.txt.txt");
		
		if(file.exists()) {
			
			System.out.println("File Exist");		
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete(); //This Deletes The File After Running
		}
		
		else {
			
			System.out.println("File doesnt exist");
		}
	}
	
	
}
