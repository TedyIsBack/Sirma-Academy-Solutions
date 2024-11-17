import java.io.*;

public class Task10_CopyFileContent {

    public static void main(String[] args) {

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("./input.txt"));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("./output.txt"))) {

            in.transferTo(out);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
