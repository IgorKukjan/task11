package by.task.kukjan.service.impl;

import by.task.kukjan.entity.EntityArray;
import by.task.kukjan.exception.ArrayException;
import by.task.kukjan.service.ArraySortService;
import by.task.kukjan.validator.ArrayValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArraySortServiceImplement implements ArraySortService {
    private static Logger logger = LogManager.getLogger();
    private static final ArrayValidator validator = new ArrayValidator();




    @Override
    public EntityArray bubbleSort(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int[] arr = array.getEntityArray();
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = arr.length -1; j > i; j--){
                if(arr[j - 1] > arr[j]){
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        array.setEntityArray(arr);
        logger.info("Bubble sort finished. Sorted array is: " + array);
        return array;
    }

    @Override
    public EntityArray insertionSort(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int[] arr = array.getEntityArray();
        for(int i = 0; i<arr.length;i++){
            int j = i;
            while((j > 0) && (arr[j-1] > arr[j])){
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]=tmp;
                j--;
            }
        }
        array.setEntityArray(arr);
        logger.info("Insertion sort finished. Sorted array is: " + array);
        return array;
    }

    @Override
    public EntityArray shellSort(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int[]arr = array.getEntityArray();
        for(int gap = arr.length / 2; gap > 0; gap/=2){
            for(int i = gap; i<arr.length; i++){
                for(int j = i - gap; j >= 0; j-=gap){
                    if(arr[j] > arr[j+gap]){
                        int tmp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap]=tmp;
                    }
                }
            }
        }
        array.setEntityArray(arr);
        logger.info("Shell sort finished. Sorted array is: " + array);
        return array;
    }

    @Override
    public EntityArray sortStream(EntityArray array) throws ArrayException {
        validator.validateToEmpty(array);
        int[] arr = Arrays.stream(array.getEntityArray())
                .sorted()
                .toArray();
        array.setEntityArray(arr);
        logger.info("Sort finished. Sorted array is: " + array);
        return array;
    }


}





















