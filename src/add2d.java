import java.util.Scanner;

public class add2d {
    static void printarr(int[][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void add(int [][] arr1,int r1,int c1,int[][] arr2,int r2,int c2){
        if (r1 == r2 && c1 == c2){
            int ans[][] = new int[r1][c1];
            for (int i = 0;i<r1;i++){
                for (int j =0;j<c1;j++){
                    ans[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            printarr(ans);
        }
        else {
            System.out.println("Wrong input!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows for matrix1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns for matrix1: ");
        int c1 = sc.nextInt();
        int [][] arr1 = new int[r1][c1];
        System.out.println("Enter "+r1*c1+ " elements: ");
        for (int i = 0;i<r1;i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        printarr(arr1);
        System.out.println("Enter number of rows for matrix2: ");
        int r2 = sc.nextInt();
        System.out.println("Enter number of columns for matrix2: ");
        int c2 = sc.nextInt();
        int [][] arr2 = new int[r2][c2];
        System.out.println("Enter "+r2*c2+ " elements: ");
        for (int i = 0;i<r2;i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        printarr(arr2);
        System.out.println();
        add(arr1,r1,c1,arr2,r2,c2);
    }
}
