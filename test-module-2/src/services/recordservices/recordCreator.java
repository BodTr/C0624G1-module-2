package services.recordservices;

import entities.custom_exceptions.DuplicatedValueExceptions;
import entities.custom_exceptions.InvalidValueExceptions;
import entities.constant_variable.Constants;
import entities.medicalrecords.MedicalRecord;
import entities.medicalrecords.MedicalRecordsList;
import entities.medicalrecords.NormRecord;
import entities.medicalrecords.VIPRecord;
import helpers.fileManipulation.FileWriterClass;
import helpers.validation.RecordValidation;

public class recordCreator {
    private void genaralValidate(String medicalRecordCode, String patientCode, String admissionDate, String dischargeDate) {
        try {
            RecordValidation validation = new RecordValidation();
            validation.validateRecordCode(medicalRecordCode);
            validation.validatePatientCode(patientCode);
            validation.dateValidation(admissionDate);
            validation.dateValidation(dischargeDate);
            validation.duplicateRecordCodeValidation(medicalRecordCode);
        } catch (InvalidValueExceptions | DuplicatedValueExceptions e) {
            System.out.println(e.getMessage());
        }


    }
    private void writeDataToCSV(String data) {
        FileWriterClass fileWriter = new FileWriterClass();
        String filePath = Constants.MEDICAL_RECORDS_FILE_PATH;
        fileWriter.recordFileWriter(filePath, data);
    }
    public void createNormRecord(int numOrder, String medicalRecordCode, String patientName, String patientCode, String admissionDate, String dischargeDate, String admisionReason, double fee) {
        genaralValidate(medicalRecordCode, patientCode, admissionDate, dischargeDate);
        MedicalRecordsList instance = MedicalRecordsList.getInstance();
        MedicalRecord normRecord = new NormRecord(numOrder, medicalRecordCode, patientName, patientCode, admissionDate, dischargeDate, admisionReason, fee);
        instance.addRecord(normRecord);
        String recordCSV = normRecord.toCSV();
        writeDataToCSV(recordCSV);
    }
    public void createVIPRecord(int numOrder, String medicalRecordCode, String patientCode, String patientName, String admissionDate, String dischargeDate, String admisionReason, String vipType, String vipDuration) {
        try {
            genaralValidate(medicalRecordCode, patientCode, admissionDate, dischargeDate);
            RecordValidation validation = new RecordValidation();
            MedicalRecordsList instance = MedicalRecordsList.getInstance();
            validation.vipTypeValidation(vipType);
            validation.dateValidation(vipDuration);
            MedicalRecord vipRecord = new VIPRecord(numOrder, patientCode, medicalRecordCode, patientName, admissionDate, dischargeDate, admisionReason, vipType, vipDuration);
            instance.addRecord(vipRecord);
            String recordCSV = vipRecord.toCSV();
            writeDataToCSV(recordCSV);
        } catch (InvalidValueExceptions e) {
            System.out.println(e.getMessage());
        }

    }
}
