import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    int max;
    Scanner gopi=new Scanner(System.in);
    int a=gopi.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++){
    arr[i]=gopi.nextInt();
    }
    if(arr[0]>arr[1]){
    max=0;
    }else{
    max=1;
    }
    for(int k=2;k<=a-1;k++){
    if(arr[max]<arr[k]){
    max=k;
    }
    }
    System.out.println(max);
  }
}