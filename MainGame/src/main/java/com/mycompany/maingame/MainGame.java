    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maingame;

/**
 *
 * @author Students Account
 */
import java.util.Scanner;

public class MainGame {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Welcome to Solo Leveling: Text RPG ===");
        System.out.print("Enter your hero name: ");
        String name = scanner.nextLine();

        // Choose class
        Hero hero = ClassFactory.chooseClass(name);
        System.out.println("\nWelcome, " + hero.getName() + " the " + hero.getHeroClass() + "!");
        
        Shop shop = new Shop();
        Blacksmith blacksmith = new Blacksmith();
        Dungeon dungeon = new Dungeon();

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Enter Dungeon");
            System.out.println("2. Visit Shop");
            System.out.println("3. Visit Blacksmith");
            System.out.println("4. View Hero Stats");
            System.out.println("5. Exit Game");
            System.out.print("Choose an action: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    dungeon.explore(hero);
                    break;
                case 2:
                    shop.open(hero);
                    break;
                case 3:
                    blacksmith.upgrade(hero);
                    break;
                case 4:
                    hero.showStats();
                    break;
                case 5:
                    System.out.println("Thanks for playing!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

