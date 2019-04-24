import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner gopi=new Scanner(System.in);
      int n=1;
      int a=gopi.nextInt();
      int arr[]=new int[a];
      int arr1[]=new int[a];
      for(int i=0;i<a;i++){
      arr[i]=gopi.nextInt();
      }
      for(int j=0;j<a;j++){
      arr1[j]=n;
        n++;
      }
      for(int i=0;i<a;i++){
      for(int j=0;j<a;j++){
      if(arr1[i]==arr[j]){
        break;
      }else if(j==(a-1)){
      System.out.println(arr1[i]);
      }
      }
      }
    }
}