import java.io.*;

public class Task8_MergeLinesFromTwoFiles {

    public static void main(String[] args) {

        try (BufferedReader reader1 = new BufferedReader(new FileReader("./input1.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("./input2.txt"));
             PrintWriter writer = new PrintWriter(new FileWriter("./output.txt"))) {

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            boolean isEmpty1 = line1 != null, isEmpty2 = line2 != null;

            while (isEmpty1 && isEmpty2) {

                writer.println(line1);
                writer.println(line2);

                isEmpty1 = (line1 = reader1.readLine()) != null;
                isEmpty2 = (line2 = reader2.readLine()) != null;

            }
            while (line1 != null) {
                writer.println(line1);
                line1 = reader1.readLine();
            }

            while (line2 != null) {
                writer.println(line2);
                line2 = reader2.readLine();
            }


        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
