package com.company;

public class Main {

    public static void main(String[] args) {
       Dog dog1 = new Dog();
       Dog dog2 = new Dog("Майло","Пидбуль");
       Dog dog3 = new Dog("Рекс","Лабрадор",Color.BLACK, null);


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);




    }
}
