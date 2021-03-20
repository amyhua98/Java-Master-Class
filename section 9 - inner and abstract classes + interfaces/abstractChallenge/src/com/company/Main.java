package com.company;

public class Main {

    public static void main(String[] args) {
	    MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
	    String stringData = "8 6 7 5 2 1 3 4 9 ";

	    String[] data = stringData.split(" ");
	    for (String s : data){
            list.addItem(new Node(s));
        }

	    list.traverse(list.getRoot());
    }
}
