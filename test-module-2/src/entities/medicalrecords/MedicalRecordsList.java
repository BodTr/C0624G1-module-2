package entities.medicalrecords;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordsList {
    private static MedicalRecordsList instance = null;
    private List<MedicalRecord> medicalRecords;
    private MedicalRecordsList() {
        this.medicalRecords = new ArrayList<>();
    }
    public static MedicalRecordsList getInstance() {
        if (instance == null) {
            instance = new MedicalRecordsList();
        }
        return instance;
    }
    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }
    public void addRecord(MedicalRecord medicalRecord) {
        this.medicalRecords.add(medicalRecord);
    }
    public void showMedicalRecords() {
        System.out.println("Medical records list:");
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
