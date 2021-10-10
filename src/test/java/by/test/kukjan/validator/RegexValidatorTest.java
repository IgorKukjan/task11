package by.test.kukjan.validator;

import by.task.kukjan.validator.RegexValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegexValidatorTest {
    private final RegexValidator validator = new RegexValidator();

    @Test
    public void validateStringTest(){
        boolean actual = validator.isValidate("12 -3 2 8");
        Assert.assertEquals(actual, true);
    }

    @Test
    public void validateStringNegativeTest(){
        boolean actual = validator.isValidate("1g2 -3r 2 8");
        Assert.assertEquals(actual, false);
    }

}
