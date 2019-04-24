import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int b=gopi.nextInt();
      int c=gopi.nextInt();
      if(a>b&&a>c)
        System.out.println(a);
      if(b>c&&b>a)
        System.out.println(b);
      if(c>a&&c>b)
        System.out.println(c);
    }
}