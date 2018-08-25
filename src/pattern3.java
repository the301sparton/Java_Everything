public class pattern3 {
    public static void main(String[] args) {
        int k = 2*4 - 2;
        for (int i=0; i<4; i++)
        {
             for (int j=0; j<k; j++)
            {
                // printing spaces
                System.out.print(" ");
            }

            k = k - 1;

            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}