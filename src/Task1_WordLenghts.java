import java.io.*;

public class Task1_WordLenghts {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("./input2.txt"))) {
            String line = reader.readLine();
            while(line != null) {
                for (String word : line.split(" ")) {
                    System.out.print(word.length() + " ");
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}