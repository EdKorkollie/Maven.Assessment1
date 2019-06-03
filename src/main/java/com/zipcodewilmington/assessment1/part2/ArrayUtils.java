package com.zipcodewilmington.assessment1.part2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.io.*;


/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int result = 0;
        for(int i = 0; i < objectArray.length; i++)
        {
            if(objectToCount == objectArray[i])
            {
                result++;
            }
        }
        return result;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> arr = new ArrayList<>();


        for(int i = 0; i< objectArray.length; i++)
        {
            if(objectArray[i] != objectToRemove)
            {
                arr.add(objectArray[i]);
            }
        }

        Integer[] remove = new Integer[arr.size()];
        remove = arr.toArray(remove);
        return remove;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        ArrayList<Object> arr = new ArrayList<>();

        for(int i = 0; i < objectArray.length; i++)
        {

        }

        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {


            return Stream.of(objectArray, objectArrayToAdd).flatMap(Stream:: of).toArray();
    }
}


/**
 ArrayList<Object> arr = new ArrayList<>();
 Object[] added = new Object[objectArray.length + objectArrayToAdd.length];
 ArrayList<Object> arr1Add = new ArrayList<>();

 int count = 0;
 for(int i = 0; i<objectArray.length; i++)
 {
 added[i] = objectArray[i];
 count++;
 }
 for(int j = 0; j < objectArrayToAdd.length; j++)
 {
 added[count++] = objectArrayToAdd[j];
 }
 Integer[] merge = new Integer[arr1Add.size()];
 merge = arr1Add.toArray(merge);
 for(int i = 0; i < added.length; i++);
 */