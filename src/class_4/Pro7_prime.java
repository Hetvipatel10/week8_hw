package class_4;

import java.util.Scanner;

public class Pro7_prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPrime = true;
        if(number < 2) {
            isPrime = false;
        } else {
            for(int i = 2; i < number; i++) {
                if(number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }

}
