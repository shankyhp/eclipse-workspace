package myfirst;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1st way of declaring 2d array
		
	/*	String [][] Laptop = new String[3][3];
		
		Laptop[0][0]="HP";
		Laptop[0][1]="LENOVO";
		Laptop[0][2]="ACER";
		
		
		Laptop[1][0]="NVIDIA";
		Laptop[1][1]="RYZEN";
		Laptop[1][2]="INTEL";
		
		
		Laptop[2][0]="MOUSE";
		Laptop[2][1]="SCREEN";
		Laptop[2][2]="CABEL";
		*/
		
		
		//2nd way of declaring 2d array
		
		String[][]Laptop = {
				   				{"hp","ACER","lenovo"},
				   				{"NVIDIA","Ryzen","Intel"},
				   				{"Mouse","screen","CAbel"}
							};
		
		
		for(int i=0;i<Laptop.length;i++)
		{
			
			System.out.println("");
			
			for(int j=0;j<Laptop[i].length;j++) {
				
				System.out.print(Laptop[i][j]+" ");
			}
		}
	
	}

}
