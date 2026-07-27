//import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BuildArrStack {
    public static List<String> buildArray(int[] target, int n) {
        int[] in_target=new int[n+1];
        for (int u: target) in_target[u]=1;
        List<String> arr=new ArrayList<String>();
        for (int i=1; i<=n; i++){
            arr.add("Push");
            if (i==target[target.length-1]) break;
            if (in_target[i]==0) arr.add("Pop");
        }
        return arr;
    }

    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(); int n=sc.nextInt();
        sc.close();

        String[] str1=str.split(" ");
        int[] target=new int[str1.length];
        for (int i=0; i<str1.length; i++) target[i]=Integer.parseInt(str1[i]);

        System.out.println(buildArray(target, n));
    }*/
}
