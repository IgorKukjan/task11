package by.test.kukjan.parser;

import by.task.kukjan.entity.EntityArray;
import by.task.kukjan.exception.ArrayException;
import by.task.kukjan.parser.impl.ArrayParserImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayParserImplTest {
    private final ArrayParserImpl arrayParserImpl = new ArrayParserImpl();
    static Logger  logger = LogManager.getLogger(ArrayParserImplTest.class);

    private EntityArray array;

    @BeforeClass
    public void setEntity(){
        array = new EntityArray(-4, 5, -1, 3);
    }

    @Test
    public void parseTest() throws ArrayException{
        EntityArray actual = arrayParserImpl.parse("-4 5 -1  3");
        EntityArray expected = array;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = ArrayException.class)
    public void parseTestException() throws ArrayException{
        EntityArray actual = arrayParserImpl.parse("-4.0 5.9 -1.7  3.9");
        EntityArray expected = array;
        Assert.assertEquals(actual, expected);
    }
}
