//import java.util.Scanner;
public class BckStrCmp {
    public static boolean backspaceCompare(String s, String t) {
        String s1=newString(s), t1=newString(t);
        return (s1.equals(t1));
    }
    private static String newString(String s){
        char[] arr =new char[s.length()]; //arr is a stack
        int l=0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)!='#'){
                arr[l++]=s.charAt(i);
            }
            else if (i>0 && l>0) arr[l--]='\0';
        }
        String result=new String(arr);
        return result;
    }

    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        sc.close();
        System.out.println("New string after backspaces");
        System.out.println(newString(s)); System.out.println(newString(t));
        System.out.println("Comparison result: "+backspaceCompare(s, t));
    }*/
}
