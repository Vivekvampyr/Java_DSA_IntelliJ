import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,43,1},
                {-44,66,11},
                {87,54,876}
        };
        int target = 54;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[][] arr,int target){
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
