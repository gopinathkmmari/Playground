import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        int i,g,z=1;
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      for(i=1;i<=a;i++){
      for(g=1;g<=i;g++){
      System.out.print(z);
      }
        z++;
        System.out.print("\n");
	}
}
}