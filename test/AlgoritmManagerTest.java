import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlgoritmManagerTest {
    private AlgoritmManager algoritmManager;
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int MINUSFIVE = -5;

    @Before
    public void setUp() {
        algoritmManager = new AlgoritmManager();
    }

    @After
    public void tearDown() {
        algoritmManager = null;
    }

    @Test
    public void getResultTaskOneCycleOneNumberFive() {
        int[] actual = algoritmManager.getResult(ONE, ONE, FIVE);
        int[] expected = {0, 1, 1, 2, 3};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IncorrectNumberExeption.class)
    public void getResultTaskOneCycleOneNumberMinusFive(){
        algoritmManager.getResult(ONE, ONE, MINUSFIVE);
    }

    @Test
    public void getResultTaskOneCycleOneNumberZero() {
        int[] actual = algoritmManager.getResult(ONE, ONE, ZERO);
        int[] expected = new int[0];
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void getResultTaskOneCycleTwoNumberFive() {
        int[] actual = algoritmManager.getResult(ONE, TWO, FIVE);
        int[] expected = {0, 1, 1, 2, 3};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IncorrectNumberExeption.class)
    public void getResultTaskOneCycleTwoNumberMinusFive() {
        algoritmManager.getResult(ONE, TWO, MINUSFIVE);

    }

    @Test
    public void getResultTaskOneCycleTwoNumberZero() {
        int[] actual = algoritmManager.getResult(ONE, TWO, ZERO);
        int[] expected = new int[0];
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getResultTaskOneCycleThreeNumberFive() {
        int[] actual = algoritmManager.getResult(ONE, THREE, FIVE);
        int[] expected = {0, 1, 1, 2, 3};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IncorrectNumberExeption.class)
    public void getResultTaskOneCycleThreeNumberMinusFive() {
        algoritmManager.getResult(ONE, THREE, MINUSFIVE);
    }

    @Test
    public void getResultTaskOneCycleThreeNumberZero() {
        int[] actual = algoritmManager.getResult(ONE, THREE, ZERO);
        int[] expected = new int[0];
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IncorrectCycleExeption.class)
    public void getResultTaskOneWrongCycle() {
        algoritmManager.getResult(ONE, FIVE, ZERO);
    }

    @Test
    public void getResultTaskTwoCycleOneNumberFive() {
        int[] actual = algoritmManager.getResult(TWO, ONE, FIVE);
        int[] expected = {120};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IncorrectNumberExeption.class)
    public void getResultTaskTwoCycleOneNumberMinusFive() {
        algoritmManager.getResult(TWO, ONE, MINUSFIVE);
    }

    @Test
    public void getResultTaskTwoCycleOneNumberZero() {
        int[] actual = algoritmManager.getResult(TWO, ONE, ZERO);
        int[] expected = {1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getResultTaskTwoCycleTwoNumberFive() {
        int[] actual = algoritmManager.getResult(TWO, TWO, FIVE);
        int[] expected = {120};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IncorrectNumberExeption.class)
    public void getResultTaskTwoCycleTwoNumberMinusFive() {
        algoritmManager.getResult(TWO, TWO, MINUSFIVE);
    }

    @Test
    public void getResultTaskTwoCycleTwoNumberZero() {
        int[] actual = algoritmManager.getResult(TWO, TWO, ZERO);
        int[] expected = {1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getResultTaskTwoCycleThreeNumberFive() {
        int[] actual = algoritmManager.getResult(TWO, THREE, FIVE);
        int[] expected = {120};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IncorrectNumberExeption.class)
    public void getResultTaskTwoCycleThreeNumberMinusFive() {
        algoritmManager.getResult(TWO, THREE, MINUSFIVE);
    }

    @Test
    public void getResultTaskTwoCycleThreeNumberZero() {
        int[] actual = algoritmManager.getResult(TWO, THREE, ZERO);
        int[] expected = {1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IncorrectCycleExeption.class)
    public void getResultTaskTwoWrongCycle() {
        algoritmManager.getResult(TWO, FIVE, ZERO);
    }

    @Test(expected = IncorrectTaskExeption.class)
    public void getResultWrongTask() {
        algoritmManager.getResult(THREE, FIVE, ZERO);
    }
}