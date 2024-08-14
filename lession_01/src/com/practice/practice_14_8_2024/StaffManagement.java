package com.practice.practice_14_8_2024;

public class StaffManagement {
    public static void main(String[] args) {
        Staff [] staffs = new Staff[5];
        staffs[0] = new FullTimeStaff("F12312", "Alex", 23, 94977112, "alex12@gmail.com", 2123456, 1000, 200); // 124256
        staffs[1] = new FullTimeStaff("F12322", "Tim", 33, 94977133, "tim12@gmail.com", 2234567, 1000, 100); // 1,235,467
        staffs[2] = new PartTimeStaff("P12322", "Kim", 33, 94977144, "kim12@gmail.com",10); // 1,000,000
        staffs[3] = new PartTimeStaff("P22322", "Pim", 33, 94977155, "pim12@gmail.com",20); // 2,000,000
        staffs[4] = new PartTimeStaff("P52322", "Mim", 33, 94977166, "mim12@gmail.com",30); // 3,000,000
        int avgSalary = getSumSalary(staffs);
        int partTimeStaffSalary = sumPartTimeStaffSalary(staffs);

        System.out.println("Avg Salary: " + avgSalary);
        System.out.println("Part Time Staffs Salary: " + partTimeStaffSalary);
        String staffString = getAboveAvgStaff(staffs, avgSalary);
        System.out.println(staffString);
    }

    private static int getSumSalary(Staff[] staffs) {
        int sumSalary = 0;
        for (int i = 0; i < staffs.length; i++) {

            sumSalary += staffs[i].calculateSalary();
        }
        int avgSalary = sumSalary / staffs.length;
        return avgSalary;
    }

    private static String getAboveAvgStaff(Staff[] staffs, int avgSalary) {
        String staffString = "";
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] instanceof FullTimeStaff) {
                if (avgSalary < staffs[i].calculateSalary()) {
                    staffString += staffs[i].toString();
                }
            }
        }
        return staffString;
    }

    private static int sumPartTimeStaffSalary(Staff[] staffs) {
        int sumSalary = 0;
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] instanceof PartTimeStaff) {
                sumSalary += staffs[i].calculateSalary();
            }
        }
        return sumSalary;
    }


}

