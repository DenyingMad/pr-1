package com.mirea;

public class Dog {
    private String name;
    private int age;
    {
        name = "Dog";
        age = 0;
    }

    public Dog(String name){
        this.name = name;
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void bark(){
        System.out.println("Bark!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void intoHumanAges(){
        System.out.println(name + "'s age in human years is: " + (age * 7) + " years");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" + "Age: " + this.age;
    }
}
