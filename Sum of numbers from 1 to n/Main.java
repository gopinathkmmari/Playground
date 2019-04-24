import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      int i,sum=0;
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      for(i=1;i<=a;i++){
      sum=sum+i;
      }
      System.out.println(sum);
	}
}