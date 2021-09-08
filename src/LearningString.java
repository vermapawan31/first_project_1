import java.util.Locale;

public class LearningString {

    static String str1 = "I am learning java from udemy";

    public static void main(String[] args) {
        String str = "I am learning java";
        System.out.println(str1.length());
        System.out.println(str.length());
        System.out.println(str.substring(2,10));
        System.out.println(str.charAt(3));
        System.out.println( str1.indexOf('n'));
        System.out.println(str1.contains("java"));
        System.out.println(str1.toUpperCase());
        System.out.println(str.replace("java", "c++"));

        for(int i=0;i<str1.length();i++){
            System.out.println(str1.charAt(i) + " has index "+ i );
        }
        StringBuffer sb=new StringBuffer("i know java");
        System.out.println(sb.append(" and spring"));

    }
}