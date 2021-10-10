package by.task.kukjan.parser;

import by.task.kukjan.entity.EntityArray;
import by.task.kukjan.exception.ArrayException;

public interface ArrayParser {
    EntityArray parse(String str) throws ArrayException;
}
