import java.util.Scanner;

public class GenerateSpiral {
    static  void PrintArray(int [][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static  int[][] generatespiralorder(int n){
        int [][] matrix = new int [n][n];
        int toprow = 0,bottomrow = n-1,leftcol = 0,rightcol = n-1;
        int curr = 1;
        while(curr <= n*n){
            //toprow ->left col to right col
            for (int j = leftcol;j<= rightcol && curr <= n*n;j++){
                matrix[toprow][j] = curr++;
            }
            toprow++;
            //rightcol -> tooprow to bottomrow
            for (int i = toprow;i<=bottomrow && curr < n*n;i++){
                matrix[i][rightcol] = curr++;
            }
            rightcol--;
            //bottomrow -> rightcol to leftcol
            for (int j = rightcol;j>=leftcol && curr < n*n;j--){
                matrix[bottomrow][j] = curr++;
            }
            bottomrow--;
            //leftcol -> bottomrow to toprow
            for (int i = bottomrow;i>=toprow && curr < n*n;i--){
                matrix[i][leftcol] = curr++;
            }
            leftcol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int [][] matrix = generatespiralorder(n);
        PrintArray(matrix);
    }
}
