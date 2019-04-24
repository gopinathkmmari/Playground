import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int i,g;
      for(i=1;i<=a;i++){
      for(g=1;g<=a;g++){
      if(i==1||i==a){
        System.out.print("*");
      }
        else{
          if(g==1||g==a){
          System.out.print("*");}
          else{
            System.out.print(" ");}
      }
      }
        System.out.println();	}
}
	}