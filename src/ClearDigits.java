public class ClearDigits {
    public String clearDigits(String s) {
        int last=-1, n=s.length();
        char[] myStack=new char[n];

        for (int i=0; i<n; i++){
            char c=s.charAt(i);
            if (c>='a' && c<='z') myStack[++last]=c;
            else if (last>=0) last--;
        }
        return new String(myStack, 0, last+1);
    }
}