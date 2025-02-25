package inputoutput.print;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Print {
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int byteValue;

        while ((byteValue = inputStream.read()) != -1) {
            if ((byte) byteValue % 2 == 0) { // Преобразуем в signed byte и проверяем четность
                outputStream.write(byteValue);
            }
        }

        outputStream.flush(); // ✅ ОБЯЗАТЕЛЬНО ДОБАВИТЬ flush()
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{3, 10, 4, 5, 7});
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        print(inputStream, outputStream);

        byte[] array = outputStream.toByteArray();
        for (byte b : array) {
            System.out.println(b);
        }
    }
}