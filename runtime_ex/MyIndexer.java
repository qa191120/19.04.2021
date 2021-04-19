package com.example;

public class MyIndexer {

    public int getElement (int[] arr, int index)
    {
        return arr[index];
    }

    public int getElementAndThrow (int[] arr, int index)
    {
        if (index >= arr.length) {
            throw new IndexOutOfBoundsException(
                    String.format(
                            "getElementAndThrow array with %d elements and you tried to get element number %d", arr.length, index)
            );
        }
        return arr[index];
    }

    public int getElementAndThrowCustom (int[] arr, int index)
    {
        if (index >= arr.length) {
            throw new IndexTooBigException(
                    String.format(
                            "getElementAndThrow array with %d elements and you tried to get element number %d", arr.length, index)
            );
        }
        return arr[index];
    }

}
