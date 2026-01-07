package streams;

import java.io.*;

//class to store and retrieve primitive student data
public class DataStreams {

    public static void main(String[] args) {

        DataOutputStream dos= null;
        DataInputStream dis= null;

        try {
            dos= new DataOutputStream(new FileOutputStream("student.dat"));

            //write primitive data
            dos.writeInt(101);
            dos.writeUTF("Rahul");
            dos.writeDouble(8.6);

            System.out.println("Student data stored");

        } catch(IOException e) {
            System.out.println("Error while writing data");
        } finally {

            try {
                if(dos!=null)
                    dos.close();
            } catch(IOException e) {
                System.out.println("Error while closing output stream");
            }
        }

        try {
            dis= new DataInputStream(new FileInputStream("student.dat"));

            //read primitive data
            int rollNo= dis.readInt();
            String name= dis.readUTF();
            double gpa= dis.readDouble();

            System.out.println("Student data retrieved");
            System.out.println("Roll Number: "+rollNo);
            System.out.println("Name: "+name);
            System.out.println("GPA: "+gpa);

        } catch(IOException e) {
            System.out.println("Error while reading data");
        } finally {

            try {
                if(dis!=null)
                    dis.close();
            } catch(IOException e) {
                System.out.println("Error while closing input stream");
            }
        }
    }
}
