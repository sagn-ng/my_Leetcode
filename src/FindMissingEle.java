import java.util.ArrayList;
import java.util.List;

public class FindMissingEle {
    public List<Integer> findMissingElements(int[] nums) {
        int max=1, min=100;
        int[] count=new int[101];
        for (int u: nums){
            if (u>max) max=u;
            if (u<min) min=u;
            count[u]++;
        }

        List<Integer> result=new ArrayList<>();
        for (int i=min; i<=max; i++){
            if (count[i]==0) result.add(i);
        }
        return result;
    }
}
