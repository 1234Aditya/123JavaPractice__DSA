import java.util.Scanner;

public class pallindromer6 {
    static boolean ispallindrome(String s,int l,int r){
        if(l>=r){
            return true;
        }
        return (s.charAt(l) == s.charAt(r) && ispallindrome(s,l+1,r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(ispallindrome(s,0,s.length()-1));
    }
}
