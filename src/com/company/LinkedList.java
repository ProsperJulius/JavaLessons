package com.company;

import java.util.Iterator;

public class LinkedList<Nozie> implements Iterable<Nozie> {
    public ListNode head;
    public ListNode tail;

    public LinkedList(){
        head = null;
        tail = null;

    }
    public LinkedList(Nozie val){
        head = new ListNode(val);
        tail = head;
    }
    public void add(Nozie val){
        if(head == null){
            head = new ListNode(val);
            tail = head;
        }else{
            tail.next = new ListNode(val);
            tail = tail.next;
        }
    }
    public void printValues(){
       ListNode temp = head;
       while(temp!=null){
           System.out.println(temp.val);
           temp = temp.next;

        }    }

    @Override
    public Iterator<Nozie> iterator() {
        return null;
    }
}