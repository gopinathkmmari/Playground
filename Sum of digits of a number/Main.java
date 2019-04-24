import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
            Scanner gopi=new Scanner(System.in);
      int sum=0;
      int b;
      int a=gopi.nextInt();
      while(a/10!=0){
        b=a%10;
        sum=sum+b;
        a=a/10;
        if(a<=9)
          System.out.println(sum+a);
      }
	}
}