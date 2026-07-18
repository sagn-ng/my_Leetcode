import java.util.*; //to use the "Scanner" class from the built-in package: java.util
public class UserInput {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter an integer:");
        int x=obj.nextInt();
        System.out.println("You entered the integer: "+x);

        obj.nextLine(); /*nếu k có, '\n' vẫn còn trong bộ nhớ đệm và nextLine() ở dưới sẽ nuốt
        luôn kí tự này và kết thúc việc nhập*/

        System.out.println("\nEnter a string:");
        String s=obj.nextLine();
        System.out.println("You entered the string: "+s);
        obj.close();
    }
}