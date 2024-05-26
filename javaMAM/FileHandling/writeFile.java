package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args) {
            try {
                FileWriter f1 = new FileWriter("C:\\Users\\chait\\OneDrive\\Desktop\\NewFile\\welcome.txt");// To write
                                                                                                            // content
                                                                                                            // inside
                                                                                                            // the file
                try {
                    f1.write("Hello Chaitanya bro");
                } finally {
                    f1.close();
                }
                System.out.println("File Wrote Succesfully");
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
    
}
