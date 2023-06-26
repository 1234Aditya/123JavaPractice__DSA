public class pbvalue {
    static void changevariable(int a){
        a = a*10;
        System.out.println("Inside change value: "+a);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before change variable "+a);
        changevariable(a);
        System.out.println("After change variable "+a);
    }
}
