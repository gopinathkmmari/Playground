import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner gopi=new Scanner(System.in);
    String a=gopi.nextLine();
    String b=gopi.nextLine();
    int l1=a.length();
    int l2=b.length();
    int count=0;
    for(int i=0;i<(l1-l2+1);i++){
    boolean matched=true;
      for(int j=0;j<l2;j++){
      if(a.charAt(i+j)!=b.charAt(j)){
      matched=false;
      }
      }
      if(matched==true){
      count++;
      }
    }
    System.out.println(count);
  } 
}