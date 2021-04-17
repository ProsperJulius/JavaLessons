package com.company;

public class Main {
    

    public static void main(String[] args) {
      LinkedList<Integer> print = new LinkedList(5);
      print.add(22);
      print.add(20);
        print.add(299);
        print.add(80);
        print.printValues();
        System.out.println("----------------------------------------------------" + "");
        LinkedList<String> stringLinkedList= new LinkedList<>();
        stringLinkedList.add("nozie tha");
        stringLinkedList.add("prosper");
        stringLinkedList.printValues();

      LinkedListNew<Integer> printv = new LinkedListNew(5);
      printv.add(22);
      printv.add(20);
      printv.add(299);
      printv.add(80);
      printv.printValues();

    }


}