public static BigInteger calculate(int n) {
    if (n <= 1) {
        return BigInteger.valueOf(n);
    }
    BigInteger prev = BigInteger.ZERO;
    BigInteger curr = BigInteger.ONE;
    for (int i = 2; i <= n; i++) {
        BigInteger next = prev.add(curr);
        prev = curr;
        curr = next;
    }
return curr;
}