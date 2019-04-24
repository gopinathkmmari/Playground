import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int k=gopi.nextInt();
      int arr[]=new int[a];
      int freq[]=new int[k];
      int arr1[]=new int[k];
      for(int i=0;i<a;i++){
      arr[i]=gopi.nextInt();
      }
      for(int j=0;j<k;j++){
      freq[j]=0;
      }
      for(int z=0;z<k;z++){
      arr1[z]=z+1;
      }
      for(int i=0;i<a;i++){
      freq[arr[i]-1]++;
      }
      for(int j=0;j<k;j++){
      System.out.println(arr1[j]+" "+freq[j]);
      }
    }
}