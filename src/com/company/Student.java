package com.company;

public class Student {
    private int id;
    private String name;
    private String surname;
    private Adress adress;// Composition object adress


    public Student(int id, String name, String surname, Adress adress){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.adress = adress;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", adress=" + adress +
                '}';
    }
}
