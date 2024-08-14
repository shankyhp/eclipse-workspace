package FIleWriters;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses Are RED \n violets are blue \n YOYO");
			writer.append("\n A Poem By Me");
			writer.close();
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
}
