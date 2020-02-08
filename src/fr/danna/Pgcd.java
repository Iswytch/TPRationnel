package fr.danna;

public class Pgcd {

    public static long pgcd(long num, long denom) {
        if (num == denom) {
            return num;
        }
        if (num > denom) {
            return pgcd(num - denom, denom);
        }
        return pgcd(num, denom - num);
    }
}
