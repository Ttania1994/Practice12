package winter2022;

public class ReturnTypeMethodWithParameter {


   public String student ( String fname,String lname){

       System.out.println(" Student full name is :" +fname +" " +lname);



       return fname +lname;
   }



    public static void main(String[] args) {

        ReturnTypeMethodWithParameter obj1 = new ReturnTypeMethodWithParameter();
        obj1.student("Tania", "Sultana");


    }
    }

//public double salary (double monthlySalary,double yearlySalary) {
//    System.out.println("Total salary is :" + monthlySalary + " " + yearlySalary);
//
//    return monthlySalary + yearlySalary;
//
//}
//
//    public static void main(String[] args) {
//
//        ReturnTypeMethodWithParameter obj=new ReturnTypeMethodWithParameter();
//
//    obj.salary(5000,60000);
//    }
//
//
//
//}

