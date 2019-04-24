import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner gopi=new Scanner(System.in);
    int x,y,z;
    int a=gopi.nextInt();
    x=a/100;
    y=((a/10)%10);
    z=a%10;
    System.out.println(z*100+y*10+x);
  }
}