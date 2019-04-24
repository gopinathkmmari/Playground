import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      int product=1;
      int i;
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      for(i=1;i<=a;i++){
      product=product*i;
      }
      System.out.println(product);
	}
}