public class CountingBits {
    public int[] countBits(int n) {
        int pow2_max=Integer.MAX_VALUE/2+1; //get the biggest power of 2 that is in type "int"
        int offset=0;
        int[] arr=new int[n+1]; //all the elements are initialized to be 0
        for (int i=1; i<=n; i++){
            if (pow2_max%i==0){
                offset=i;
                arr[i]=1;
            }
            else arr[i]=arr[i-offset]+1;
        } //if n==0 then this "for" block will not be executed
        return arr;
    }
}
