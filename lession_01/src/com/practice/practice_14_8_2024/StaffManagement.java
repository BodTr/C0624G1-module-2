package com.practice.practice_14_8_2024;

public class StaffManagement {
    public static void main(String[] args) {
        Staff [] staffs = new Staff[3];
        staffs[0] = new FullTimeStaff("F12312", "Alex", 23, 94977112, "alex12@gmail.com", 123456, 1000, 200); // 124256
        staffs[1] = new FullTimeStaff("F12322", "Tim", 33, 94977122, "tim12@gmail.com", 1234567, 1000, 100); // 1,235,467
        staffs[2] = new PartTimeStaff("P12322", "Tim", 33, 94977122, "tim12@gmail.com",30); // 3,000,000
        int avgSalary = getSumSalary(staffs);

        System.out.println(avgSalary);

    }

    private static int getSumSalary(Staff[] staffs) {
        int sumSalary = 0;
        for (int i = 0; i < staffs.length; i++) {

            sumSalary += staffs[i].calculateSalary();
        }
        int avgSalary = sumSalary / staffs.length;
        return avgSalary;
    }

    private static void getAboveAvgStaff(Staff[] staffs, int avgSalary) {

        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] instanceof FullTimeStaff) {
                if (avgSalary < staffs[i].calculateSalary()) {
                    System.out.println("Above Avg Staff");
                }
            }
        }
    }


}

