package m1practiceproblem.set4.dynamictemplateprocessor;

import java.util.*;
import java.util.regex.*;
import java.time.*;
import java.time.format.*;

public class Main {

    private static String processPlaceholder(String type, String value) {

        try {

            switch(type) {

                case "UPPER":
                    return value.toUpperCase();

                case "LOWER":
                    return value.toLowerCase();

                case "REPEAT":
                    String[] arr = value.split(",");
                    String word = arr[0];
                    int count = Integer.parseInt(arr[1]);

                    return word.repeat(count);

                case "DATE":
                    DateTimeFormatter input = DateTimeFormatter.ofPattern("dd-MM-uuuu");
                    DateTimeFormatter output = DateTimeFormatter.ofPattern("yyyy/MM/dd");

                    LocalDate date = LocalDate.parse(value, input);

                    return date.format(output);

                default:
                    return "INVALID";
            }

        } catch(Exception e) {
            return "INVALID";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Pattern pattern = Pattern.compile("\\$\\{([A-Z]+):([^}]+)}");

        while(n-- > 0) {

            String line = sc.nextLine();

            Matcher matcher = pattern.matcher(line);

            StringBuffer result = new StringBuffer();

            while(matcher.find()) {

                String type = matcher.group(1);
                String value = matcher.group(2);

                String replacement = processPlaceholder(type, value);

                matcher.appendReplacement(result, replacement);
            }

            matcher.appendTail(result);

            System.out.println(result);
        }
    }
}