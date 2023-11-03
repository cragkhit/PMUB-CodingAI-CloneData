public static long calculate(int n) {
    double sqrt5 = Math.sqrt(5);
    double phi = (1 + sqrt5) / 2;
    double psi = (1 - sqrt5) / 2;
    return (long) ((Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5);
}