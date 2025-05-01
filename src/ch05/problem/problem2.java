package ch05.problem;

public class problem2 {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = {1, 5, 3, 8, 2};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(max);
    }
}
