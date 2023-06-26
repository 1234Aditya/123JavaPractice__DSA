class Algebra1{
    int a;
    int b;
    Algebra1(int x,int y){
        a= x;
        b=y;
        System.out.println("Constructor called!!!");
    }
    int sum1(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}
public class constructor {
    public static void main(String[] args) {
        Algebra1 obj = new Algebra1(22,2);
        System.out.println(obj.sum1());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
    }
}
