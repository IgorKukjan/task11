package by.task.kukjan.service;

import by.task.kukjan.entity.EntityArray;
import by.task.kukjan.exception.ArrayException;

public interface ArraySortService {
    EntityArray bubbleSort(EntityArray array) throws ArrayException;

    EntityArray insertionSort(EntityArray array) throws ArrayException;

    EntityArray shellSort(EntityArray array) throws ArrayException;

    EntityArray sortStream(EntityArray array) throws ArrayException;
}
