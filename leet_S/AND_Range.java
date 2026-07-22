package leet_S;
import java.util.Scanner;
public class AND_Range {
    public static int rangeBitwiseAnd(int left, int right){
        int shiftCount=0;
        while (left < right){
            left>>=1; right>>=1;
            shiftCount++;
        }
        return left<<shiftCount;
    }
/*phép lấy AND các số liên tiếp sẽ cho ra tất cả là 0 từ bit đầu tiên khác nhau đến cuối (đếm từ trái sang)
do đó ta dịch bit cả left và right đến khi chúng bằng nhau, đó là kết quả
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int left=sc.nextInt(), right=sc.nextInt();
        sc.close();
        System.out.println(rangeBitwiseAnd(left, right));
    }
}
