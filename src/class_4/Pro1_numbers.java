package class_4;

import java.util.Scanner;

public class Pro1_numbers {
    public static void main(String[] args) {
        int num=0;
        float sum=0;

        int count =0;
        Scanner sc= new Scanner(System.in);
       // System.out.println("enter number: ");
        while (count<10) {
            int order = count + 1;
            System.out.println("enter number: "+order+" ");
            // num=sc.nextInt();
            boolean a = sc.hasNextInt();
            if (a) {
                int b = sc.nextInt();
                sum += b;
                count++;
            }
            else {

                System.out.println("enter number"+order+": ");
            }
            sc.nextLine();
        }
            System.out.println("sum of those number is :" +sum+ "\n");
        }


    }



