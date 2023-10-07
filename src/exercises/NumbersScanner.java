package exercises;

import java.util.Scanner;

public class NumbersScanner {

    int countOfPositiveNumbers,
        countOfNegativeNumbers,
        sumOfNumbers= 0;


    public void numberScanner() {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("[+] Enter a number: ");
            int number = input.nextInt();

            if (number == 0) {
                System.out.println("[!] Exit program.");
                break;
            } else if (number > 0) {
                countOfPositiveNumbers ++;
                sumOfNumbers += number;
            } else {
                countOfNegativeNumbers ++;
                sumOfNumbers += number;
            }
        }
        System.out.println("Count of positive numbers: " + countOfPositiveNumbers);
        System.out.println("Count of negative numbers: " + countOfNegativeNumbers);
        System.out.println("Sum of numbers: " + sumOfNumbers);
    }
}
