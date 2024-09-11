package entities.medicalrecords;

public abstract class MedicalRecord {
    private int numOrder;
    private String medicalRecordCode;
    private String patientName;
    private String patientCode;
    private String admissionDate;
    private String dischargeDate;
    private String admisionReason;

    protected MedicalRecord(int numOrder, String medicalRecordCode, String patientName, String patientCode, String admissionDate, String dischargeDate, String admisionReason) {
        this.numOrder = numOrder;
        this.medicalRecordCode = medicalRecordCode;
        this.patientName = patientName;
        this.patientCode = patientCode;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.admisionReason = admisionReason;
    }

    public int getNumOrder() {
        return numOrder;
    }

    public void setNumOrder(int numOrder) {
        this.numOrder = numOrder;
    }

    public String getMedicalRecordCode() {
        return medicalRecordCode;
    }

    public void setMedicalRecordCode(String medicalRecordCode) {
        this.medicalRecordCode = medicalRecordCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getAdmisionReason() {
        return admisionReason;
    }

    public void setAdmisionReason(String admisionReason) {
        this.admisionReason = admisionReason;
    }
    public String getPatientCode() {
        return patientCode;
    }
    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    @Override
    public String toString() {
        return "{" +
                "numOrder=" + numOrder +
                ", medicalRecordCode='" + medicalRecordCode + '\'' +
                ", patientName='" + patientName + '\'' +
                ", patientCode='" + patientCode + '\'' +
                ", admissionDate='" + admissionDate + '\'' +
                ", dischargeDate='" + dischargeDate + '\'' +
                ", admisionReason='" + admisionReason + '\'' +
                '}';
    }
}
