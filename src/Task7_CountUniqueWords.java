import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Task7_CountUniqueWords {

    public static void main(String[] args) {
        Set<String> uniqueWords = new HashSet<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("./input2.txt"))) {
            String line = reader.readLine();
            while(line != null) {
                for (String word : line.split(" ")) {
                    String cleanWord = word.replaceAll("[^a-zA-Z]", "");//^ в [] означава, че ако намери special chars ще ги замени с ""
                    uniqueWords.add(cleanWord);
                }
                line = reader.readLine();

            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(uniqueWords.size());
    }

}
