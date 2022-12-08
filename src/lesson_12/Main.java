package lesson_12;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt",true))) {
//            bw.write("line 1");
//            bw.newLine();
//            bw.write("line 2");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
//           String line;
//           while ((line = br.readLine()) != null) {
//               System.out.println(line);
//           }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //TestClass.ioWrite();
        //TestClass.ioRead();

        FileCreator.CreateFile("in1.txt");
        FileCreator.CreateFile("in2.txt");
        SortingAndMergingFiles.Run();



    }


}
