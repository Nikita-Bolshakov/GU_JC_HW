package lesson14;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task1Test {

    private Task1 task1;
    private final int[] arrayInput;
    private final int[] arrayResult;

    public Task1Test(int[] arrayInput, int[] arrayResult) {
        this.arrayInput = arrayInput;
        this.arrayResult = arrayResult;
    }

    @Parameterized.Parameters
    public static Collection isArrayInputAndResult() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3, 4, 5, 6, 7},new int[]{5, 6, 7}},
                        {new int[]{4, 1250},new int[]{1250}},
                        {new int[]{1, 4, 1000, 4, 4, 365, 512},new int[]{365, 512}},
                        {new int[]{1, 4, 12345},new int[]{12345}}
                }
        );
    }

    @Before
    public void init() {
        task1 = new Task1();
    }

    @Test
    public void testGetNewMassiveAfterNumber4() {
        Assert.assertArrayEquals(arrayResult, task1.getNewMassiveAfterNumber4(arrayInput));
    }

}