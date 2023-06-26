public class maxofarr {
    public static void main(String[] args) {
        int [] ages = {0,1,23,4,25,298,297,29,87};
        int max = ages[0];
        for (int i = 1;i<ages.length;i++){
            if (max<ages[i]){
                max = ages[i];
            }
        }
        System.out.println(max);
    }
}
