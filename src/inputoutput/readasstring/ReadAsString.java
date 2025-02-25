package inputoutput.readasstring;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ReadAsString {


    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        StringBuilder builder = new StringBuilder();

        int ch;
        while ((ch = reader.read()) != -1) {
            builder.append((char) ch);
        }
        return builder.toString();

    }

    public static void main(String[] args) {
        byte[] data = {48, 49, 50, 51};  // Это байты для "0123"
        InputStream inputStream = new ByteArrayInputStream(data);

        // Пример использования метода
        try {
            // Пример использования метода
            String result = readAsString(inputStream, StandardCharsets.US_ASCII);
            System.out.println(result);  // Должно вывести "0123"
        } catch (IOException e) {
            System.err.println("Error reading input stream: " + e.getMessage());
        }
    }
}
