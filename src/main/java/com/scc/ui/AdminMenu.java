package com.scc.ui;

import com.scc.model.User;

import java.util.Scanner;

public class AdminMenu {

    private final User user;
    private final Scanner sc;

    // The Scanner is passed in so the whole app shares one Scanner on System.in
    public AdminMenu(User user, Scanner sc) {
        this.user = user;
        this.sc = sc;
    }

    // Runs until the admin logs out, then returns to the caller (Main)
    public void show() {
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println("=============================");
            System.out.println("ADMIN DASHBOARD  (user: " + user.username() + ")");
            System.out.println("=============================");
            System.out.println("1. Manage Furniture");
            System.out.println("2. Manage Users");
            System.out.println("3. View Reports");
            System.out.println("4. Log out");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("[Manage Furniture] - coming soon\n");
                    break;
                case "2":
                    System.out.println("[Manage Users] - coming soon\n");
                    break;
                case "3":
                    System.out.println("[View Reports] - coming soon\n");
                    break;
                case "4":
                    System.out.println("Logged out successfully.\n");
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.\n");
            }
        }
    }
}