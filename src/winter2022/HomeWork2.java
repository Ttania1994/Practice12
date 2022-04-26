package winter2022;

import java.util.Scanner;

public class HomeWork2 {


    public static void main(String[] args) {

     Scanner input=new Scanner(System.in);
        System.out.println("********** HOME WORK **********");


        System.out.println("Did you get your first dose?");

        String firstDose =input.nextLine();
        if (firstDose.equalsIgnoreCase("Yes")){

            System.out.println("You are eligible for second dose after six months");

        }

        System.out.println();
        System.out.println("six month is gone after first dose");
        System.out.println();
        System.out.println("Did you get your second dose ?");


        String secondDose =input.nextLine();

       if (secondDose.equalsIgnoreCase("Yes")) {

           System.out.println("You are eligible for second dose after six month");

       }
       else {
           System.out.println("You are not eligible for vaccination");
       }





    }
}
