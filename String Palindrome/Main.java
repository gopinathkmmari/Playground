import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner gopi=new Scanner(System.in);
      String a=gopi.nextLine();
      //String b=gopi.nextLine();
      int l=a.length();
      int e=l-1;
      for(int i=0;i<l;i++){
      if(a.charAt(i)==a.charAt(e)){
      }else{
      System.out.println("No");
        System.exit(0);
      }
        e--;
      }
      System.out.println("Yes");
    } 
}