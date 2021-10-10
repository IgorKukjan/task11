package by.task.kukjan.service.impl;

import by.task.kukjan.entity.EntityArray;
import by.task.kukjan.exception.ArrayException;
import by.task.kukjan.service.ArrayService;
import by.task.kukjan.validator.ArrayValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayServiceImplement implements ArrayService {
    private static final ArrayValidator validator = new ArrayValidator();
    public static Logger logger = LogManager.getLogger();

    @Override
    public int searchMinElementOfArray(EntityArray array)throws ArrayException{
        validator.validateToEmpty(array);
        int min = array.getElement(0);
        for(int element : array.getEntityArray()){
            if(element < min){
                min = element;
            }
        }
        logger.log(Level.INFO, "Minimum array element: " + min);
        return min;
    }

    @Override
    public int searchMinElementOfArrayStream(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int min = IntStream
                .of(array.getEntityArray())
                .min().getAsInt();
        logger.log(Level.INFO, "Minimum array element: " + min);
        return min;
    }

    @Override
    public int searchMaxElementOfArray(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int max = array.getElement(0);
        for(int element : array.getEntityArray()){
            if(element > max){
                max = element;
            }
        }
        logger.log(Level.INFO,"Maximum array element: " + max);
        return max;
    }

    @Override
    public int searchMaxElementOfArrayStream(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int max = IntStream
                .of(array.getEntityArray())
                .max().getAsInt();
        logger.log(Level.INFO, "Maximum array element: " + max);
        return max;
    }

    @Override
    public EntityArray swapNegativeElementsOfArray(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int[] arr = array.getEntityArray();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]< 0){
                arr[i] *= -1;
            }
        }
        array.setEntityArray(arr);
        logger.log(Level.INFO, "The array after swapping negative elements to positive is " + array);
        return array;
    }

    @Override
    public EntityArray swapNegativeElementsOfArrayStream(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int[] arr = Arrays.stream(array.getEntityArray())
                .map(s -> s < 0 ? s*(-1) : s )
                .toArray();
        array.setEntityArray(arr);
        logger.log(Level.INFO, "The array after swapping negative elements to positive is " + array);
        return array;
    }

    @Override
    public double searchAverageValueOfArray(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        double average = 1.0 * searchSumOfArray(array)/array.size();
        logger.log(Level.INFO, "The average value of array elements = " + average);
        return average;
    }

    @Override
    public double searchAverageValueOfArrayStream(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        double average = IntStream
                .of(array.getEntityArray())
                .average().getAsDouble();
        logger.log(Level.INFO, "The average value of array elements = " + average);
        return average;
    }

    @Override
    public int searchSumOfArray(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int sum = 0;
        for(int element : array.getEntityArray()){
            sum += element;
        }
        logger.log(Level.INFO,"The sum of the array elements = " + sum);
        return sum;
    }

    @Override
    public int searchSumOfArrayStream(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int[] arr = array.getEntityArray();
        int sum = Arrays.stream(arr)
                .reduce((acc, b) -> acc + b)
                .getAsInt();
        array.setEntityArray(arr);
        logger.log(Level.INFO, "The sum of the array elements = " + sum);
        return sum;
    }

    @Override
    public int searchQuantityPositiveNumbersOfArray(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int count = 0;
        for(int element : array.getEntityArray()){
            if(element > 0){
                count++;
            }
        }
        logger.log(Level.INFO, "Number of positive array elements = " + count);
        return count;
    }

    @Override
    public int searchQuantityPositiveNumbersOfArrayStream(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int count = (int) IntStream
                .of(array.getEntityArray())
                .filter(num -> num > 0).count();
        logger.log(Level.INFO, "Number of positive array elements = " + count);
        return count;
    }

    @Override
    public int searchQuantityNegativeNumbersOfArray(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int count = 0;
        for(int element : array.getEntityArray()){
            if(element < 0){
                count++;
            }
        }
        logger.log(Level.INFO, "Number of negative array elements = " + count);
        return count;
    }

    @Override
    public int searchQuantityNegativeNumbersOfArrayStream(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int count = (int) IntStream
                .of(array.getEntityArray())
                .filter(num -> num < 0).count();
        logger.log(Level.INFO, "Number of negative array elements = " + count);
        return count;
    }

}
