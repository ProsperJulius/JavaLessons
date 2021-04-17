package com.company;

public class Node<N>{
    public N val;
    public Node next;
    public Node prev;

    public Node(N val){
        this.val=val;
        next = null;
        prev = null;
    }
}


