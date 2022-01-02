package com.codechef;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// two ways to create collection:
        /*
        1. Type safe
        2. Untype Safe
         */
   //  1. same type of elements(objects) are added to collection:
    ArrayList <Integer> a1 = new ArrayList<>();
    LinkedList <String> a2 = new LinkedList<>();
    Vector <Float> a3 = new Vector<>();
    // all the above are the examples of type safe creation of collection:

//     2. different types of elements can be added to collection:
        LinkedList list = new LinkedList();
        list.add("ravit");
        list.add(98);
        list.add(78.98);
        System.out.println(list);
        System.out.println(list.size());

        /*

                Set
         */
        HashSet <Double> hash = new HashSet<>();
        // in this we don't use primitive types we use them as an object that means we use wrapper class:
        hash.add(34.98);
        hash.add(67.89);
        hash.add(76.54);
        /*
        -- it is unindexed and order is not preserved:
        -- duplicate elements are not allowed
         */
        System.out.println(hash);



        /* Treeset
        --
         */
        TreeSet <Double> tree = new TreeSet<>();
        tree.addAll(hash);
        //
        System.out.println(tree);

        ListIterator list1 = list.listIterator(list.size());
        while(list1.hasPrevious()){
            System.out.println(list1.previous());

        }

    }
}
