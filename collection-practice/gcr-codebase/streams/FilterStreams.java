package streams;

import java.io.*;

//class to convert uppercase to lowercase using filter streams
public class FilterStreams {

    public static void main(String[] args) {

        BufferedReader reader= null;
        BufferedWriter writer= null;

        try {
            reader= new BufferedReader(new FileReader("E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\streams\\source.txt"));
            writer= new BufferedWriter(new FileWriter("E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\streams\\outputforfilterstreams.txt"));

            int ch;

            //read character by character
            while((ch=reader.read())!=-1) {
                char c= (char) ch;
                writer.write(Character.toLowerCase(c));
            }

            System.out.println("File converted successfully");

        } catch(IOException e) {
            System.out.println("Error while reading or writing file");
        } finally {

            try {
                if(reader!=null)
                    reader.close();

                if(writer!=null)
                    writer.close();

            } catch(IOException e) {
                System.out.println("Error while closing files");
            }
        }
    }
}
