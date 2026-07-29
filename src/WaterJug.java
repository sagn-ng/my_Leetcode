//import java.util.Scanner;
public class WaterJug {
    private static int gcd(int a, int b){
        if (a>=b){
            while (b!=0){
                int r=a%b;
                a=b;
                b=r;
            }
            return a;
        }
        else return gcd(b, a);
    }
    public static boolean canMeasureWater(int x, int y, int target) {
        if (x+y<target) return false;
        int d=gcd(x, y);
        return (target%d==0);
    }
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("x: "); int x=sc.nextInt();
        System.out.print("y: "); int y=sc.nextInt();
        System.out.print("t: "); int target=sc.nextInt();
        sc.close();
        System.out.println(canMeasureWater(x, y, target));
    }*/
}