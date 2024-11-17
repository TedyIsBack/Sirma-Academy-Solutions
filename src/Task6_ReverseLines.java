import java.io.*;

public class Task6_ReverseLines {

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("./input2.txt"));
            PrintWriter writer = new PrintWriter(new FileWriter("./output.txt"))) {

            String line = reader.readLine();
            while (line != null) {
                writer.write(new StringBuffer(line).reverse().toString() + "\n");
                line = reader.readLine();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
