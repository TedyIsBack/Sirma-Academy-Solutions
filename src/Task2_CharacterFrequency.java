import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2_CharacterFrequency {

    public static void main(String[] args) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("./input2.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {

                for (int i = 0; i < line.length(); i++) {
                    map.put(line.charAt(i),
                            map.getOrDefault(line.charAt(i), 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
