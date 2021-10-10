package by.task.kukjan.parser.impl;

import by.task.kukjan.entity.EntityArray;
import by.task.kukjan.exception.ArrayException;
import by.task.kukjan.parser.ArrayParser;
import by.task.kukjan.validator.RegexValidator;

public class ArrayParserImpl implements ArrayParser {
    public EntityArray parse(String str) throws ArrayException{
        RegexValidator regexValidator = new RegexValidator();
        if(regexValidator.isValidate(str)){
            final String space = "\\s+";
            int size = str.split(space).length;
            EntityArray entityArray = new EntityArray(size);
            int i = 0;
            for(String element : str.split(space)){
                entityArray.setElement(Integer.parseInt(element), i++);
            }
            return entityArray;
        }else{
            throw new ArrayException("This line is not correct");
        }
    }
}
