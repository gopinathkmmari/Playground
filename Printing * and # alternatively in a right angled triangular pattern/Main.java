import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int i,g;
      int a=in.nextInt();
      System.out.println('*');
      for(i=2;i<=a;i++){
      for(g=1;g<=i;g++){
      if(i==2||i==3||i==6||i==7||i==10||i==11||i==14||i==15){
      if(g%2==0)
        System.out.print("*");
        else
          System.out.print("#");
      }else{
      if(g%2==0)
        System.out.print("#");
        else
          System.out.print("*");
      }
      }
        System.out.print("\n");
      }
    }
}