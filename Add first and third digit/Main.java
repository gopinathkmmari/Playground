import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner gopi=new Scanner(System.in);
      int b,c;
      int a=gopi.nextInt();
      b=a%10;
      c=a/100;
      System.out.println(b+c);
	}
}