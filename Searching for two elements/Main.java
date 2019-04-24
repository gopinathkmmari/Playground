import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner gopi=new Scanner(System.in);
      int arraysize=gopi.nextInt();
      int arr[]=new int[arraysize];
      for(int i=0;i<=arraysize-1;i++){
      arr[i]=gopi.nextInt();
      }
      int ele1=gopi.nextInt();
      int ele2=gopi.nextInt();
      int index=-1;
      int index1=-1;
      for(int g=0;g<=arraysize-1;g++){
      if(ele1==arr[g]){
      index=g;
      }
        if(ele2==arr[g]){
        index1=g;
        }
      }
      System.out.println(index);
      System.out.println(index1);
    }
}