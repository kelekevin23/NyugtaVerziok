package nyugtaprojektek;
/* Probléma:
a 3. tétel árát 650-ről átírtuk 1320-ra.
Így szinte minden változott, mindenhez hozzá kell nyúlni
Refaktorizálás:
anmit egynél többször használunk, 
azt kiszervezzük változóba és erre hivatkozunk
*/
public class Nyugta2 {

    public static void main(String[] args) {
        //System.out.println("******************");
        String csillagok = "*******************";
        System.out.println(csillagok);
        System.out.println("     Nyugta 2");
        //System.out.println("******************");
        System.out.println(csillagok);
        
        String huf = "Ft";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        //System.out.println("Tétel 1:     350 Ft");
        System.out.printf("Tétel 1:     %d %s\n", tetel1, huf);
        //System.out.println("Tétel 2:      90 Ft");
        System.out.printf("Tétel 1:      %d %s\n", tetel2, huf);
        //System.out.println("Tétel 3:    1320 Ft");
        System.out.printf("Tétel 3:    %d %s\n", tetel3, huf);

        //System.out.println("==================");
        String duplaVonal = "===================";
        System.out.println(duplaVonal);
        
        //System.out.println("Összesen:   1090 Ft");
        int osszesen = tetel1 + tetel2 + tetel3;
        System.out.printf("Összesen:   %d %s\n", osszesen, huf);
        
        //System.out.println("------------------");
        String szaggatottVonal = "-------------------";
        System.out.println(szaggatottVonal);
        
        int kedvMertek = 10;
        int kedvezmeny = osszesen / kedvMertek;
        //System.out.println("Kedvezmény:  109 Ft");
        System.out.printf("Kedvezmény:  %d %s\n", kedvezmeny, huf);
        //System.out.println("(10%)");
        System.out.printf("(%d%%)\n", kedvMertek);
        
        //System.out.println("==================");
        System.out.println(duplaVonal);
        
        int fizetendo = osszesen - kedvezmeny;
        //System.out.println("Fizetendő:   981 Ft");
        System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        double euro = fizetendo / 350.0;
        huf = "\u20ac";//EZ NEM JÓ!!!!
        System.out.printf("            %f %s\n", euro, huf);
        
        
        //System.out.println("------------------");
        System.out.println(szaggatottVonal);
        
        System.out.println("");
        //System.out.print("_______");
        //System.out.print("   ");
        //System.out.println("_______");
        
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "     ";
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        
        System.out.print(" Dátum");
        //System.out.print("   ");
        System.out.print(rovidVonalValaszto);
        
        System.out.println("   Név");
        
        //System.out.println("******************");
        System.out.println(csillagok);
        
        System.out.println("        CÉG");
        //System.out.println("******************");
        System.out.println(csillagok);
    }

}
