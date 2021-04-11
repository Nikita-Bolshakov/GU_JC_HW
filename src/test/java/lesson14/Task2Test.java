package lesson14;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task2Test {

    private Task2 task2;
    private final int[] array;
    private final boolean check;

    public Task2Test(int[] array, boolean check) {
        this.array = array;
        this.check = check;
    }

    @Parameterized.Parameters
    public static Collection isArrayInputAndResult() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 4, 1, 4}, true},
                        {new int[]{1, 1, 1, 1}, false},
                        {new int[]{4, 4, 4, 4}, false},
                        {new int[]{1, 2, 3, 4}, false}
                }
        );
    }

    @Before
    public void init() {
        task2 = new Task2();
    }

    @Test
    public void testCheckArrayFor1And4() {
        Assert.assertEquals(check, task2.checkArrayFor1And4(array));
    }

}