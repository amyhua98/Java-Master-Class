package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<String>();
//        addInOrder(placesToVisit, "New York");
//        addInOrder(placesToVisit, "Los Angeles");
//        addInOrder(placesToVisit, "Miami");
//        addInOrder(placesToVisit, "Las Vegas");
//        addInOrder(placesToVisit, "Portland");
//        addInOrder(placesToVisit, "New Orleans");
//        addInOrder(placesToVisit, "Seattle");
//        printList(placesToVisit);
//
//        addInOrder(placesToVisit, "Detroit");


    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                System.out.println(newCity + " is already included as a destination.");
                return false;
            }else if(comparison > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
            }else if(comparison < 0){
                break;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

}
