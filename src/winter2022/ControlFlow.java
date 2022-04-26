package winter2022;

public class ControlFlow {

    static int number = 6;
    int age = 40;

    public static void main(String[] args) {

        ControlFlow obj = new ControlFlow();
        if (obj.age == 40) {

            System.out.println("age is right");
        } else {
            System.out.println("age is wrong");
        }

        if (number == 7) {
            System.out.println("number is right");


        } else {
            System.out.println("Number is wrong");

        }


    }

}
