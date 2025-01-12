package String;

import java.util.Scanner;

public class EvenUpdate {
  public static void main(String[] args) {
    String s="Hellow";
    String n="";
    for(int i=0;i<s.length();i++){
      if(i%2==0){
        n+=s.charAt(i);
      }
      else{
        n+=1;
      }
    }
    System.out.println(n);
    
  }
}
