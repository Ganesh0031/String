package String;

import java.util.Scanner;

public class CheckVovel {
    public static boolean isVowel(char ch){
        if(ch=='a'|| ch=='A') return true;
        if (ch=='e'|| ch=='e') return true;
        if(ch=='i'|| ch=='I') return true;
        if (ch=='o'|| ch=='O') return true;
        if(ch=='u'|| ch=='U') return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)==true )  count++;      }
        System.out.println(count);
    }
}
