package streamapi.loggingtransactions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> transactionIds = new ArrayList<>(Arrays.asList("Transaction1","Transaction2","Transaction3"));

        transactionIds.forEach(id ->System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }
}
