package mysecond;



import java.util.Random;

public class MainRandomm {

 public static void main(String[] args) {
  
  Random random = new Random();
  
  int x = random.nextInt(6)+1;
  //double y = random.nextDouble();
  //boolean z = random.nextBoolean();
  
  System.out.println(x);
    
 }
}