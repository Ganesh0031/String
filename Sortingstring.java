package String;

import java.util.Arrays;

public class Sortingstring {
  public static void main(String[] args) {
    StringBuilder s=new StringBuilder("Raghav");
    char []ch=s.toCharArray();
    Arrays.sort(ch);
    for(char ele:ch){
      System.out.println(ele);
    }
  }
  
}
