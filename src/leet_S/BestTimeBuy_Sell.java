package leet_S;
import java.util.Scanner;
public class BestTimeBuy_Sell {
    public static int maxProfit(int[] prices) {
        int buyPr=prices[0], profit=0;
        for (int i=1; i < prices.length; i++){
            if (buyPr>prices[i]) buyPr=prices[i];
            profit=Math.max(profit, prices[i]-buyPr);
        }
        return profit;        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] str1=str.split(" ");
        sc.close();

        int[] prices=new int[str1.length];
        for (int i=0; i<str1.length; i++) prices[i]=Integer.parseInt(str1[i]);
        System.out.println(maxProfit(prices));
    }
}
