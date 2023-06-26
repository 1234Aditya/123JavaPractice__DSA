import java.util.Scanner;

public class pallindromer4 {
    static String reverses2(String s){
        if (s.length()==0){
            return "";
        }
        String smallans = reverses2(s.substring(1));
        return smallans+s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = reverses2(s);
        System.out.println(rev);
        if (rev.equals(s)){
            System.out.printf("Yes! %s is a Pallindrome.",s);
        }
        else{
            System.out.println("Not a pallindrome.");
        }
    }
}
