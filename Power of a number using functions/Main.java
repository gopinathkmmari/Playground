import java.util.Scanner;
class Main{
  public static int power(int a,int b){
    int c=1;
    int m;
  for(m=1;m<=b;m++){
  c=a*c;}
    return c;
  }
public static void main(String[] args){
Scanner gopi=new Scanner(System.in);
  int a=gopi.nextInt();
  int b=gopi.nextInt();
  int answer=power(a,b);
  System.out.println(answer);
}
}