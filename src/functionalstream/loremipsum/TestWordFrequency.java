package functionalstream.loremipsum;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class TestWordFrequency {
    public static void main(String[] args) throws IOException {
        Charset charset = Charset.forName("UTF-8");
        String text = "Lorem ipsum dolor sit amet, "
                + "consectetur 32 adipiscing elit. "
                + "Sed sodales consectetur purus at faucibus."
                + " Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. "
                + "Morbi lacinia velit blandit 32 tincidunt 32 efficitur. "
                + "Vestibulum eget metus imperdiet sapien laoreet faucibus. "
                + "Nunc eget vehicula mauris, ac auctor lorem. 32 Lorem ipsum dolor sit amet,"
                + " consectetur adipiscing elit. Integer vel odio 32 nec mi tempor dignissim.";

        ByteArrayInputStream textInput = new ByteArrayInputStream(text.getBytes(charset));
        WordFrequency.countOfWords(textInput, charset);
    }
}

/*
public class WordFrequencyTest {
    public static void main(String[] args) {
        testWordFrequency();
    }

    public static void testWordFrequency() {
        String input = """
                Мама мыла-мыла-мыла раму!
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                Sed sodales consectetur purus at faucibus.
                123 123 123 456 789 123
                Тест ТЕСТ тест тестирование
                """;

        String expectedOutput = """
                123
                consectetur
                тест
                мыла
                amet
                dolor
                elit
                faucibus
                ipsum
                lorem
                """;

        ByteArrayInputStream testInput = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setIn(testInput);
        System.setOut(new PrintStream(testOutput));

        WordFrequency.main(new String[]{});

        String actualOutput = testOutput.toString().trim();
        if (expectedOutput.trim().equals(actualOutput)) {
            System.out.println("Тест пройден!");
        } else {
            System.out.println("Тест провален!");
            System.out.println("Ожидалось:\n" + expectedOutput);
            System.out.println("Получено:\n" + actualOutput);
        }
    }
}
 */