public class StringMethods {
    public static void main(String[] args) {
        String s="Argentina26";
        System.out.println("length of string s: "+s.length()+"\n"); //.length() method: the length of the string

        System.out.println(s.charAt(0)+"\n"); //.charAt(int i) method: take the character of index i

        System.out.println(s.replace("o", "OO")+"\n");
        /*
        .replace(char old, char new), or .replace(String old, String new):
        replace char (or String) old with char (or String) new in the original string
        if "old" is not in the original string, then the result is not changed
        */

        System.out.println(s.toUpperCase());
        System.out.println(s);
        System.out.println(s.toLowerCase()+"\n");
        /*
        .toUpperCase(), .toLowerCase() method: take the uppercase/lowercase of all the letters in the string
        can't be applied for primitive type 'char'
        only be applied for the result, the original string is not affected
        */

        s="argentina";
        System.out.println(s.indexOf("tina"));
        System.out.println(s.indexOf("Tina"));
        System.out.println(s.indexOf(65)+"\n");
        /*
        .indexOf(String str) method: find the first occurrence of String str in the original string
        if there isn't a String str inside, then return -1
        the same thing is applied for .indexOf(int ch), with "ch" representing the character
        having the ascii value "ch"
        */

        s="hello java i'm sang";
        boolean a=s.startsWith("hello"), b=s.endsWith("Java");
        System.out.println(a+"\n"+b+"\n");
        /*
        .startsWith(String str) (or .endsWith(String str)) method:
        check if the original string starts (or ends) with "str" or not
        */

        String[] words=s.split(" ");
        for (String u : words) System.out.println(u);
        /*
        .split(String str) method: using "str" to split the original string into an array of strings
        */
        System.out.println();
        System.out.println(s.substring(0, 5));
        System.out.println(s.substring(6));
        /*
        +) .substring(int beginIndex, int endIndex) method:
        print a substring of our string from "beginIndex" to "endIndex"
        +) .substring(int beginIndex):
        print a substring starting from index "beginIndex" to the end
        */
    }
}