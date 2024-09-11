package helpers.validation;

import custom_exceptions.DuplicateValueExceptions;
import custom_exceptions.InvalidValueExceptions;
import entities.medicalrecords.MedicalRecord;
import entities.medicalrecords.MedicalRecordsList;

import java.util.List;
import java.util.regex.Pattern;

public class RecordValidation {
    public void validateRecordCode (String recordCode) throws InvalidValueExceptions {
        String regex = "^BA-\\d{3}$";
         if(!Pattern.matches(regex, recordCode)) {
             throw new InvalidValueExceptions("Mã bệnh án không đúng định dạng, định dạng đúng BA-XXX, trong đó X là chữ số");
         }
    }
    public void validatePatientCode (String patientCode) throws InvalidValueExceptions {
        String regex = "^BN-\\d{3}$";
        if(!Pattern.matches(regex, patientCode)) {
            throw new InvalidValueExceptions("Mã bệnh nhân không đúng định dạng, định dạng đúng BN-XXX, trong đó X là chữ số");
        }
    }
    public void dateValidation (String date) throws InvalidValueExceptions {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if(!Pattern.matches(regex, date)) {
            throw new InvalidValueExceptions("Ngày không đúng định dạng, định dạng đúng dd/MM/yyyy");
        }
    }
    public void vipTypeValidation (String vipType) throws InvalidValueExceptions {
        String regex = "^(VIP I|VIP II|VIP III)$";
        if(!Pattern.matches(regex, vipType)) {
            throw new InvalidValueExceptions("Loại vip không đúng định dạng, định dạng đúng VIP I, VIP II, VIP III");
        }
    }
    public void duplicateRecordCodeValidation (String medicalRecordCode) throws DuplicateValueExceptions {
        MedicalRecordsList listInstance = MedicalRecordsList.getInstance();
        List<MedicalRecord> recordsList = listInstance.getMedicalRecords();
        boolean duplicate = false;
        for(MedicalRecord record : recordsList) {
            if(record.getMedicalRecordCode().equals(medicalRecordCode)) {
                duplicate = true;
                break;
            }
        }
        if (duplicate) {
            throw new DuplicateValueExceptions("Bệnh án đã tồn tại");
        }
    }
}
