package org.fi.exam;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Program2 {
    private static final List<Category> categories = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Category");
            System.out.println("2. List Categories");
            System.out.println("3. List Categories starting with 'E'");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addCategory();
                    break;
                case 2:
                    listCategories();
                    break;
                case 3:
                    listCategoriesStartingWithE();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }

    private static void addCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Category Details:");
        System.out.print("Category ID: ");
        int catId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Category Name: ");
        String categoryName = scanner.nextLine();
        System.out.print("Category Description: ");
        String categoryDesc = scanner.nextLine();
        System.out.print("Category Image URL: ");
        String categoryImageUrl = scanner.nextLine();
        Category category = new Category(catId, categoryName, categoryDesc, categoryImageUrl);
        if (!categories.contains(category)) {
            categories.add(category);
            System.out.println("Category added successfully.");
        } else {
            System.out.println("Category already exists.");
        }
    }
    private static void listCategories() {
        if (categories.isEmpty()) {
            System.out.println("No categories found.");
        } else {
            System.out.printf("%-10s%-20s%-50s%-20s\n", "Category ID", "Name", "Description", "Image URL");
            for (int i = 0; i < categories.size(); i++) {
                Category category = categories.get(i);
                System.out.printf("%-10d%-20s%-50s%-20s\n", category.getCatId(), category.getCategoryName(),
                        category.getCategoryDesc(), category.getCategoryImageUrl());
            }
        }
    }

    private static void listCategoriesStartingWithE() {
        System.out.printf("%-10s%-20s%-50s%-20s\n", "Category ID", "Name", "Description", "Image URL");
        for (int i = 0; i < categories.size(); i++) {
            Category category = categories.get(i);
            if (category.getCategoryName().startsWith("E")) {
                System.out.printf("%-10d%-20s%-50s%-20s\n", category.getCatId(), category.getCategoryName(),
                        category.getCategoryDesc(), category.getCategoryImageUrl());
            }
        }
    }
}
