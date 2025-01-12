package String;

public class Stringcon {
  public static void main(String[] args) {
    String a="abc";
    String b="efg";
    String c="abc";
    String d="ab";
    d=d+'c';
    String m=new String("ABC");
    String n=new String("ABC");
    System.out.println(a==c);
    System.out.println(a.equals(c));
    System.out.println(a==d);
    System.out.println(a.equals(d));
    System.out.println(m==n);
    System.out.println(m.equals(n));
    System.out.println(1+"2");
    System.out.println(10+20+"zyz");
    System.out.println("abc"+10+20);
  }
  
}
