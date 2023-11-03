public static long calculate(int n) {
    double goldenRatio = (1 + Math.sqrt(5)) / 2;
    return (long) (Math.pow(goldenRatio, n) / Math.sqrt(5) + 0.5);
}