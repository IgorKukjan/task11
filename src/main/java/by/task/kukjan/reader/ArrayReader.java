package by.task.kukjan.reader;

import by.task.kukjan.exception.ArrayException;

public interface ArrayReader {
    String readFile(String filePathString) throws ArrayException;
}
