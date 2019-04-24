import java.util.Scanner;
class Main
{
  public static int square(int a){
  return a*a;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int nath=square(a);
      System.out.print(nath);
	} 
}