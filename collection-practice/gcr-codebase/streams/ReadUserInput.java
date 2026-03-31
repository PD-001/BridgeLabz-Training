package streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//class to read user input and write to file
public class ReadUserInput {

    public static void main(String[] args) {

        BufferedReader reader= null;
        FileWriter writer= null;

        try {
            reader= new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter name: ");
            String name= reader.readLine();

            System.out.print("Enter age: ");
            int age= Integer.parseInt(reader.readLine());

            System.out.print("Enter programming language: ");
            String language= reader.readLine();

            writer= new FileWriter("user_details.txt");

            writer.write("Name: "+name+"\n");
            writer.write("Age: "+age+"\n");
            writer.write("Favorite Language: "+language+"\n");

            System.out.println("details saved successfully");

        } catch(IOException e) {
            System.out.println("Error while reading or writing data");
        } catch(NumberFormatException e) {
            System.out.println("Invalid age entered");
        } finally {

            try {
                if(reader!=null)
                    reader.close();

                if(writer!=null)
                    writer.close();

            } catch(IOException e) {
                System.out.println("Error while closing resources");
            }
        }
    }
}
