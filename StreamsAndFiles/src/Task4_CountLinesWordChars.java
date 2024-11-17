import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4_CountLinesWordChars {

    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;
        int charsCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("./input2.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                lineCount++;
                for (String word : line.split("\\s+")) {
                    wordCount++;
                    charsCount += word.length();
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("number of lines: " + lineCount);
        System.out.println("number of words: " + wordCount);
        System.out.println("number of chars: " + charsCount);

    }

}
