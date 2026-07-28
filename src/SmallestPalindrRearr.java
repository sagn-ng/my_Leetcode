//import java.util.Scanner;
public class SmallestPalindrRearr {
    public static String smallestPalindrome(String s) {
        int n=s.length();
        if (n==1) return s;
        int[] freq=new int[26];
        for (int i=0; i<n/2; i++){
            freq[s.charAt(i)-'a']++;
        }
        char[] result=new char[n]; int l=0;
        if (n%2==1) result[n/2]=s.charAt(n/2);
        for (char c='a'; c<='z'; c++){
            while (freq[c-'a']>0){
                result[l]=result[n-1-l]=c;
                l++;
                freq[c-'a']--;
            }
        }
        return new String(result);
    }
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println(smallestPalindrome(s));
    }*/
}
