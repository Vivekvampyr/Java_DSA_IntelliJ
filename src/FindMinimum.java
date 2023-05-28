public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,-2,11,1};
        System.out.println(min(arr));
    }
    // assume arr.length != 0
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
