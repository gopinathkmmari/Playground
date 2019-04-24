import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int i,s,g;
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int space=a;
      for(i=1;i<=a;i++){
     for(s=1;s<=space-1;s++){
       System.out.print(" ");}
        for(g=1;g<=(2*i-1);g++){
          System.out.print("*");
        }
        System.out.print("\n");
        space--;
      }
	}
}