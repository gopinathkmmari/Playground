import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner gopi=new Scanner(System.in);
      String str1=gopi.nextLine();
      //StringBuilder str=new StringBuilder(str1);
      String str2=gopi.nextLine();
      String str3=gopi.nextLine();
      System.out.println(str1.replace(str2,str3));
      //System.out.println(str1);
    }
}