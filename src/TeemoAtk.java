import java.util.Scanner;
public class TeemoAtk {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int total_time=0;
        for (int i=0; i<timeSeries.length-1; i++){
            if (timeSeries[i] + duration - 1 >= timeSeries[i+1]){
                total_time += timeSeries[i+1] - timeSeries[i];
            }
            else total_time += duration;
        }
        total_time += duration;
        return total_time;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] str1=str.split(" ");

        int[] timeSeries=new int[str1.length];
        for (int i=0; i<str1.length; i++){
            timeSeries[i]=Integer.parseInt(str1[i]);
        }
        int duration=sc.nextInt();
        sc.close();

        System.out.println(findPoisonedDuration(timeSeries, duration));
    }
}
