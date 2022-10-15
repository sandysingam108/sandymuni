public class LinearSear {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 4;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return -1;
    }
}
// change function to boolean for cases -1 being a element and return true or false case