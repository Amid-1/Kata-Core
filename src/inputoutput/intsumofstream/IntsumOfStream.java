package inputoutput.intsumofstream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IntsumOfStream {

    int sum = 0;
    public int sumOfStream(InputStream inputStream) throws IOException {

        int byteValue; // Значение байта потока (0...255)

        while ((byteValue = inputStream.read()) != -1) { // Читаем байт до тех пор, пока не достигнем конца потока (-1)
            sum += (byte) byteValue; // Преобразуем в знаковый byte (-128...127)
        }

        return sum;
    }

    public static void main(String[] args) {
        byte[] buffer = {4, 12, 1, 81};
        InputStream inputStream = new ByteArrayInputStream(buffer);
        IntsumOfStream intsumOfStream = new IntsumOfStream();
        try {
            intsumOfStream.sumOfStream(inputStream);
            System.out.println(intsumOfStream.sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
