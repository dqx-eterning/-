import java.util.ArrayList;

public class offer04二维数组中的查找 {
    public static void main(String[] args) {
        /*int[][] arr = {{1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,23,21,26,30}};*/
        int[][] arr1 = {{-5}};
       /* System.out.println(arr[1][3]);
        System.out.println(arr.length);//行数
        System.out.println(arr[0].length);//列数*/
        System.out.println(findNumberIn2DArray(arr1,-5));

    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while(row < m && col >= 0) {
            if(matrix[row][col] > target) {
                col--;
            }else if(matrix[row][col] < target) {
                row++;
            }else {
                return true;
            }
        }
        return false;
    }
}
