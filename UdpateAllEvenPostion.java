package String;

public class UdpateAllEvenPostion {
    public static void main(String[] args) {


        String s = "HelloGuys";
        String g = "";
        for (int i = 0; i < s.length();i++){
            if(i%2==0) g+='a';
            else g+=s.charAt(i);
        }
        System.out.println(g);
    }}
