import java.io.*;

public class Task3_ReplaceWord {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("./input2.txt"));
             PrintWriter writer = new PrintWriter(new FileWriter("./output.txt"))) {

            String line = reader.readLine();
            String wordToReplace = line.split("->")[0].trim();
            String replaceWith = line.split("->")[1].trim();
            line = reader.readLine();

            while (line != null) {
                for (String word : line.split(" ")) {

                    if(word.equals(wordToReplace)) {
                        writer.write(replaceWith + " ");
                    }else {
                        writer.write(word + " ");
                    }
                }
                line = reader.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
