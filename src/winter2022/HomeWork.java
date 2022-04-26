package winter2022;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        HomeWork obj =new HomeWork();
        obj.mango();



    }

    public void mango (){
        Scanner input= new Scanner (System.in);

        System.out.println("enter your score to get grade");
        double score =input.nextDouble();
        if(score >=94 && score <=100){
            System.out.println("You got Exellent");

        }
        else if (score >= 90 && score <=93){

            System.out.println("You got very good");
        }

        else if ( score >=85 && score <=89)
        {
            System.out.println("You got good");
        }


         else if ( score >=80 && score <=84)
        {
            System.out.println("You got Avarage");
        }


         else if ( score >=70 && score <=79)
        {
            System.out.println("You got pass");

        }

         else if ( score >=60 && score <=69)
        {
            System.out.println("You got poor");
        }


         else if ( score >=50 && score <=59)
        {
            System.out.println("You need to repeat the course");
        }



    }

















}
