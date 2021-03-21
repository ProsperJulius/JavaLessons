package com.company;

public class Main {
    

    public static void main(String[] args) {
        Adress myadress = new Adress("Bluez","Zim",70656);
	Student noe = new Student(6784,"nozie","nonoza",myadress);
        System.out.println(noe);
    }
}