package OOP;

/**
 * Siin failis kasutatakse objekti Kassa, aga Kassa klassi ei eksisteeri. Sinu ülesanne
 * on see luua.
 *
 * Käesolevat klassi ei tohi muuta - mitte ühtegi tähemärki!
 *
 * Jep, sama ülesanne oli ka proovieksamis.
 */

public class Pood {


    public static class  Kassa {
        public Kassa(String kassapidaja) {
        }

        public void lisaToode (String toode){}
        public void eemaldaToode (String toode){}
        public void prindiOstutsekk(){}
        public void prindiKassapidajaNimi(){}

    }

    public static void main(String[] args) {

        String kassapidaja = "Laine";
        Kassa kassa = new Kassa(kassapidaja);

        kassa.lisaToode("Piim");
        kassa.lisaToode("Sai");
        kassa.lisaToode("Lillkapsas");
        kassa.lisaToode("Lamuu jäätis");
        kassa.lisaToode("Kanepiküpsis");
        kassa.eemaldaToode("Piim");
        kassa.eemaldaToode("Sai");
        kassa.lisaToode("Leib");

        kassa.prindiOstutsekk();
        kassa.prindiKassapidajaNimi();
    }
}
