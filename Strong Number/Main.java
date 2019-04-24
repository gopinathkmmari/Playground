import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int product=1;
      int pd=1;
      int sum=0;int x;int i;
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int gp=a;
      while(a>1){
      x=a%10;
        for(i=1;i<=x;i++){
        product=product*i;
        }
        sum=sum+product;
        product=1;
        a=a/10;
      }
      while(a>=1){
      pd=pd*a;
        a--;
      }
      if((sum+pd)==gp)
        System.out.println("Yes");
      else{
      System.out.println("No");}
	}
}