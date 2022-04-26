package winter2022;

public class NonReturnWithParameter {

    public void getdisplay(String address,int phnnb){

        System.out.println("My adress & phnnb is :" + address+ " " + phnnb);


    }



    public static void main(String[] args) {

        NonReturnWithParameter obj=new NonReturnWithParameter();
        obj.getdisplay("NY",7175289);



    }
}
