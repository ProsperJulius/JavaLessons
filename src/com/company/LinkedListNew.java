package com.company;

import java.util.Iterator;

    public class LinkedListNew<Nozie> implements Iterable<Nozie> {
        public Node head;
        public Node tail;

        public LinkedListNew (){
            head = null;
            tail = null;

        }
        public LinkedListNew (Nozie val){
            head = new Node(val);
            tail = head;
        }
        public void add(Nozie val){
            if(head == null){
                head = new Node(val);
                tail = head;
            }else{
                tail.next = new Node(val);
                tail.next.prev = tail;
                tail= tail.next;
            }
        }
        public void printValues(){
            Node temp = tail;
            while(temp!=null){
                System.out.println(temp.val);
                temp = temp.prev;

            }    }

        @Override
        public Iterator<Nozie> iterator() {
            return null;
        }
    }

