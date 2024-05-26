package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) throws IOException {
        try {
            FileReader f = new FileReader("C:\\Users\\chait\\OneDrive\\Desktop\\NewFile\\welcome.txt");
            try {
                int i;
                while ((i = f.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                f.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
