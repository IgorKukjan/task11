package by.task.kukjan.main;


import by.task.kukjan.entity.EntityArray;
import by.task.kukjan.exception.ArrayException;
import by.task.kukjan.parser.ArrayParser;
import by.task.kukjan.parser.impl.ArrayParserImpl;
import by.task.kukjan.reader.ArrayReader;
import by.task.kukjan.reader.impl.ArrayReaderImpl;
import by.task.kukjan.service.ArrayService;
import by.task.kukjan.service.ArraySortService;
import by.task.kukjan.service.impl.ArrayServiceImplement;
import by.task.kukjan.service.impl.ArraySortServiceImplement;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main{
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        ArrayReader reader = new ArrayReaderImpl();
        ArrayParser parser = new ArrayParserImpl();
        ArrayService arrayService = new ArrayServiceImplement();
        ArraySortService arraySortService = new ArraySortServiceImplement();

        try{
            String numberLine = reader.readFile("src\\main\\resources\\file\\file_2.txt");
            EntityArray array = parser.parse(numberLine);


            arrayService.searchMinElementOfArray(array);
            arrayService.searchMinElementOfArrayStream(array);
            arrayService.searchMaxElementOfArray(array);
            arrayService.searchMaxElementOfArrayStream(array);

            arrayService.swapNegativeElementsOfArray(array);
            arrayService.swapNegativeElementsOfArrayStream(array);

            arrayService.searchAverageValueOfArray(array);
            arrayService.searchAverageValueOfArrayStream(array);

            arrayService.searchSumOfArray(array);
            arrayService.searchSumOfArrayStream(array);

            arrayService.searchQuantityPositiveNumbersOfArray(array);
            arrayService.searchQuantityPositiveNumbersOfArrayStream(array);
            arrayService.searchQuantityNegativeNumbersOfArray(array);
            arrayService.searchQuantityNegativeNumbersOfArrayStream(array);

            arraySortService.bubbleSort(array);
            arraySortService.insertionSort(array);
            arraySortService.shellSort(array);
            arraySortService.sortStream(array);

        }catch (ArrayException e){
            logger.log(Level.FATAL, e.getMessage());
        }
    }
}



