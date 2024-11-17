import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task11_SerializeDesirializeMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Marry", 1);
        map.put("Jack", 2);
        map.put("Mickey", 3);

        serialize(map,"./map.ser");
        System.out.println(deserialize("./map.ser"));

    }

    static void serialize(Map<String, Integer> map, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(map);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static Map<String, Integer> deserialize(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {

            return (Map<String, Integer>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }


}
