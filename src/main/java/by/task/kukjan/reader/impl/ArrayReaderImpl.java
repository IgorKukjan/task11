package by.task.kukjan.reader.impl;

import by.task.kukjan.exception.ArrayException;


import by.task.kukjan.validator.FileNameValidator;
import by.task.kukjan.validator.RegexValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.task.kukjan.reader.ArrayReader;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;




public class ArrayReaderImpl implements ArrayReader {
    private static final Logger logger = LogManager.getLogger();
    private static final RegexValidator regexValidator = new RegexValidator();
    private static final FileNameValidator fileNameValidator = new FileNameValidator();

    public String readFile(String filePathString) throws ArrayException {
        if (!fileNameValidator.validateFile(filePathString)) {
            logger.log(Level.ERROR, "File path represents invalid file");
            throw new ArrayException("File path represents invalid file");
        }
        Path path = Paths.get(filePathString);
        String correctLine = null;
        try (var fileLines = Files.lines(path)) {
            correctLine = fileLines
                    .filter(regexValidator::isValidate)
                    .findFirst()
                    .orElse(null);
        } catch (IOException e) {
            logger.log(Level.ERROR, "Error while reading file", filePathString);
            throw new ArrayException("Error while reading file " + filePathString);
        }
        if (correctLine == null) {
            logger.log(Level.ERROR, "No correct line was found in file", filePathString);
            throw new ArrayException("No correct line was found in file " + filePathString);
        }
        logger.log(Level.INFO, "Correct line was read in file:", filePathString);
        return correctLine;
    }
}


