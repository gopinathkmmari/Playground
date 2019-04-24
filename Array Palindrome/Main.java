import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int b=a;
      int arr[]=new int[a];
      for(int i=0;i<a;i++){
      arr[i]=gopi.nextInt();
      }
      for(int i=0;i<a;i++){
      for(int j=(b-1);j>0;j++){
      if(arr[i]!=arr[j]){
      System.out.println("No");
        System.exit(0);
      }else{
        b--;
      break;
      }
      }
      }
      System.out.println("Yes");
    }
}