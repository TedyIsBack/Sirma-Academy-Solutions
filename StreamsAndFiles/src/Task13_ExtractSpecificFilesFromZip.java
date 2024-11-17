import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Task13_ExtractSpecificFilesFromZip {

    public static void main(String[] args) {

        try (ZipInputStream in = new ZipInputStream(new FileInputStream("archive.zip"))) {
            ZipEntry zipEntry;

            while ((zipEntry = in.getNextEntry()) != null) {
                if (zipEntry.getName().endsWith(".txt")) {
                    File extractedFile = new File("extracted_files", zipEntry.getName());

                    //прехвърляне на съдържанието
                    try (FileOutputStream out = new FileOutputStream(extractedFile)) {
                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = in.read(buffer)) != -1) {
                            //чете от буфера от началото до определена дължина length
                            out.write(buffer, 0, length);
                        }
                    }
                }
                in.closeEntry();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
