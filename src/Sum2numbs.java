import java.util.Scanner;

class Main {
//This shows basic input and output ops in JAVA.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,sum;
        x = input.nextInt();
        y = input.nextInt();
        sum = x+y;
        System.out.print("Sum = "+sum);
    }
}
