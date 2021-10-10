package by.task.kukjan.service;

import by.task.kukjan.entity.EntityArray;
import by.task.kukjan.exception.ArrayException;

public interface ArrayService {
    int searchMinElementOfArray(EntityArray array) throws ArrayException;
    int searchMinElementOfArrayStream(EntityArray array) throws ArrayException;
    int searchMaxElementOfArray(EntityArray array) throws ArrayException;
    int searchMaxElementOfArrayStream(EntityArray array) throws ArrayException;

    EntityArray  swapNegativeElementsOfArray(EntityArray array) throws ArrayException;
    EntityArray  swapNegativeElementsOfArrayStream(EntityArray array) throws ArrayException;

    double searchAverageValueOfArray(EntityArray array) throws ArrayException;
    double searchAverageValueOfArrayStream(EntityArray array) throws ArrayException;

    int searchSumOfArray(EntityArray array) throws ArrayException;
    int searchSumOfArrayStream(EntityArray array) throws ArrayException;

    int searchQuantityPositiveNumbersOfArray(EntityArray array) throws ArrayException;
    int searchQuantityPositiveNumbersOfArrayStream(EntityArray array) throws ArrayException;
    int searchQuantityNegativeNumbersOfArray(EntityArray array) throws ArrayException;
    int searchQuantityNegativeNumbersOfArrayStream(EntityArray array) throws ArrayException;
}
