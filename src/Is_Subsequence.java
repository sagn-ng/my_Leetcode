import java.util.Scanner;
public class Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int p1=0, p2=0;
        while (p2<t.length()){
            if (p1==s.length()) return true;
            if (s.charAt(p1)==t.charAt(p2)){
                p1++; p2++;
            }
            else p2++;
        }
        return (p1==s.length());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        sc.close();

        System.out.println(isSubsequence(s, t));
    }
}
