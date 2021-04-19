package com.example;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MyIndexerTest {

    // public int getElement (int[] arr, int index)
    // legitimate input
    @Test
    public void myIndexer_getElement_positive_flow() {
        // arrange
        MyIndexer my_indexer = new MyIndexer();
        int[] arr = { 1, 2, 3, 4, 5};

        // assert
        for (int index = 0; index < arr.length; index++)
        {
            // act
            int elem = my_indexer.getElement(arr, index);

            // assert
            assertEquals(arr[index], elem);
        }
    }

    // index out of bound input -- exception
    @Test (expected = IndexOutOfBoundsException.class)
    public void myIndexer_getElement_outOfBound_exception() {
        // arrange
        MyIndexer my_indexer = new MyIndexer();
        int[] arr = { 1, 2, 3, 4, 5};

        // act
        my_indexer.getElement(arr, arr.length);
    }

    // public int getElementAndThrow (int[] arr, int index)
    // legitimate input
    @Test
    public void myIndexer_getElementAndThrow_positive_flow() {
        // arrange
        MyIndexer my_indexer = new MyIndexer();
        int[] arr = { 1, 2, 3, 4, 5};

        // assert
        for (int index = 0; index < arr.length; index++)
        {
            // act
            int elem = my_indexer.getElementAndThrow(arr, index);

            // assert
            assertEquals(arr[index], elem);
        }
    }

    // index out of bound input -- exception
    @Test (expected = IndexOutOfBoundsException.class)
    public void myIndexer_getElementAndThrow_outOfBound_exception() {
        // arrange
        MyIndexer my_indexer = new MyIndexer();
        int[] arr = { 1, 2, 3, 4, 5};

        // act
        my_indexer.getElementAndThrow(arr, arr.length);
    }

    // public int getElementAndThrowCustom (int[] arr, int index)
    // legitimate input
    @Test
    public void myIndexer_getElementAndThrowCustom_positive_flow() {
        // arrange
        MyIndexer my_indexer = new MyIndexer();
        int[] arr = { 1, 2, 3, 4, 5};

        // assert
        for (int index = 0; index < arr.length; index++)
        {
            // act
            int elem = my_indexer.getElementAndThrowCustom(arr, index);

            // assert
            assertEquals(arr[index], elem);
        }
    }
    // index out of bound input negative -- exception
    @Test (expected = IndexOutOfBoundsException.class)
    public void myIndexer_getElementAndThrowCustom_outOfBound_exception() {
        // arrange
        MyIndexer my_indexer = new MyIndexer();
        int[] arr = { 1, 2, 3, 4, 5};

        // act
        my_indexer.getElementAndThrowCustom(arr, -1);
    }

    // index too big  -- custom exception
    @Test (expected = IndexTooBigException.class)
    public void myIndexer_getElementAndThrowCustom_TooBig_exception() {
        // arrange
        MyIndexer my_indexer = new MyIndexer();
        int[] arr = { 1, 2, 3, 4, 5};

        // act
        my_indexer.getElementAndThrowCustom(arr, arr.length);
    }

}
