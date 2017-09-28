package Interfaces;

/**
 * Created by sami on 9/23/17.
 */
public class MoroccanTraffic implements CentralizedGlobalTraffic, spaceTraffic {



    public static void main(String[] args) {

        CentralizedGlobalTraffic CT = new CentralizedGlobalTraffic() {
            public void greenGo() {
                System.out.println("go");

            }

            public void redStop() {

            }

            public void yellowSlow() {

            }
        };

        CT.greenGo();

        MoroccanTraffic mo = new MoroccanTraffic();

        mo.whiteFly();

        spaceTraffic st = new spaceTraffic() {
            public void purpleJetSpeed() {
                System.out.println("break the sound barrier");
            }
        };

        st.purpleJetSpeed();




    }

    public void whiteFly() {

        System.out.println("fly over with flying car");
    }

    public void greenGo() {

    }

    public void redStop() {

    }

    public void yellowSlow() {

    }

    public void purpleJetSpeed() {

    }
}
