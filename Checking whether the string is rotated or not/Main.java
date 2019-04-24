import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner gopi=new Scanner(System.in);
      String str1=gopi.nextLine();
      String str2=gopi.nextLine();
      //StringBuilder sb=new StringBuilder(str1);
      //StringBuilder sbv=new StringBuilder(str2);
      //StringBuilder sb1=new StringBuilder(sb.append(sb));
      String str=str1+str1;
     // System.out.println(str);
      boolean result=str.contains(str2);
      if(result==true){
      System.out.println("Yes");
      }else{
      System.out.println("No");
      }
    }
}