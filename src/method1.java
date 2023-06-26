class Algebra{
    public static int sum(int a, int b){
        int c = a+b;
        return c;
    }
}
public class method1{
    static void welcome(){
        System.out.println("Welcome to the new journey!");
    }

    public static void main(String[] args) {
        welcome();
        Algebra obj = new Algebra();
        System.out.println(obj.sum(23,45));
        System.out.println(Math.pow(2,4));
        System.out.println(Math.max(24,56));
        System.out.println(Math.floor(4.2));
        System.out.println(Math.ceil(4.3));
        System.out.println(Math.min(23,68));
    }
}
