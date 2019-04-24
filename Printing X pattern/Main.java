import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner gopi=new Scanner(System.in);
      int i,g;
      int a=gopi.nextInt();
      for(i=0;i<a;i++){
      for(g=0;g<a;g++){
      if(i==g||i+g==a-1){
        System.out.print("*");}
        else{
          System.out.print(" ");}
      }
        System.out.println();
      }
      }
	}