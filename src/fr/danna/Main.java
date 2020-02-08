package fr.danna;

public class Main {

    public static void main(String[] args) {
        Rationnel r1 = new Rationnel(5, 2);
//        System.out.println("R1 = " + r1.toString());
        Rationnel r2 = new Rationnel(3, 9);

//        Rationnel r3 = r1;
//        System.out.println("R3 = " + r3.toString());

        Rationnel ratSomme = r1.somme(r2);
        System.out.println("Somme = " + ratSomme.toString());

        Rationnel ratSomme2 = r2.somme(r1);
        System.out.println("Somme = " + ratSomme2.toString());


        System.out.println("Somme = " + Rationnel.somme(r1, r2).toString());
    }
}
