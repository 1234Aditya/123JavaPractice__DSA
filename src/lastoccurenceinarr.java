class Questions1{
    static int lastocc(int a,int [] arr){
        int lastindex = -1;
        for (int i = 0;i<arr.length;i++){
            if (a == arr[i])
                lastindex = i;
        }
        return  lastindex;
    }
}
public class lastoccurenceinarr {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,51,2,3,4};
        int ans = Questions1.lastocc(4,numbers);
        System.out.println("last occurence : "+ans);

    }
}
