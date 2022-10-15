public class Searchinrange {
    public static void main(String[] args) {
        int[] arr = {12, 56, 48, 64, 84, 52, 60, 72};
        int and = 84;
        System.out.println(linearSearch(arr, and, 1, 5));
    }
    static int linearSearch(int[] arr,int tar,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i =start; i<=end ; i++){
            if(arr[i] == tar) {
                return i;
            }
        }
        return -1;
    }
}
