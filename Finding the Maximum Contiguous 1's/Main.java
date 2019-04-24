import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      int count=0;
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int arr[]=new int[a];
      for(int i=0;i<a;i++){
      arr[i]=gopi.nextInt();
      }
      for(int j=0;j<a;j++){
      if(arr[j]!=0){
      count++;
      }else{
      System.out.println(count);
        System.exit(0);
      }
      }
    }
}