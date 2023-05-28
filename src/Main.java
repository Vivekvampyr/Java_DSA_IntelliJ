public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,4,6,123,5,9};
        int target = 6;
        int ans = linearSearch(nums,target);
        System.out.println(linearSearch2(nums,target));
        System.out.println(ans);
    }


    static int linearSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            // check whether the targeted element is present in the array or not?
            int element = arr[i];
            if (element == target){
                return i  ;
            }
        }
        // This will execute if non of the above it tree
        // so the element is not found
        return -1;
    }

    static boolean linearSearch2(int[] arr,int target){
        if (arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            // check whether the targeted element is present in the array or not?
            int element = arr[i];
            if (element == target){
                return true;
            }
        }
        // This will execute if non of the above it tree
        // so the element is not found
        return false;
    }
}
