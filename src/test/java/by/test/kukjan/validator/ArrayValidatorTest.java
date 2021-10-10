package by.test.kukjan.validator;

import by.task.kukjan.entity.EntityArray;
import by.task.kukjan.exception.ArrayException;
import by.task.kukjan.validator.ArrayValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayValidatorTest {
    private final ArrayValidator validator = new ArrayValidator();

    @Test
    public void equalsEntityToNullTest(){
        Assert.assertTrue(validator.validateToNull(null));
    }

    @Test
    public void equalsToCorrectEntityTest(){
        Assert.assertFalse(validator.validateToNull(new EntityArray(new int[]{1, 3})));
    }

    @Test
    public void validateArrayTest() throws ArrayException{
        validator.validateToEmpty(new EntityArray(new int[]{1, 3}));
    }

    @Test(expectedExceptions = ArrayException.class)
    public void validateEmptyArrayTest() throws ArrayException{
        validator.validateToEmpty(new EntityArray(new int[]{}));
    }
}
