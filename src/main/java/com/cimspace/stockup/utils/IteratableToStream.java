package com.cimspace.stockup.utils;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IteratableToStream {

    // Function to get the Stream
    public static <T> Stream<T>
    getStreamFromIterable(Iterable<T> iterable)
    {

        // Convert the Iterable to Spliterator
        Spliterator<T>
                spliterator = iterable.spliterator();

        // Get a Sequential Stream from spliterator
        return StreamSupport.stream(spliterator, false);
    }

    // Driver code
    public static void main(String[] args)
    {

        // Get the Iterator
        Iterable<Integer>
                iterable = Arrays.asList(1, 2, 3, 4, 5);

        // Get the Stream from the Iterable
        Stream<Integer>
                stream = getStreamFromIterable(iterable);

        // Print the elements of stream
        stream.forEach(s -> System.out.println(s));
    }
}
