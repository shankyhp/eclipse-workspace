package AudioInJava;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;


import javax.sound.sampled.*;
public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException  {
		

		Scanner scanner =new Scanner(System.in);
		File file=new File("never.wav");
		
		
	  AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
	  
	  Clip clip=AudioSystem.getClip();
	  clip.open(audioStream);
	  
	 String response ="";
	 
	  
	  while(!response.equals("Q")) {
		  
		  System.out.println("P=Plays ,S=Stop,R=Reset,Q=Quit");
		  System.out.print("Enter Your Choice");
		  
		  
		  response=scanner.next();
		  response= response.toUpperCase();
		  
		  switch(response) {
		  
		  case("P"):  clip.start();
		  break;
		  case("S"): clip.stop();
		  break;
		  case("R"): clip.setMicrosecondPosition(0);
		  break;
		  case("Q"): clip.close();
		  break;
		  default:System.out.println("NOT A VALID RESPONSE");
		  }
	  }
	  
	  System.out.println("BYEE");
	
	}
}
	  