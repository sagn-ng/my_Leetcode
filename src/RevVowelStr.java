import java.util.Scanner;
public class RevVowelStr {
    public static boolean isVowel(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
    }
    public static String reverseVowels(String s) {
        if (s.length()==1) return s;
        int i=0, j=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while (i<j){
            if (isVowel(s.charAt(i)) && !isVowel(s.charAt(j))){
                j--;
            }
            else if (!isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                i++;
            }
            else if (isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                sb.setCharAt(j, s.charAt(i));
                sb.setCharAt(i, s.charAt(j));
                j--; i++;

            }
            else {j--; i++;}
        }
        String result=sb.toString();
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverseVowels(str));
        sc.close();
    }
}
