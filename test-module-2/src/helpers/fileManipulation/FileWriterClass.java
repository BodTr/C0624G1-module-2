package helpers.fileManipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterClass {
    public void recordFileWriter(String filePath, String data) {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)))) {
            pw.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
