import java.util.Arrays;
import java.util.Scanner;
public class CountPrimes {
    public static int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] isPrime= new boolean[n];
    /* we only count primes that are strictly less than n
    isPrime[] is the array that stores the state "being a prime" of numbers from 0 to n-1
    */
        Arrays.fill(isPrime, true);
        isPrime[0]=isPrime[1]=false;
        for(int i=2; i*i<n; i++){
            if (isPrime[i]){
                for(int j=i*i; j<n; j+=i) isPrime[j]=false;
            }
        /*
        here we can obviously count j from 2i, but (for n>2) 2 is the first number we take into
        the loop of i. It's a prime number, thus we count j from 4, then 6,..., including 2i
        So if we choose j=3i,...(i-1)i, these are also unnecessary as they're all processed when
        j=2i at the start
        */
        }
        int count=0;
        for(int i=2; i<n; i++){
            if (isPrime[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(countPrimes(n));
    }
}
