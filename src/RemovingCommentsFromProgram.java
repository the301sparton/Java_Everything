import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class RemovingCommentsFromProgram {

        public static void main (String[] args) throws IOException
        {
            List<String> all_lines = null;
            String line;

            BufferedReader in;
            String[] slpits = new String[0];
            in = new BufferedReader(new FileReader("lol.txt"));
            line = in.readLine();
            while(line != null)
            {
                int flag =0;
                if (line.contains("//")){
                    slpits = line.split("//");
                    flag =1;
                }
                if(flag ==0) {
                    assert false;
                    all_lines.add(line);
                }
                else{
                    assert false;
                    all_lines.add(slpits[1]);
                }
                line = in.readLine();
            }
    }
}
