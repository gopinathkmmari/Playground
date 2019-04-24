import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      if(a<1&&a>5)
        System.out.println("Invalid");
      else{
        switch(a){
          case 1:
            System.out.println("One");
            break;
          case 2:
            System.out.println("Two");
            break;
          case 3:
            System.out.println("Three");
            break;
          case 4:
            System.out.println("Four");
            break;
          case 5:
            System.out.println("Five");
            break;
          default:
            System.out.println("Invalid");
            break;
        }
      }
	}
}