import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileInJAVA {
    public static void main (String[] args) throws IOException
    {
        String line;
        BufferedReader in;

        in = new BufferedReader(new FileReader("lol.txt"));
        line = in.readLine();

        while(line != null)
        {
            System.out.println(line);
            line = in.readLine();
        }

        System.out.println(line);
    }

}
