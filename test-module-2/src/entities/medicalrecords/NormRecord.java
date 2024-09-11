package entities.medicalrecords;

public class NormRecord extends MedicalRecord {
    private double fee;

    public NormRecord(int numOrder, String patientCode, String medicalRecordCode, String patientName, String admissionDate, String dischargeDate, String admisionReason, double fee) {
        super(numOrder, medicalRecordCode, patientName, admissionDate, dischargeDate, admisionReason, patientCode);
        this.fee = fee;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "NormRecord{" +
                "fee=" + fee +
                super.toString() +
                "} ";
    }
}
