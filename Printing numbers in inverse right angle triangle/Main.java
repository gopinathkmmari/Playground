import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int i,g;
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int temp=a;
      for(i=1;i<=a;i++){
     for(g=temp;g<=temp&&g>0;g--){
     System.out.print(g);
     }
        System.out.print("\n");
        temp--;
      }
	}
}