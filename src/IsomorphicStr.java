import java.util.Scanner;
public class IsomorphicStr {
    public static boolean isIsomorphic(String s, String t){
        int[] visited_s=new int[256];
        int[] visited_t=new int[256];
        char[] func=new char[256];
        if (s.length()!=t.length()) return false;
        for (int i=0; i<s.length(); i++){
            if (visited_s[s.charAt(i)]==0){
                if (visited_t[t.charAt(i)]==1) return false;
                else{
                    visited_s[s.charAt(i)]=1;
                    visited_t[t.charAt(i)]=1;
                    func[s.charAt(i)]=t.charAt(i);
                }
            }
            else if (func[s.charAt(i)]!=t.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(), t=sc.nextLine();
        sc.close();

        System.out.println(isIsomorphic(s, t));
    }
}