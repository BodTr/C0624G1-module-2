package com.practice.pratice_15_8_2024;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class MaterialManagement {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2025, 1, 1);
        LocalDate date2 = LocalDate.of(2024, 1, 1);
        LocalDate date3 = LocalDate.of(2023, 1, 1);
        LocalDate date4 = LocalDate.of(2024, 12, 10);
        LocalDate date5 = LocalDate.of(2024, 8, 23);
        ArrayList<Material> materials = new ArrayList<>();
        materials.add(new CrispyFlour("F123123", "4 Star Flour", date1, 100, 3));
        materials.add(new CrispyFlour("F123111", "3 Star Flour", date2, 50, 2));
        materials.add(new CrispyFlour("F123222", "2 Star Flour", date3, 60, 1));
        materials.add(new CrispyFlour("F123333", "1 Star Flour", date4, 70, 4));
        materials.add(new CrispyFlour("F123444", "5 Star Flour", date5, 120, 5));
        materials.add(new Meat("M123111", "Chicken", date1, 100, 4));
        materials.add(new Meat("M123222", "Pork", date2, 70, 3));
        materials.add(new Meat("M123223", "Beef", date3, 80, 2));
        materials.add(new Meat("M123334", "Lamp", date4, 90, 1));
        materials.add(new Meat("M123553", "Chicken Meat", date5, 40, 3));

        System.out.println("Menu");
        System.out.println("1. Display materials: ");
        System.out.println("2. Add meat: ");
        System.out.println("3. Add flour: ");
        System.out.println("4. Edit materials: ");
        System.out.println("5. Delete materials: ");
        System.out.println("0. Exit : ");

        Scanner sc = new Scanner(System.in);
        int i;
        int choice;

        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String sumString = getMaterialsInformation(materials);
                    System.out.println("Materials Information:" + '\n' + sumString);
                    break;
                case 2:
                    addMeatZZ(sc, materials);
                    break;
                case 3:
                    addFlourZZ(sc, materials);
                    break;
                case 4:
                    System.out.println("Enter item index: ");
                    i = sc.nextInt();
                    while (i < 0 || i > materials.size() - 1) {
                        System.out.println("Invalid index");
                        i = sc.nextInt();
                    }
                    if (materials.get(i) instanceof CrispyFlour) {
                        editFlourZZ(sc, materials, i);
                    } else {
                        editMeatZZ(sc, materials, i);
                    }

            }
        }
        while (choice != 0);

        LocalDate dateNow = LocalDate.now();
        double realPriceMeat9 = materials.get(9).getRealMoney(dateNow);
        double realPriceFlour3 = materials.get(3).getRealMoney(dateNow);
        System.out.println("Meat price i = 9: " + realPriceMeat9);
        System.out.println("Flour price i = 3: " + realPriceFlour3);
    }

    private static void addMeatZZ(Scanner sc, ArrayList<Material> materials) {
        String name;
        String id;
        String date;
        double cost;
        double weight;
        System.out.println("Enter meat id: ");
        id = sc.nextLine();
        System.out.println("Enter meat name: ");
        name = sc.nextLine();
        System.out.println("Enter meat manufacturing Date (YYYY - MM - DD): ");
        date = sc.nextLine(); // YYYY - MM - DD
        LocalDate manufacturingDate = LocalDate.parse(date);
        System.out.println("Enter meat cost: ");
        cost = sc.nextDouble();
        System.out.println("Enter meat weight: ");
        weight = sc.nextDouble();
        materials.add(new Meat(id, name, manufacturingDate, cost, weight));
    }

    private static void addFlourZZ(Scanner sc, ArrayList<Material> materials) {
        String date;
        double cost;
        String id;
        String name;
        int quantity;
        System.out.println("Enter flour id: ");
        id = sc.nextLine();
        System.out.println("Enter flour name: ");
        name = sc.nextLine();
        System.out.println("Enter flour manufacturing Date (YYYY - MM - DD): ");
        date = sc.nextLine(); // YYYY - MM - DD
        LocalDate manufacturingDate1 = LocalDate.parse(date);
        System.out.println("Enter flour cost: ");
        cost = sc.nextDouble();
        System.out.println("Enter flour quantity: ");
        quantity = sc.nextInt();
        materials.add(new CrispyFlour(id, name, manufacturingDate1, cost, quantity));
    }

    private static void editMeatZZ(Scanner sc, ArrayList<Material> materials, int i) {
        double weight;
        String date;
        double cost;
        String id;
        String name;
        System.out.println("Enter meat id: ");
        id = sc.nextLine();
        System.out.println("Enter meat name: ");
        name = sc.nextLine();
        System.out.println("Enter meat manufacturing Date (YYYY - MM - DD): ");
        date = sc.nextLine(); // YYYY - MM - DD
        LocalDate manufacturingDate3 = LocalDate.parse(date);
        System.out.println("Enter meat cost: ");
        cost = sc.nextDouble();
        System.out.println("Enter meat weight: ");
        weight = sc.nextDouble();

        materials.set(i, new Meat(id, name, manufacturingDate3, cost, weight));
    }

    private static void editFlourZZ(Scanner sc, ArrayList<Material> materials, int i) {
        String id;
        String date;
        String name;
        int quantity;
        double cost;
        System.out.println("Enter flour id: ");
        id = sc.nextLine();
        System.out.println("Enter flour name: ");
        name = sc.nextLine();
        System.out.println("Enter flour manufacturing Date (YYYY - MM - DD): ");
        date = sc.nextLine(); // YYYY - MM - DD
        LocalDate manufacturingDate2 = LocalDate.parse(date);
        System.out.println("Enter flour cost: ");
        cost = sc.nextDouble();
        System.out.println("Enter flour quantity: ");
        quantity = sc.nextInt();

        materials.set(i, new Meat(id, name, manufacturingDate2, cost, quantity));
    }

    private static String getMaterialsInformation(ArrayList<Material> materials) {
        StringBuilder materialsString = new StringBuilder();
        for (Material material : materials) {
            materialsString.append(material.toString());
        }
        return materialsString.toString();
    }

}
