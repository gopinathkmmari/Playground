import java.util.Scanner;
class Main{
  public static void prime(int a){
  int m,n;
    System.out.println("2");
  for(m=3;m<=a;m++){
  for(n=2;n<m;n++){
  if(m%n==0){
    break;}
   if((m-1)==n){
    System.out.println(m);
    }
  }
  }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      prime(a);
	}
}