package Algoritm;

import java.util.ArrayList;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};
        ArrayList<Integer> uus = new ArrayList();
        for (int i=0; i<naide.length; i++){
            uus.add(naide[i]);
        }
        System.out.println(uus);

        for (int i=0; i<uus.size(); i++){
            int a = uus.get(i);
            if (a==7) {
                uus.set(i, a*2);
            }
        }
        System.out.println(uus);

        int a = 0;
        for (int i=0; i<uus.size(); i++){
            a=a+uus.get(i);
            }
        int keskmine=a/uus.size();
        System.out.println("Arvude keskmine on "+keskmine);

    }

}
