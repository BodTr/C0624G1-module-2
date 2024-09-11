package services.recordservices;

import entities.constant_variable.Constants;
import entities.medicalrecords.MedicalRecordsList;
import helpers.fileManipulation.FileEditorClass;

public class recordDeleting {
    public String deleteRecord(String medicalRecordCode) {
        MedicalRecordsList instance = MedicalRecordsList.getInstance();
        FileEditorClass editor = new FileEditorClass();
        String message;
        String filePath = Constants.MEDICAL_RECORDS_FILE_PATH;
        int elIndex = instance.findRecordIndex(medicalRecordCode);
        if (elIndex == -1) {
            message = "The medical record does not exist.";
        } else {
            instance.removeMedicalRecord(elIndex);
            editor.editFile(filePath, medicalRecordCode, "");
            message = "The medical record has been deleted.";
        }
        return message;
    }
}
