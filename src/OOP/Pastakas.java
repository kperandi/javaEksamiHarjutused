package OOP;


/**
 * Created by Kersti on 28.01.2017.
 */
public class Pastakas{

    int tind;

    public Pastakas(int tindiKogus) {
        tind=tindiKogus;
    }

    public void kirjuta(String kiri) {
        if (tind> kiri.length()){
            System.out.println(kiri);
            tind=tind-kiri.length();
        }
        else {
            System.out.println(kiri.substring(0,tind));
        }
    }

    public void prindiPaljuTintiAlles() {
        System.out.println(tind);
    }
}
