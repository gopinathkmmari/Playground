import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner gopi=new Scanner(System.in);
      int c;
      int b;
      int a=gopi.nextInt();
      b=a%10;
      while(a/10!=0){
      if(a>=10&&a<=99){
        c=a/10;
        System.out.println(b+c);}
        a=a/10;
      }
	}
}