import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner gopi=new Scanner(System.in);
    int i;
    int a=gopi.nextInt();
    for(i=1;i<=a;i++){
      if(i%3==0){
        System.out.print(i);
        System.out.print(",");
      continue;}
      System.out.print(i);}
  }
}