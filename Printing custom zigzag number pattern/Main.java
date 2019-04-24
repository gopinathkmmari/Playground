import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner gopi=new Scanner(System.in);
      int a=gopi.nextInt();
      int num=1;
      int i,g;
      for(i=1;i<=a;i++){
      if(i%2!=0){
        for(g=1;g<=a;g++){
          if(g==a){
            System.out.print(++num);}
          else{
          System.out.print(num);}
      }}
        else{
          for(g=1;g<=a;g++){
            if(g!=1){
              System.out.print(num);
              if(g==a){
                num++;}}
              else{
                System.out.print(num+1);}
	}}
          System.out.print("\n");
}
    }
}