package com.company;

public class MyLinkedList implements NodeList{

    ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null){
            //list is empty
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0){
                //newItem is greater, move right if possible
                if (currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    //no next, so insert end of list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }else if (comparison > 0){
                // newItem is less, insert before
                if (currentItem.previous() != null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }else{
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }else{
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return true;
    }

    @Override
    public void traverse(ListItem item) {

    }
}
