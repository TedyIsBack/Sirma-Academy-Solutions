import java.io.File;
import java.nio.file.Files;
import java.util.ArrayDeque;
import java.util.Deque;

public class Task9_CalcDirectorySize {

    public static void main(String[] args) {

        String path = "C:\\Users\\User\\IdeaProjects\\HW_StreamsAndFiles";

        File root = new File(path);

        Deque<File> dirs = new ArrayDeque<>();

        dirs.offer(root);

        int count = 0;
        long totalSize = 0;

        while (!dirs.isEmpty()) {

            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();

            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory())
                    dirs.offer(nestedFile);
                else
                    totalSize += nestedFile.length();
            }
        }
        System.out.println(totalSize);
    }
}
