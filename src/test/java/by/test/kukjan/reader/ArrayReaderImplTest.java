package by.test.kukjan.reader;

import by.task.kukjan.exception.ArrayException;
import by.task.kukjan.reader.impl.ArrayReaderImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayReaderImplTest {
    private final ArrayReaderImpl reader = new ArrayReaderImpl();

    @Test
    public void readFileTest() throws ArrayException {
        String path = "src\\test\\java\\resources\\file.txt";
        String actual = reader.readFile(path);
        String expected = "5 4 2 1";
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = ArrayException.class, expectedExceptionsMessageRegExp =
            "File path represents invalid file")
    public void readNoFileTest() throws ArrayException{
        reader.readFile("src\\test\\java\\resources\\noFile.txt");
    }

    @Test(expectedExceptions = ArrayException.class)
    public void readNoCorrectLineFileTest() throws  ArrayException{
        String path = "src\\test\\java\\resources\\file.txt";
        String actual = reader.readFile(path);
    }

}
