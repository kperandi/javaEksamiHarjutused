package OOP;

import java.util.ArrayList;

/**
 * Created by Kersti on 3.02.2017.
 */
public class Kassa {

    String nimi;
    ArrayList<String> tooted= new ArrayList<String>();

    public Kassa(String kassapidaja) {
        nimi=kassapidaja;
    }

    public void lisaToode(String toode) {
        tooted.add(toode);
    }

    public void eemaldaToode(String toode) {
        tooted.remove(toode);
    }

    public void prindiOstutsekk() {
        System.out.println(tooted);
    }

    public void prindiKassapidajaNimi() {
        System.out.println(nimi);
    }
}
