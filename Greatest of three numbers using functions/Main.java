import java.util.Scanner;
class Main{
  public static int big(int a,int b,int c){
    int d;
  if(a>b){
    d=a;}
    else{d=b;}
    if(d>c){
      return d;}
      else{
        return c;}
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int b=gopi.nextInt();
      int c=gopi.nextInt();
      int result=big(a,b,c);
      System.out.println(result);
	}
}