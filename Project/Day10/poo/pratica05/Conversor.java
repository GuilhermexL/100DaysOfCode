package util;

public class Conversor {

    private static final double IOF = 6.00;

    public static double valorFinal(double cambio, double dollar) {
        return (dollar * cambio) * (1 + IOF / 100);
    }

}
