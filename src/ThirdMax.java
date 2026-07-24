package leet_S;
import java.util.Scanner;
public class ThirdMax {
    public static int thirdMax(int[] nums){
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        for (int x: nums){
            long u=x;
            if (u==max1 || u==max2 || u==max3) continue;
            if (u>max1){
                max3=max2;
                max2=max1;
                max1=u;
            }
            else if (u>max2){
                max3=max2;
                max2=u;
            }
            else if (u>max3) max3=u;
        }
        if (max3==Long.MIN_VALUE) return (int) max1;
        else return (int) max3;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] str1=str.split(" ");

        int[] nums=new int[str1.length];
        for (int i=0; i<str1.length; i++){
            nums[i]=Integer.parseInt(str1[i]);
        }
        sc.close();

        System.out.println(thirdMax(nums));
    }
}