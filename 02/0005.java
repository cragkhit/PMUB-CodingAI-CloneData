public static long calculate(int n) {
    if (n <= 1) {
        return n;
    }
    long[][] F = {{1, 1}, {1, 0}};
    power(F, n - 1);
    return F[0][0];
}