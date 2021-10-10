package by.test.kukjan.service;

import by.task.kukjan.entity.EntityArray;
import by.task.kukjan.exception.ArrayException;
import by.task.kukjan.service.ArrayService;
import by.task.kukjan.service.impl.ArrayServiceImplement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayServiceImplementTest {
    private EntityArray array;
    private ArrayService service;

    @BeforeClass
    public void setEntity(){
        array = new EntityArray(-4, 5, -1, 3, -2, 0);
        service = new ArrayServiceImplement();
    }

    @Test
    public void testSearchMinElementOfArray() throws ArrayException{
        int actual = service.searchMinElementOfArray(array);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchMinElementOfArrayStream() throws ArrayException{
        int actual = service.searchMinElementOfArrayStream(array);
        int expected = -4;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchMaxElementOfArray() throws ArrayException{
        int actual = service.searchMaxElementOfArray(array);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchMaxElementOfArrayStream() throws ArrayException{
        int actual = service.searchMaxElementOfArrayStream(array);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSwapNegativeElementsOfArray() throws ArrayException{
        EntityArray actual = service.swapNegativeElementsOfArray(array);
        EntityArray expected = new EntityArray(4, 5, 1, 3, 2, 0);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSwapNegativeElementsOfArrayStream() throws ArrayException{
        EntityArray actual = service.swapNegativeElementsOfArrayStream(array);
        EntityArray expected = new EntityArray(4, 5, 1, 3, 2, 0);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchAverageValueOfArray() throws ArrayException{
        double actual = service.searchAverageValueOfArray(array);
        double expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchAverageValueOfArrayStream() throws ArrayException{
        double actual = service.searchAverageValueOfArrayStream(array);
        double expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchSumOfArray() throws ArrayException{
        int actual = service.searchSumOfArray(array);
        int expected = 15;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchSumOfArrayStream() throws ArrayException{
        int actual = service.searchSumOfArrayStream(array);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchQuantityPositiveNumbersOfArray() throws ArrayException{
        int actual = service.searchQuantityPositiveNumbersOfArray(array);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchQuantityPositiveNumbersOfArrayStream() throws ArrayException{
        int actual = service.searchQuantityPositiveNumbersOfArrayStream(array);
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchQuantityNegativeNumbersOfArray() throws  ArrayException{
        int actual = service.searchQuantityNegativeNumbersOfArray(array);
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchQuantityNegativeNumbersOfArrayStream() throws  ArrayException{
        int actual = service.searchQuantityNegativeNumbersOfArrayStream(array);
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }
}
