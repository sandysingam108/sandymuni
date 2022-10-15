public class Findminmax {
    public static void main(String[] args) {
        int[] arr = {12, 56, 48, 64, 84, 52, 60, 72};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    static int max(int[] arr){
        int ans = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
