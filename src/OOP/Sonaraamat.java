package OOP;

import java.util.ArrayList;

/**
 * Created by Kersti on 3.02.2017.
 */
public class Sonaraamat {

    String keel;
    ArrayList<String> sõnad = new ArrayList<String>();

    public Sonaraamat(String raamatuKeel) {
        keel=raamatuKeel;
    }

    public void sisestaSona(String sõna) {
        sõnad.add(sõna);
    }

    public String[] otsiEsimeseTaheJargi(char täht) {
        String[] õigedsõnad = new String[0];
        int j =0;
        for (String i:sõnad){
            char a=(i.charAt(0));
            if (a==täht){
                õigedsõnad[j]=i;
                j++;
            }
        }
        return õigedsõnad;
    }

    public void eemaldaSona(String sõna) {

    }

    public void misKeelesRaamatOn() {

    }
}
