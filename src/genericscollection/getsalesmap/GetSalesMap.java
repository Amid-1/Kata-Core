package genericscollection.getsalesmap;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetSalesMap {
    public static Map<String, Long> getSalesMap(Reader reader) {
        HashMap<String, Long> map = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            String name = scanner.next();
            long sum = scanner.nextLong();
            map.merge(name, sum, Long::sum);
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, Long> map = getSalesMap(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(map);

    }
}
