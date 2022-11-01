import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5.00;
        int armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double total;
        Scanner inp = new Scanner(System.in);
        System.out.println("Armut kac kilo ? :");
        armutKilo = inp.nextInt();
        System.out.println("Elma kac kilo ? :");
        elmaKilo = inp.nextInt();
        System.out.println("Domates kac kilo ? :");
        domatesKilo = inp.nextInt();
        System.out.println("Muz kac kilo ? :");
        muzKilo = inp.nextInt();
        System.out.println("Patlican kac kilo ? :");
        patlicanKilo = inp.nextInt();

        total = (armutKilo*armut) + (elmaKilo*elma) + (domatesKilo*domates) + (muzKilo*muz) + (patlicanKilo*patlican);
        System.out.println("total :" + total);


    }
}
