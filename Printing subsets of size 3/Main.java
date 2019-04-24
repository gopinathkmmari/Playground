import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int arr[]=new int[a];
      for(int i=0;i<a;i++){
      arr[i]=gopi.nextInt();
      }
      for(int q=0;q<a;q++){
      for(int w=q+1;w<a;w++){
      for(int e=w+1;e<a;e++){
        System.out.print("(");
      System.out.print(arr[q]+", "+arr[w]+", "+arr[e]);
      System.out.print(")");
        System.out.print(" ");
      }
      }
        if(q<(a-1)){
        System.out.println();
        }
        }
    }
}