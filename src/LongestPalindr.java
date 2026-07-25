import java.util.Scanner;

public class LongestPalindr {
    public static int longestPalindrome(String s){
    int[] arr=new int[85];
    int oddCount=0, i, l=0;
        for (i=0; i<s.length(); i++) arr[s.charAt(i)-'A']++;
        for (i=0; i<85; i++){
            l+=arr[i]-(arr[i]%2);
            oddCount+=arr[i]%2;
        }
        if (oddCount!=0) l+=1;
        return l;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println(longestPalindrome(s));
    }
}
