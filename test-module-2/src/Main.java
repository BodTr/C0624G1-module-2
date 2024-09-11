
import entities.medicalrecords.MedicalRecordsList;
import services.recordservices.recordCreator;
import services.recordservices.recordDeleting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MedicalRecordsList instance = MedicalRecordsList.getInstance();
        recordCreator newRecord = new recordCreator();
        recordDeleting recordDeletor = new recordDeleting();
        int n;
        int n1;
        int n2;
        int numOrder = 0;
        String medicalRecordCode;
        String patientName;
        String patientCode;
        String admissionDate;
        String dischargeDate;
        String admisionReason;
        double fee;
        String vipType;
        String vipDuration;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm mới: ");
            System.out.println("2. Xóa: ");
            System.out.println("3. Xem danh sách các bệnh án: ");
            System.out.println("4. Exit ");
            System.out.println("Chọn chức năng: ");

            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    System.out.println("Chọn loại hồ sơ cần tạo: ");
                    System.out.println("--------------------------");
                    do {
                        System.out.println("1. Thêm mới hồ sơ thường: ");
                        System.out.println("2. Thêm mới hồ sơ vip: ");
                        System.out.println("3. Exit ");
                        n1 = Integer.parseInt(sc.nextLine());
                        switch (n1) {
                            case 1:
                                System.out.println("Nhập thông tin hồ sơ thường: ");
                                System.out.println("--------------------------");
                                System.out.println("Nhập mã bệnh án (BA-XXX, trong đó X là chữ số): ");
                                medicalRecordCode = sc.nextLine();
                                System.out.println("Nhập mã bệnh nhân (BN-XXX, trong đó X là chữ số): ");
                                patientCode = sc.nextLine();
                                System.out.println("Nhập tên bệnh nhân: ");
                                patientName = sc.nextLine();
                                System.out.println("Nhập ngày nhập viện (dd/MM/yyyy): ");
                                admissionDate = sc.nextLine();
                                System.out.println("Nhập ngày xuất viện (dd/MM/yyyy): ");
                                dischargeDate = sc.nextLine();
                                System.out.println("Nhập lý do nhập viện: ");
                                admisionReason = sc.nextLine();
                                System.out.println("Nhập phí nằm viện VNĐ: ");
                                fee = Double.parseDouble(sc.nextLine());
                                numOrder++;
                                System.out.println("--------------------------");
                                newRecord.createNormRecord(numOrder, medicalRecordCode, patientCode, patientName, admissionDate, dischargeDate, admisionReason, fee);
                                break;
                            case 2:
                                System.out.println("Nhập thông tin hồ sơ vip: ");
                                System.out.println("--------------------------");
                                System.out.println("Nhập mã bệnh án (BA-XXX, trong đó X là chữ số): ");
                                medicalRecordCode = sc.nextLine();
                                System.out.println("Nhập mã bệnh nhân (BN-XXX, trong đó X là chữ số): ");
                                patientCode = sc.nextLine();
                                System.out.println("Nhập tên bệnh nhân: ");
                                patientName = sc.nextLine();
                                System.out.println("Nhập ngày nhập viện (dd/MM/yyyy): ");
                                admissionDate = sc.nextLine();
                                System.out.println("Nhập ngày xuất viện (dd/MM/yyyy): ");
                                dischargeDate = sc.nextLine();
                                System.out.println("Nhập lý do nhập viện: ");
                                admisionReason = sc.nextLine();
                                System.out.println("Nhập loại vip (VIP I, VIP II, VIP III): ");
                                vipType = sc.nextLine();
                                System.out.println("Nhập ngày hết hạn vip (dd/MM/yyyy): ");
                                vipDuration = sc.nextLine();
                                numOrder++;
                                System.out.println("--------------------------");
                                newRecord.createVIPRecord(numOrder, medicalRecordCode, patientCode, patientName, admissionDate, dischargeDate, admisionReason, vipType, vipDuration);
                                break;

                        }
                    } while (n1 != 3);

                    break;
                case 2:
                    System.out.println("Xóa hồ sơ: ");
                    System.out.println("--------------------------");

                    System.out.println("1. Xóa: ");
                    System.out.println("2. Không xóa: ");
                    n2 = Integer.parseInt(sc.nextLine());
                    if (n2 == 1) {
                        System.out.println("Nhập mã bệnh án (BA-XXX, trong đó X là chữ số) : ");
                        medicalRecordCode = sc.nextLine();
                        String message = recordDeletor.deleteRecord(medicalRecordCode);
                        System.out.println(message);
                        break;
                    }

                    break;
                case 3:
                    System.out.println("Thông tin tất cả hồ sơ: ");
                    System.out.println("--------------------------");
                    instance.showMedicalRecords();
                    break;


            }
        } while (n != 4);

    }
}
