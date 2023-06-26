import java.util.Scanner;

public class removearrr2 {
    static String removea2(String s){
        if (s.length()==0){
            return " ";
        }
        String smallans = removea2(s.substring(1));
        char curr = s.charAt(0);
        if (curr == 'a'){
            return smallans;
        }
        return curr +smallans;
    }
    static String removea(String s,int idx){
        if (idx==s.length()){
            return " ";
        }
        String smallans =  removea(s,idx+1);
        if (s.charAt(idx)=='a'){
            return smallans;
        }
        return s.charAt(idx)+smallans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(removea(s,0));
        System.out.println(removea2(s));
    }
}
