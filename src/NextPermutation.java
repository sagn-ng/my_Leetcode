//import java.util.Scanner;
public class NextPermutation {
    private static void swap(int[]nums, int i, int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    private static void reverse(int[]nums, int start, int end){
        while (start<end){
            swap(nums, start, end);
            start++; end--;
        }
    }
    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        if (n == 1) return;
        int incre_idx;
        for (incre_idx = n - 2; incre_idx >= 0; incre_idx--){
            if (nums[incre_idx] < nums[incre_idx + 1]) break;
        }
        if (incre_idx == -1){
            reverse(nums, 0, n-1);
            return;
        }
        int j = n - 1, min_last = 100, k=0;
        while (j > incre_idx){
            if (nums[j] > nums[incre_idx] && min_last > nums[j]){
                min_last = nums[j];
                k = j;
            }
            j--;
        }
        swap(nums, incre_idx, k);
        reverse(nums, incre_idx+1, n - 1);
        return;
    }
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();

        String[] str1=str.split(" ");
        int[] nums=new int[str1.length];
        for (int i=0; i<str1.length; i++) nums[i]=Integer.parseInt(str1[i]);

        nextPermutation(nums);
        for (int u: nums) System.out.print(u+" ");
    }*/
}