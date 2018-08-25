import java.util.Scanner;

public class NumbTimesSubStringFound {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String line = input.nextLine();
        System.out.print("Enter Sub String to find: ");
        String toFind = input.nextLine();
        int count=0;
        int flag = 0;
        while(flag!=-1){
            flag = line.indexOf(toFind,flag);
            if (flag!=-1){
                count++;
                flag += toFind.length();
            }
        }
        System.out.print("Total times the sub string was found: "+count);

    }
}
