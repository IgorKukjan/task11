package by.test.kukjan.service;

import by.task.kukjan.entity.EntityArray;
import by.task.kukjan.exception.ArrayException;
import by.task.kukjan.service.ArraySortService;
import by.task.kukjan.service.impl.ArraySortServiceImplement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArraySortServiceImplementTest {
    private EntityArray array;
    private ArraySortService service;

    @BeforeClass
    public void setEntity(){
        array = new EntityArray(-4, 5, -1, 3, -2, 0);
        service = new ArraySortServiceImplement();
    }

    @Test
    public void testBubbleSort() throws ArrayException {
       EntityArray actual = service.bubbleSort(array);
        EntityArray expected = new EntityArray(-4, -2, -1, 0, 3, 5);
        Assert.assertEquals(actual, expected);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() throws ArrayException {
        EntityArray actual = service.insertionSort(array);
        EntityArray expected = new EntityArray(-4, -2, -1, 0, 3, 5);
        Assert.assertEquals(actual, expected);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShellSort() throws ArrayException {
        EntityArray actual = service.shellSort(array);
        EntityArray expected = new EntityArray(-4, -2, -1, 0, 3, 5);
        Assert.assertEquals(actual, expected);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSortStream() throws ArrayException {
        EntityArray actual = service.sortStream(array);
        EntityArray expected = new EntityArray(-4, -2, -1, 0, 3, 5);
        Assert.assertEquals(actual, expected);
        Assert.assertEquals(actual, expected);
    }

}
