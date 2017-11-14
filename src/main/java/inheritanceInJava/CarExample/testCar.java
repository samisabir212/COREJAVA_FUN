package inheritanceInJava.CarExample;

/**
 * Created by sami on 10/14/17.
 */
public class testCar {


    public static void main(String[] args) {

        car c = new car();
        c.carModel = "Bmw";
        c.carModel = "audi";


        c.reg = new registration();
        c.reg.AudiRegNo = "212";
        c.reg.BmwRegNo = "300";
        //this is all encapsulated inside the car class. the c.reg

        System.out.println(c.reg.BmwRegNo + "\n" + c.reg.AudiRegNo);
        //this is all encapsulated inside the car class. the c.reg






    }
}
