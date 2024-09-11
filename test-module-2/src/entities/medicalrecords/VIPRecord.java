package entities.medicalrecords;

public class VIPRecord extends MedicalRecord {
    private String vipType;
    private String vipDuration;

    public VIPRecord(int numOrder, String patientCode, String medicalRecordCode, String patientName, String admissionDate, String dischargeDate, String admisionReason, String vipType, String vipDuration) {
        super(numOrder, medicalRecordCode, patientName, admissionDate, dischargeDate, admisionReason, patientCode);
        this.vipType = vipType;
        this.vipDuration = vipDuration;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public String getVipDuration() {
        return vipDuration;
    }

    public void setVipDuration(String vipDuration) {
        this.vipDuration = vipDuration;
    }

    @Override
    public String toString() {
        return "VIPRecord{" +
                "vipType='" + vipType + '\'' +
                ", vipDuration='" + vipDuration + '\'' +
                super.toString() +
                "} ";
    }
}
