package nyugtaprojektek;

/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
 */
public class Nyugta3 {

    public static void main(String[] args) {
        String csillagok = "********************";
        System.out.println(csillagok);
        System.out.printf("%14s\n", "Nyugta 3");
        System.out.println(csillagok);

        final String HUF = "Ft";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        System.out.printf("%10s:%6d%3s\n", "Tétel 1", tetel1, HUF);
        System.out.printf("%10s:%6d%3s\n", "Tétel 2", tetel2, HUF);
        System.out.printf("%10s:%6d%3s\n", "Tétel 3", tetel3, HUF);

        String duplaVonal = "====================";
        System.out.println(duplaVonal);

        int osszesen = tetel1 + tetel2 + tetel3;
        System.out.printf("%10s:%6d%3s\n", "Összesen", osszesen, HUF);

        String szaggatottVonal = "--------------------";
        System.out.println(szaggatottVonal);

        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s:%6d%3s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);

        System.out.println(duplaVonal);

        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:%6d%3s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;

        final String eur = "\u20ac";
        System.out.printf("%10s%7.2f%2s\n", "", euro, eur);//

        System.out.println(szaggatottVonal + "\n");

        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        System.out.printf("%13s\n", rovidVonal);

        System.out.printf("%6s", "Dátum");
        System.out.printf("%12s\n", "Név");

        System.out.println(csillagok);
        System.out.printf("%11s\n", "CÉG");
        System.out.println(csillagok);
    }

}
