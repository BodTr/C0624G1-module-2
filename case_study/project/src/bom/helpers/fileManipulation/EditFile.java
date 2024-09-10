package bom.helpers.fileManipulation;

import java.io.*;

public class EditFile {
    public void fileEditor(String filePath, String findId, String data) {
        String tempFile = "project/src/bom/files/temp.csv";
        File oldFile = new File(filePath);
        File newFile = new File(tempFile);

        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile, true)));
             BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.contains(findId)) {
                    pw.println(line);
                } else {
                    pw.println(data);
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        boolean delete = oldFile.delete();
        System.out.println("delete old file result: " + delete);
        boolean renameFile = newFile.renameTo(oldFile);
        System.out.println("rename temp file to old file: " + renameFile);

    }
}
