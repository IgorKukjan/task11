package by.task.kukjan.validator;

import by.task.kukjan.entity.EntityArray;
import by.task.kukjan.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayValidator {
    public static Logger logger = LogManager.getLogger();

    public boolean validateToNull(EntityArray array){
        return array == null || array.getEntityArray().length == 0;
    }

    public void validateToEmpty(EntityArray array) throws ArrayException{
        if(validateToNull(array)){
            logger.error("Entity is equal to null or array is empty");
            throw new ArrayException("Entity is equal to null or array is empty");
        }
    }
}
