/*
 * *** Juan Donoso / 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

    /**
     * Method different()
     *
     * Given two TreeSets of integers, return a TreeSet containing all elements
     * that are NOT in both sets. In other words, return a TreeSet of all the
     * elements that are in one set but not the other.
     */

    public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

        //  elements in A or B but not both
        Set<Integer> result = new TreeSet<>();
        if (setA != null) result.addAll(setA);
        if (setB != null) result.addAll(setB);
        Set<Integer> intersection = new TreeSet<>();
        if (setA != null) intersection.addAll(setA);
        if (setB != null) intersection.retainAll(setB);
        result.removeAll(intersection);
        return result;
    }


    /**
     * Method removeEven()
     *
     * Given a treeMap with the key as an integer, and the value as a String,
     * remove all <key, value> pairs where the key is even.
     */

    public static void removeEven(Map<Integer, String> treeMap) {
        if (treeMap == null) return;
        Iterator<Map.Entry<Integer, String>> it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> e = it.next();
            if (e.getKey() % 2 == 0) {
                it.remove();
            }
        }
        return;
    }


    /**
     * Method treesEqual()
     *
     * Given two treeMaps, each with the key as an integer, and the value as a String,
     * return a boolean value indicating if the two trees are equal or not.
     */

    public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

        // Two maps are equal if they have the same key-value mappings
        if (tree1 == null && tree2 == null) return true;
        if (tree1 == null || tree2 == null) return false;
        return tree1.equals(tree2);

    }

} // end treeProblems class
