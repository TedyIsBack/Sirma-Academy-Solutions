import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task5_ExtractFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Path path = Paths.get(sc.nextLine());

        try {
            String fileFullName = path.getFileName().toString();
            String fileName = fileFullName.split("\\.")[0];
            String extention = fileFullName.split("\\.")[1];

            System.out.println("File name: " + fileName);
            System.out.println("File extension: " + extention);
            System.out.println("File size: " + Files.size(path) + " bytes");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
