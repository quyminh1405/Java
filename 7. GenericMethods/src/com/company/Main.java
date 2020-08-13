package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static Integer[] intArray = { 4, 2, 0, 6, 9};
    static String[] stringArray = {"fu", "ck", "you"};
    static Boolean[] boolArray = {true, false, true};

    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
	    List<String> stringList = arrayToList(stringArray, new ArrayList<>());
	    List<Integer> intList = arrayToList(intArray, new ArrayList<>());
	    List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());

	    /*The <T> helps us with not getting ClassCastException when we apply the wrong type like this*/
        //no se bao loi ngay khi ghi line nay vao, con neu k co dang <T> thi nos se k bao, den khi run moi bi Exception
        //List<String> stringList2 = arrayToList(intArray, new ArrayList<>());
    }
}
