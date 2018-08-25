import java.util.Scanner;

public class ReplaceAllSubStrings {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String line = input.nextLine();
        System.out.print("Enter Sub String to replace: ");
        String toFind = input.nextLine();
        System.out.print("What to replace with..? : ");
        String replacement = input.nextLine();

        line = line.replaceAll(toFind,replacement);
        System.out.print("New String is :"+line);
    }
}
