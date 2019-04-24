import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int i;
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      for(i=1;i<=a;i++){
      if(a%i==0)
        System.out.println(i);
      }
	}
}