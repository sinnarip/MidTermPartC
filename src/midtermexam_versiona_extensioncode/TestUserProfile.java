/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author nippy
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Choose your favorite genre from the following list:");
        String[] genres = {"Comedy", "Drama", "Horror", "Action"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        int genreChoice = scanner.nextInt();
        
        System.out.println("Profile created for " + name + " with favorite genre: " + genres[genreChoice - 1]);
    }
}
