package datastructures.tree;

import java.util.Arrays;
import java.util.List;

public class TreeTest {

    public static void main(String[] args) {
        GiminesMedzioSaka<String> senelis = new GiminesMedzioSaka<>("Senelis (Root)");
        
        //Sukuriame pirma "Child" saka
        GiminesMedzioSaka<String> senelioVaikas1 = new GiminesMedzioSaka<>("Senelio vaikas 1");
        //Pirmajam senelio vaikui pridedame du vaikus. (Du senelio anukai)
        GiminesMedzioSaka<String> anukas1 = new GiminesMedzioSaka<>("Senelio anukas 1");
        senelioVaikas1.priskirtiVaika(anukas1);
        GiminesMedzioSaka<String> anukas2 = new GiminesMedzioSaka<>("Senelio anukas 2");
        senelioVaikas1.priskirtiVaika(anukas2);

        GiminesMedzioSaka<String> senelioVaikas2 = new GiminesMedzioSaka<>("Senelio vaikas 2");
        //Antrajam senelio vaikui pridedame viena vaika. (Treciasis senelio anukas)
        GiminesMedzioSaka<String> anukas3 = new GiminesMedzioSaka<>("Senelio anukas 3");
        senelioVaikas2.priskirtiVaika(anukas3);

        senelis.priskirtiVaika(senelioVaikas1);
        senelis.priskirtiVaika(senelioVaikas2);
        senelis.priskirtiVaika("Senelio vaikas 3");

        senelis.priskirtiVaikus(Arrays.asList(
                new GiminesMedzioSaka<>("Senelio vaikas 4"),
                new GiminesMedzioSaka<>("Senelio vaikas 5"),
                new GiminesMedzioSaka<>("Senelio vaikas 6")
        ));

        System.out.println("Gimines medzio informacija");
        System.out.println();

        System.out.println("Medzio saknys, pirmasis (ROOT) elementas - " + senelis.gautiVarda());
        System.out.println("Senelio vaiku skaicius - " + senelis.gautiVaikuSarasa().size());

        System.out.println("=====================");
        System.out.println("Senelio vaiku sarasas");
        int anukuSkaicius = 0;
        for (GiminesMedzioSaka vaikas : senelis.gautiVaikuSarasa()) {
            System.out.println(vaikas.gautiVarda());
            anukuSkaicius += vaikas.gautiVaikuSarasa().size();
        }
        System.out.println("=====================");
        System.out.println("Senelio anuku sarasas");
        System.out.println("Senelio anuku skaicius - " + anukuSkaicius);
        for (GiminesMedzioSaka vaikas : senelis.gautiVaikuSarasa()) {
            List<GiminesMedzioSaka> anukuSarasas = vaikas.gautiVaikuSarasa();
            for(GiminesMedzioSaka anukas : anukuSarasas){
                System.out.println(anukas.gautiVarda() + ", o jo tetis: " + anukas.gautiTeva().gautiVarda());
            }
        }
        System.out.println("=====================");
    }

}
