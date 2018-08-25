import java.util.Scanner;

public class findSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String line = input.nextLine();
        System.out.print("Enter Sub String to find: ");
        String toFind = input.nextLine();

        if (line.contains(toFind)){
            System.out.print("Sub String Found");
        }
        else {
            System.out.print("Sub String NOT Found");
        }

    }
}
