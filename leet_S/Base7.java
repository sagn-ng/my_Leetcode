package leet_S;
import java.util.Scanner;
public class Base7 {
    public static String convertToBase7(int num) {
        int x=0, exp10=1;
        int abs_num=(num>0) ? num : -num;
        while (abs_num>0){
            x+=exp10*(abs_num%7);
            exp10*=10;
            abs_num/=7;
        }
        if (num<0) x=-x;
        String str = Integer.toString(x);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(convertToBase7(n));
    }
}
