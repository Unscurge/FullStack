package FileHandling;

import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\chait\\OneDrive\\Desktop\\NewFile\\welcome.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File Created Succesfully");
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
