import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      int sum;
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int arr[]=new int[a];
      for(int i=0;i<a;i++){
      arr[i]=gopi.nextInt();
      }
      int ans=gopi.nextInt();
      for(int A=0;A<a;A++){
      for(int B=A+1;B<a;B++){
      sum=arr[A]+arr[B];
        if(sum==ans){
        System.out.print(arr[A]+", "+arr[B]);
          System.out.println();
        }
      }
      }
    }
}