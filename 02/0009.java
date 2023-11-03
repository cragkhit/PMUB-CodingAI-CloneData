private static BigInteger fib(int n) {
    if (n <= 1) {
        return BigInteger.valueOf(n);
    }
    if (memo[n] == null) {
        memo[n] = fib(n - 1).add(fib(n - 2));
    }
    return memo[n];
}