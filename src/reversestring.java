import java.util.Scanner;

public class reversestring {
    static String reverses2(String s){
        if (s.length()==0){
            return " ";
        }
        String smallans = reverses2(s.substring(1));
        return smallans+s.charAt(0);
    }
    static String reverses(String s,int idx){
        if (idx==s.length()){
            return " ";
        }
        String smallans = reverses(s,idx+1);
        return smallans+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverses(s,0));
        System.out.println(reverses2(s));
    }
}
