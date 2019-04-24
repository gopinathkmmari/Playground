import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner gopi=new Scanner(System.in);
      String str=gopi.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int l=sb.length();
      int freq[]=new int[26];
      for(int i=0;i<26;i++){
      freq[i]=0;
      }
      for(int j=0;j<l;j++){
      if(sb.charAt(j)>='A'&&sb.charAt(j)<='Z'){
      freq[sb.charAt(j)-'A']++;
      }
        if(sb.charAt(j)>='a'&&sb.charAt(j)<='z'){
        freq[sb.charAt(j)-'a']++;
        }
      }
      for(int k=0;k<26;k++){
        if(freq[k]==0){
      char missed=(char)(k+'a');
        System.out.print(missed+" ");
        }
      }
    }
}