import java.util.Scanner;
public class Main{
  public static void Gcd(int a,int b,int c){
  int gcd=1;
    int i,z;
    for(i=1;i<=a&&i<=b;++i){
   if(a%i==0&&b%i==0){
     gcd=i;}}
      for(z=1;z<=gcd&&i<=c;++z){
     if(gcd%z==0&&c%z==0){
    int res=z;
      if(z==gcd||z==c){
        System.out.println(res);}
     }
    }
  }
	public static void main(String[] args)
	{
	    // Type your code here
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int b=gopi.nextInt();
      int c=gopi.nextInt();
      Gcd(a,b,c);
	}
}