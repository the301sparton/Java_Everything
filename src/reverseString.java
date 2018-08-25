import java.util.Scanner;

public class reverseString {

    //Demo on how to Reverse a String.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String revStr = "";
        for (int i = line.length()-1; i>=0;i--){
            revStr = revStr + line.charAt(i);
        }
        System.out.print("Reverse is "+ revStr);
    }
}
