public class swap2 {
    static void swapping(int a, int b){
        System.out.println("Original values before swap:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a = a+b;     //a = 12
        b = a-b;     //b = 9
        a = a-b;     //a = 3

        System.out.println("Original values after swap:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swapping(a,b);
    }
}
