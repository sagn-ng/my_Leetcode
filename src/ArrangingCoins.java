//import java.util.Scanner;
public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        double delta_ = 1.0/4.0+2.0*n;
        double r=-0.5+Math.sqrt(delta_);
        return (int) r;
    }
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); sc.close();
        System.out.println(arrangeCoins(n));
    }*/
}
