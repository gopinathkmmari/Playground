import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int i;
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      for(i=1;i<=a;i++){
      if(i%2==0)
        continue;
        System.out.println(i);
      }
	}
}