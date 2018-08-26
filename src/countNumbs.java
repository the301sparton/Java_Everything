import java.util.List;
import java.util.Scanner;

public class countNumbs {

    public static void main(String[] args) {
        System.out.print("Enter a String of numbers: ");
        int arr[] = new int[10];
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        for (int i = 0; i <10 ; i++) {
            int currentIndex = 0;
            while (currentIndex!=-1) {
                currentIndex = line.indexOf(String.valueOf(i), currentIndex);
                if (currentIndex!=-1) {
                    currentIndex++;
                    arr[i]++;
                }
                else {
                    break;
                }
            }

        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(i+"\t"+arr[i]);
        }

    }
}
