/*import java.util.Scanner;*/
// -1000 <= nums[i] <= 1000
public class MaxProdThree {
    public static int maximumProduct(int[] nums) {
        int max1=-1000, max2=-1000, max3=-1000, min1=1000, min2=1000;
        for (int u: nums){
            if (u>max1){
                max3=max2; max2=max1; max1=u;
            }
            else if (u>max2){
                max3=max2; max2=u;
            }
            else if (u>max3) max3=u;

            if (u<min1){
                min2=min1; min1=u;
            }
            else if (u<min2) min2=u;
        }

        if (max1>=0){
            return (max2*max3>min1*min2) ? max1*max2*max3 : max1*min1*min2;
        }
        else return max1*max2*max3;
    }

    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();

        String[] str1=str.split(" ");
        int[] nums=new int[str1.length];
        for (int i=0; i<str1.length; i++) nums[i]=Integer.parseInt(str1[i]);

        System.out.println(maximumProduct(nums));
    }*/
}