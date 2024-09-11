package entities.medicalrecords;

import entities.constant_variable.Constants;
import helpers.fileManipulation.FileReaderClass;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordsList {
    private static MedicalRecordsList instance = null;
    private List<MedicalRecord> medicalRecords;
    private MedicalRecordsList() {
        this.medicalRecords = new ArrayList<>();
    }
    public static MedicalRecordsList getInstance() {
        try {
            if (instance == null) {
                MedicalRecordsList recordsList = new MedicalRecordsList();
                String filePath = Constants.MEDICAL_RECORDS_FILE_PATH;
                FileReaderClass fileReader = new FileReaderClass();
                List<MedicalRecord> recordsCSV = fileReader.recordsFileReader(filePath);
                recordsList.medicalRecords.addAll(recordsCSV);
                instance = recordsList;
            }
            return instance;
        } catch (NullPointerException e) {
            return new MedicalRecordsList();
        }

    }
    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void addRecord(MedicalRecord medicalRecord) {
        this.medicalRecords.add(medicalRecord);
    }
    public void showMedicalRecords() {
        for (MedicalRecord medicalRecord : this.medicalRecords) {
            System.out.println(medicalRecord.toString());
        }
    }
    public int findRecordIndex(String medicalRecordCode) {
        int index = -1;
        for (MedicalRecord medicalRecord : this.medicalRecords) {
            if (medicalRecord.getMedicalRecordCode().equals(medicalRecordCode)) {
                index = medicalRecords.indexOf(medicalRecord);
                break;
            }
        }
        return index;
    }
    public void removeMedicalRecord(int index) {
        this.medicalRecords.remove(index);
    }
}
