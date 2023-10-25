public class Solution {
    public int kthGrammar(int n, int k) {
        int rowLength = (int) Math.pow(2, n - 1);
        boolean isZero = true;
        while (k > 1) {
            if (k - rowLength / 2 > 0) {
                isZero = !isZero;
                k = k - rowLength / 2;
            }
            rowLength /= 2;
        }

        return isZero ? 0 : 1;
    }
}
