package fr.danna;

import java.text.DecimalFormat;

public class Rationnel {

    private long numerateur;
    private long denominateur;

    public static final DecimalFormat FORMAT = new DecimalFormat();
    static {
        FORMAT.setMaximumFractionDigits(2); //arrondi à 2 chiffres apres la virgules
        FORMAT.setMinimumFractionDigits(2);
        FORMAT.setDecimalSeparatorAlwaysShown(true);
    }

    public Rationnel(long num, long denom) throws IllegalArgumentException {
        if (denom == 0) {
            throw new IllegalArgumentException("Dénominateur ne peut pas être zéro");
        }
        numerateur = num;
        denominateur = denom;
    }

    public long getNumerateur() {
        return numerateur;
    }

    public long getDenominateur() {
        return denominateur;
    }

    public Rationnel reduction() {
        long pgcd = Pgcd.pgcd(numerateur, denominateur);
        return new Rationnel(numerateur / pgcd, denominateur / pgcd);
    }

    public Rationnel somme(Rationnel rat) {
        return new Rationnel((numerateur * rat.getDenominateur()) + (rat.getNumerateur() * denominateur), denominateur * rat.getDenominateur());
    }

    public static Rationnel somme(Rationnel r1, Rationnel r2) {
        return r1.somme(r2);
    }

    @Override
    public String toString() {
        return String.format(numerateur + " / " + denominateur + " ~ " + FORMAT.format((double)((double)numerateur / (double)denominateur)));
    }
}
