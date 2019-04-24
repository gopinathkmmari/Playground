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
      zerosend(a,arr);
      for(int j=0;j<a;j++){
      System.out.print(arr[j]+" ");
      }
    }
  public static void zerosend(int a,int arr[]){
  int count=0;
    for(int index=0;index<a;index++){
    if(arr[index]!=0){
    int temp=arr[index];
      arr[index]=arr[count];
      arr[count]=temp;
      count++;
    }
    }
  }
}