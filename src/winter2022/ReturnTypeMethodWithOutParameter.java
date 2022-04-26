package winter2022;

public class ReturnTypeMethodWithOutParameter {


    public int dosumation(){

       int age=24;
       int age1=42;
      int total=age+age1;
        System.out.println("total age is:" + total);

     return total;

    }

    public String naming(){

     String Fname="Tania"  ;
     String Lname="Sultana";
       String FullName=Fname + " " + Lname;
        System.out.println("Full name is :" + " " +FullName);
return FullName;
    }



    public static void main(String[] args) {

        ReturnTypeMethodWithOutParameter obj=new ReturnTypeMethodWithOutParameter() ;

obj.dosumation();

obj.naming();


    }

}
