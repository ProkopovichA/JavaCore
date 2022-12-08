package lesson_12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class TestClass {

    public static void ioWrite() {
        try (final FileOutputStream fos = new FileOutputStream("employees.data");
             final ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeInt(300);
            oos.writeObject("Test Message");
            oos.writeObject(LocalDateTime.now());
            oos.writeObject(new Employee("John", "Doe", 24));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ioRead() {
        try (final FileInputStream fis = new FileInputStream("employees.data");
             final ObjectInputStream ois = new ObjectInputStream(fis)) {

            final int num = ois.readInt();
            final String message = (String) ois.readObject();
            final LocalDateTime time = (LocalDateTime) ois.readObject();
            final Employee employee = (Employee) ois.readObject();

            System.out.println(num);
            System.out.println(message);
            System.out.println(time);
            System.out.println(employee);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
