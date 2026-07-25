import java.util.Scanner;
public class PalindrNum {
    public static boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int a=0;
        while (x>a){
            a=10*a+(x%10);
            x/=10;
        }
        return (x==a || x==a/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(isPalindrome(n));
    }
}
