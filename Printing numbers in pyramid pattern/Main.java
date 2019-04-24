import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      int i,g,s,num=1;
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int space=a;
      for(i=1;i<=a;i++){
      for(s=1;s<=space-1;s++){
        System.out.print(" ");}
        for(g=1;g<=i;g++){
       System.out.print(num+" ");
          num++;
        }
        System.out.print("\n");
        space--;
      }
    }    
}