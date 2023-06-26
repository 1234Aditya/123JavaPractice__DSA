class Questions{
    static int numofocc(int a,int [] arr){
        int count = 0;
        for (int i = 0;i<arr.length;i++){
            if (a == arr[i])
                count++;
        }
        return count;
    }
}
public class occurenceinarr {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,51,2,3,41,1,1,6,7,1,1,1,1,1};
        int ans = Questions.numofocc(1,numbers);
        System.out.println("Total number of occurences : "+ans);

    }
}
