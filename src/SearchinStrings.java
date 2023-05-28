public class SearchinStrings {
    public static void main(String[] args) {
        String name = "Vivek";
        char target = 'e';
        System.out.println(stringSeach2(name,target));
    }
    static boolean stringSeach(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean stringSeach2(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
