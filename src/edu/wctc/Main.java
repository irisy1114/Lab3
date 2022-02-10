package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("****************************");
        System.out.print("Enter your first name: ");
        String firstName = keyboard.nextLine();
        System.out.print("Enter your middle name: ");
        String middleName = keyboard.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = keyboard.nextLine();

        Triplet<String> name = new Triplet<>(firstName, middleName, lastName);
        System.out.println(name.GetFullString("Your name is", " "));

        System.out.println("****************************");
        System.out.print("Enter the first dimension of the cube: ");
        Double firstDimension = keyboard.nextDouble();
        System.out.print("Enter the second dimension of the cube: ");
        Double secondDimension = keyboard.nextDouble();
        System.out.print("Enter the third dimension of the cube: ");
        Double thirdDimension = keyboard.nextDouble();
        Triplet<Double> cube = new Triplet<>(firstDimension, secondDimension, thirdDimension);
        System.out.println(cube.GetFullString("The three dimension of the cube is", ","));

        System.out.println("****************************");
        System.out.print("Enter the hour: ");
        Integer hour = keyboard.nextInt();
        System.out.print("Enter the minute: ");
        Integer minute = keyboard.nextInt();
        System.out.print("Enter the second: ");
        Integer second = keyboard.nextInt();

        Triplet<Integer> time = new Triplet<>(hour, minute, second);
        System.out.println(time.GetFullString("The time is", ":"));
    }

}
