public class StringMethods {
    public static void main(String[] args) {
        String s="Argentina";
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
    }
}