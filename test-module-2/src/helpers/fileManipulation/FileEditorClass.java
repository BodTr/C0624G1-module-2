package helpers.fileManipulation;

import entities.constant_variable.Constants;

import java.io.*;

public class FileEditorClass {
    public void  editFile(String filePath, String findCode, String data) {
        String tempFilePath = Constants.TEMP_FILE_PATH;
        File oldFile = new File(filePath);
        File newFile = new File(tempFilePath);

        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFilePath, true)));
             BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.contains(findCode)) {
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
