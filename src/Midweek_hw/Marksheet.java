package Midweek_hw;

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //input student info
        System.out.println("Enter student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter roll number: ");
        String rollNo= scanner.nextLine();

        System.out.println("Enter student mark for Math,sci,eng (0-100): ");
        int math=scanner.nextInt();
        int sci=scanner.nextInt();
        int eng=scanner.nextInt();

        //while loop validate inputs
        while (math <0 || math  >100 || sci <0 || sci> 100 || eng < 0 || eng >100 ){
            System.out.println("Invalidate Input, Marks should be between 0 and 100 ");//validate correct input
            System.out.println("Enter marks for math,sci,eng");

             //store data per input
             math=scanner.nextInt();
             sci=scanner.nextInt();
             eng=scanner.nextInt();


        }
        //calculate

    }
}
