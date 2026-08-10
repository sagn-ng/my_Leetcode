public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int total=0, leftSum=0;
        for (int u : nums) total += u;
        for (int i=0; i<nums.length; i++){
            int rightSum=total-leftSum-nums[i];
            if (rightSum==leftSum) return i;
            leftSum += nums[i];
        }
        return -1;        
    }
}