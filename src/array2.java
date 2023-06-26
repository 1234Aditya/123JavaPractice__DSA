public class array2 {
    public static void main(String[] args) {
        int [] ages = {4,5,6,7,8,10};
        //Using for loop
       /* for (int i = 0;i<ages.length;i++){
            System.out.println(ages[i]);
        }
        */
        //Using for-each loop
        /*for (int age : ages){
            System.out.println(age);
        }
         */
        //Using while loop
        int i =0;
        while (i<ages.length){
            System.out.println(ages[i]);
            i++;
        }
    }
}
