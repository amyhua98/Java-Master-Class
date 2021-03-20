package com.company;

public class SearchTree implements NodeList{
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null){
            //tree is empty
            this.root = newItem;
        }

        //start comparing from head of tree
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0){
                //newItem is greater, move right
                if (currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    //last oen so add at end
                    currentItem.setNext(newItem);
                    return true;
                }
            }else if(comparison > 0){
                //newItem is less, move left
                if (currentItem.previous() != null){
                    currentItem = currentItem.previous();
                }else{
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }else{
                //no duplicates, don't add
                currentItem.setPrevious(newItem);
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null){
            System.out.println("Deleting item" + item.getValue());
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while(currentItem != null){
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0){
                parentItem = currentItem;
                currentItem = currentItem.next();
            }else if (comparison > 0){
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }else{
                //we found the item
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        //remove item from tree
        if (item.next() == null) {
            //no right tree, point to left tree
            if (parent.next() == item) {
                //item is right child of its parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                //item is right child of its parent
                parent.setPrevious(item.previous());
            } else {
                //parent must be item, look at root of tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            //no left tree, point to right tree
            if (parent.next() == item) {
                //item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                //item is right child of its parent
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        } else {
            // has both trees. find smallest value
            ListItem current = item.next();
            ListItem leftMostParent = item;
            while (current.previous() != null) {
                leftMostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if (leftMostParent == item) {
                item.setNext(current.next());
            } else {
                leftMostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem item) {
        if(root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
