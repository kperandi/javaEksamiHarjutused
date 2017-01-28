package OOP;

import java.util.Arrays;

/**
 * Raamatukogus on Sõnaraamat. Õigemini siis on, kui sa selle klassi kirjutad.
 *
 * Raamatukogu klassi ei tohi muuta.
 */
class Sonaraamat {

    public Sonaraamat(String raamatuKeel) {
    }

    public void sisestaSona(String puaas) {
    }

    public String[] otsiEsimeseTaheJargi(String u) {
        return new String[0];
    }

    public void eemaldaSona(String s) {
    }

    public void misKeelesRaamatOn() {
    }
}

public class Raamatukogu {
    public static void main(String[] args) {

        String raamatuKeel = "Eesti";
        Sonaraamat raamat = new Sonaraamat(raamatuKeel);
        raamat.sisestaSona("puaas");
        raamat.sisestaSona("uubuma");
        raamat.sisestaSona("uudikristamine");
        raamat.sisestaSona("suaree");
        raamat.sisestaSona("sarkasm");
        raamat.sisestaSona("iroonia");

        String[] vaste = raamat.otsiEsimeseTaheJargi("u");
        System.out.println(Arrays.toString(vaste));

        String[] vaste2 = raamat.otsiEsimeseTaheJargi("s");
        System.out.println(Arrays.toString(vaste2));

        raamat.eemaldaSona(vaste2[0]);

        raamat.misKeelesRaamatOn();

    }
}
