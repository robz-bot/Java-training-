/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Collections;

import java.util.Hashtable;

/**
 *
 * @author ROBIN RAJESH
 */
public class hashTable {

    public static void main(String[] args) {
        Hashtable<String, Integer> numbers = new Hashtable<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);

        Integer n = numbers.get("two");
        if (n != null) {
            System.out.println("two = " + n);
        }
        else
        {
            System.out.println("Number is not present");
        }
    }
}
