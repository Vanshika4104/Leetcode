class Solution {
    public double myPow(double x, int n) {
        return power(x, (long) n); // ✅ delegate to helper with long
    }

    private double power(double x, long n) {
        if (n == 0) return 1;

        if (n < 0) return 1 / power(x, -n);

        double temp = power(x, n / 2);
        if (n % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }
}
