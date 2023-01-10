package class_4;

import java.util.Scanner;

public class Pro2_minmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.print("Enter number: ");

            if(scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }
            }
            else
            {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        scanner.close();

    }





}
