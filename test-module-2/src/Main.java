import entities.medicalrecords.NormRecord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int n1;
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
                    System.out.println("Nhập thông tin liên lạc: ");
                    System.out.println("--------------------------");
                    do {
                        System.out.println("1. Thêm mới hồ sơ thường: ");
                        System.out.println("2. Thêm mới hồ sơ vip: ");
                        System.out.println("3. Exit ");
                        n1 = Integer.parseInt(sc.nextLine());
                        switch (n1) {
                            case 1:
                                System.out.println("Nhập mã bệnh án: ");
                                medicalRecordCode = sc.nextLine();
                                System.out.println("Nhập tên bệnh nhân: ");
                                patientName = sc.nextLine();
                                System.out.println("Nhập mã bệnh nhân: ");
                                patientCode = sc.nextLine();
                                System.out.println("Nhập ngày nhập viện (dd/MM/yyyy): ");
                                admissionDate = sc.nextLine();
                                System.out.println("Nhập ngày xuất viện (dd/MM/yyyy): ");
                                dischargeDate = sc.nextLine();
                                System.out.println("Nhập phí nằm viện VNĐ: ");
                                fee = Double.parseDouble(sc.nextLine());
                                numOrder++;
                                System.out.println("--------------------------");

                                break;
                            case 2:


                        }
                    } while (n1 != 3);

                    break;
                case 2:

                    break;
                case 3:

                    break;


            }
        } while (n != 4);

    }
}
