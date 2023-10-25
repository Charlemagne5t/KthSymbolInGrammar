import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void kthGrammarTest1() {
        int n = 1;
        int k = 1;
        int expected = 0;
        int actual = new Solution().kthGrammar(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void kthGrammarTest2() {
        int n = 1;
        int k = 1;
        int expected = 0;
        int actual = new Solution().kthGrammar(n, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void kthGrammarTest3() {
        int n = 2;
        int k = 2;
        int expected = 1;
        int actual = new Solution().kthGrammar(n, k);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void kthGrammarTest4() {
        int n = 11;
        int k = 5;
        int expected = 0;
        int actual = new Solution().kthGrammar(n, k);

        Assert.assertEquals(expected, actual);
    }
}
