
public class DemoNullPointer {
    public static void main(String[] args) {
        String text= null;
        
        generateNullPointerExc(text);
    }
    public static void generateNullPointerExc(String text) {
       try {
           System.out.println("Length of the string to generate exception: "+ text.length());
       } catch (NullPointerException e) {
           System.out.println("Caught NullPointerException: "+ e.getMessage());
       }
    }
}