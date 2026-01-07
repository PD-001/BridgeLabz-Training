package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteInFile {

    public static void main(String[] args) {

        String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\streams\\source.txt";
        String destinationFile= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\streams\\destination.txt";

        FileInputStream fis= null;
        FileOutputStream fos= null;

        try {
            fis= new FileInputStream(source);
            fos= new FileOutputStream(destinationFile);

            int data;
            while ((data=fis.read())!=-1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Source file not found or error while reading/writing file.");

        } finally {
            try {
                if (fis!=null) {
                    fis.close();
                }
                if (fos!=null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing files.");
            }
        }
    }
}
