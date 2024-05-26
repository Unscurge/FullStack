package FileHandling;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\chait\\OneDrive\\Desktop\\NewFile\\welcome.txt");
        if (f.exists()) {
            System.out.println("File Name : " + f.getName());// To get Name of the file
            System.out.println("Path : " + f.getAbsolutePath());// To get file path
            System.out.println("File Writable : " + f.canWrite());// To see weither file is writable or not
            System.out.println("Length : " + f.length());// To find length of elements inside file
            
        }
    }

}
