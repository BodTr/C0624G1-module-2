package helpers.fileManipulation;

import entities.medicalrecords.MedicalRecord;
import entities.medicalrecords.NormRecord;
import entities.medicalrecords.VIPRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderClass {
    public List<MedicalRecord> recordsFileReader(String filePath) {
        List<MedicalRecord> medicalRecords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] data = line.split(",");
                MedicalRecord record;
                if (data.length == 8) {
                    record = new NormRecord(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4], data[5], data[6], Double.parseDouble(data[7]));
                } else {
                    record = new VIPRecord(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8]);
                }
                medicalRecords.add(record);
            }
            return medicalRecords;
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
            return null;
        }
    }
}
