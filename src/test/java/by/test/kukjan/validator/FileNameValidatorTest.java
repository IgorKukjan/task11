package by.test.kukjan.validator;

import by.task.kukjan.exception.ArrayException;
import by.task.kukjan.validator.FileNameValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileNameValidatorTest {
    private final FileNameValidator validator = new FileNameValidator();

    @Test
    public void fileExistsTest() throws ArrayException{
        Assert.assertTrue(validator.validateFile("src\\test\\java\\resources\\file.txt"));
    }

    @Test
    public void fileNameEqualToNullTest() throws ArrayException{
        Assert.assertFalse(validator.validateFile(null));
    }

    @Test
    public void pathIsEmptyTest() throws ArrayException{
        Assert.assertFalse(validator.validateFile(""));
    }

}
