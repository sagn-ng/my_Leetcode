//leetcoe 3090: maximum length of substring with 2 occurences
public class Leet3090 {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int i=0, res=0;
        for (int j=0; j<s.length(); j++){
            char c=s.charAt(j);
            freq[c-'a']++;
            while (freq[c-'a']>2){
                char rm=s.charAt(i);
                freq[rm-'a']--;
                i++;
            }
            res=Math.max(res, j-i+1);
        }
        return res;
    } //sliding window strategy
}