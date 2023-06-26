import java.util.Scanner;

public class rotatematrix {
    static void transposeinplace(int[][] matrix,int r,int c){
        for (int i = 0;i < c;i++){
            for (int j = i;j < r;j++){
                //Swap matrix[i][j] ,matrix [j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix [j][i];
                matrix [j][i] = temp;
            }
        }
    }
    static void reversearray(int[] arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int [][] matrix,int n){
        // Step1: transpose.
        //Step2: reverse each row.
        transposeinplace(matrix,n,n);
        for(int i = 0;i < n;i++){
            reversearray(matrix[i]);
        }

    }
    static  void printArray(int [][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matrix 1");
        System.out.print("Enter number of rows: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c1 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];   //total = r*c
        System.out.print("Enter " + r1 * c1 + " elements: ");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix: ");
        printArray(arr1);

        rotate(arr1,r1);

        System.out.println("Rotation of matrix: ");
        printArray(arr1);

    }
}
