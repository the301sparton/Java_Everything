import java.util.Scanner;

public class NumCharStr {

    //Demo on how to take string as input and count number of chars in it.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        System.out.print("Number of Chars = "+ line.length());
    }
}
