package com.assignment.exercise_1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int electricCount;
        int electricMoney = 0;
        int kmCount;
        int taxiBill = 0;
        double salary;
        double netSalary = 0.0;
        double expense = 0.0;
        do {

            System.out.println("Menu");
            System.out.println("1. Tính tiền điện sử dụng tháng này: ");
            System.out.println("2. Tính tiền taxi tháng này: ");
            System.out.println("3. Tính số tiền lương hàng tháng (sau thuế): ");
            System.out.println("4. Tính tổng thu nhập: ");
            System.out.println("0. Exit : ");
            System.out.println("----------------------------");
            System.out.println("Tiền điện: " + electricMoney);
            System.out.println("Tiền taxi: " + taxiBill);
            System.out.println("Tiền lương (sau thuế): " + netSalary);
            System.out.println("Tổng thu nhập: " + expense);
            System.out.println("----------------------------");
            System.out.println("Nhập sự lựa chọn: ");
            n = Integer.parseInt(sc.nextLine());

            switch (n) {
                case 1:
                    System.out.println("Nhập số điện đã sử dụng: ");
                    electricCount = Integer.parseInt(sc.nextLine());
                    ElectricMoney ElectricMoneyObj = new ElectricMoney(electricCount);
                    electricMoney = ElectricMoneyObj.calculateElectricityBill();
                    System.out.println("Tiền điện: " + electricMoney);
                    break;
                case 2:
                    System.out.println("Nhập số km đã đi: ");
                    kmCount = Integer.parseInt(sc.nextLine());
                    TaxiBill TaxiBillObj = new TaxiBill(kmCount);
                    taxiBill = TaxiBillObj.calculateTaxiBill();
                    System.out.println("Tiền taxi: " + taxiBill);
                    break;
                case 3:
                    System.out.println("Nhập số tiền lương: ");
                    salary = Double.parseDouble(sc.nextLine());
                    Salary SalaryObj = new Salary(salary);
                    netSalary = SalaryObj.calculateNetSalary();
                    System.out.println("Tiền lương: " + netSalary);
                    break;
                case 4:
                    if (electricMoney == 0) {
                        System.out.println("----------------------------");
                        System.out.println("Hãy tính tiền điện trước khi tính tổng thu nhập");
                        System.out.println("----------------------------");
                    } else if (taxiBill == 0) {
                        System.out.println("----------------------------");
                        System.out.println("Hãy tính tiền taxi trước khi tính tổng thu nhập");
                        System.out.println("----------------------------");
                    } else if (netSalary == 0) {
                        System.out.println("----------------------------");
                        System.out.println("Hãy tính tiền taxi trước khi tính tổng thu nhập");
                        System.out.println("----------------------------");
                    } else {
                        expense = netSalary - electricMoney - taxiBill - taxiBill;
                        System.out.println("Tổng thu nhập: " + expense);
                    }
                    break;
            }
        } while (n != 0);
    }
}
