class Arrayexample{
    void multiarray(){
        //int [][] newarr1 = new int[5][2];
        int [][] newarr2 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(newarr2[0][0]);
        System.out.println(newarr2[0][1]);
        System.out.println(newarr2[0][2]);
        System.out.println(newarr2[1][0]);
    }
    void demoarray(){
        int [] ages = new int [3];
        String [] name = {"Aditya","Sethi","Nikhil","Sharma"};
        ages[0]= 112;
        ages[1]=12;
        ages[2] = 32;
        //ages[5] = 65;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        //System.out.println(ages[5]);

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        System.out.println(ages.length);
        System.out.println(name.length);
    }
}
public class array1 {
    public static void main(String[] args) {
         Arrayexample obj = new Arrayexample();
         obj.demoarray();
         Arrayexample obj2 = new Arrayexample();
         obj2.multiarray();
    }
}
