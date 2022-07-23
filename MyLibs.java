/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Naviank
 */
public class MyLibs {

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        String s;
        int number, count = 0;
        while (true) {
            s = sc.nextLine();
            count++;
            try {
                if (s.length() > 9) {
                    throw new InputMismatchException("Too long string!");
                }
                number = Integer.parseInt(s);
                break;
            } catch (NumberFormatException | InputMismatchException e) {
                System.err.println("You haven't entered an integer!");
                System.err.println("Reason: " + e.getMessage());
                System.out.print("Enter an integer again (" + count + "): ");
            }
        }
        return number;
    }

    public static double inputDouble() {
        Scanner sc = new Scanner(System.in);
        String s;
        double number;
        int count = 0;
        while (true) {
            s = sc.nextLine();
            count++;
            try {
                if (s.length() > 19) {
                    throw new InputMismatchException("Too long string!");
                }
                number = Double.parseDouble(s);
                break;
            } catch (NumberFormatException | InputMismatchException e) {
                System.err.println("You haven't entered a real number!");
                System.err.println("Reason: " + e.getMessage());
                System.out.print("Enter an integer again (" + count + "): ");
            }
        }
        return number;
    }
    
    public static String inputStr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        while ("\n".equals(s) == true) {
            System.out.println("This attribute mustn't be empty!");
            System.out.print("\nEnter another String: ");
            s = sc.nextLine();
        } 
        return s;
    }  
    
    public static boolean checkStringLength(String s, int length) {
        if (s.length() != length) 
            return false;
        else 
            return true;
    }

    public static boolean checkFirstChar(String s, char c) {
        if (s.charAt(0) != c) 
            return false;
        else 
            return true;
    }
    
    public static String inputStr(int length) {
        String s;
        System.out.print("\nEnter a String with length = " + length + " characters: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            s = sc.nextLine();
            if (s.length() != length) {
                System.err.println("Wrong input!!! You've entered a String with length = " + s.length());
                System.out.print("Please enter again a String with length = " + length + " characters: ");
            } else 
                break;
        }
        return s;
    }

    public static int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(Integer.MAX_VALUE);
    }

    public static int generateRandomIntInRange(int min, int max) {
//Java 1.7 or older
        Random rand = new Random();
// nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static String generateRandomFirstName() {
        String[] Fname = {"Anh", "Binh", "Chi", "Dung", "Emma", "Giang", "Hoai", "Khanh", "Linh",
            "Madara", "Naruto", "Phong", "Quan", "Sakura", "Trang", "Uyen", "Văn", "Yen"};
        Random rand = new Random();
        String randFName = Fname[rand.nextInt(Fname.length - 1)];
        return randFName;
    }

    public static String generateRandomLastName() {
        String[] Lname = {" An", " Bui", " Cao", " Dao", " Giang", " Haruno", " Kieu", " Luong", " Mai", 
            " Nguyen", " Pham", " Smith", " Truong", " Uzumaki", " Uchiha",  " Vo", " Watson"};
        Random rand = new Random();
        String randLName = Lname[rand.nextInt(Lname.length - 1)];
        return randLName;
    }

    public static String generateRandomFullName() {
        String Fname = generateRandomFirstName();
        String Lname = generateRandomLastName();
        String name = Fname + Lname;
        return name;
    }

    public static String generateRandomColor() {
        String[] Color = {"Red", "Orange", "Yellow", "Green", "Blue", "Grey", "Purple", "Pink",
            "White", "Black"};
        Random rand = new Random();
        String randColor = Color[rand.nextInt(Color.length - 1)];
        return randColor;
    }

    public static boolean generateRandomBoolean() {
       Random rand = new Random();
       boolean b = rand.nextBoolean();
       return b;
    }

    public static char generateRandomHexa() {
        Random rand = new Random();
        char s = char.class.cast(rand.nextInt(16));
        return s;
    }
//Son ngu lon!  
}

