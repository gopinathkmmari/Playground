import java.util.Scanner;
class Main{
  public static int sum(int a){
    return (a*(a+1)/2);}
	public static void main (String[] args){
	    // Type your code here
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int nath=sum(a);
      System.out.print(nath);
	}
}