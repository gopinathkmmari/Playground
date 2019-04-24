import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner gopi=new Scanner(System.in);
  int a=gopi.nextInt();
  while(a/10!=0){
    if(a>=10&&a<=99)
      System.out.println(a%10);
  a=a/10;
  }
}
}