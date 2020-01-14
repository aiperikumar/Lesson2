package com.company;

import java.util.Random;

public class Pet {
    int age = generateDefaultAge();
    Shelter shelter;
    Color color;

    private int generateDefaultAge(){
        Random r = new Random();
        int i = r.nextInt(20);
        return i;
    }
    public String getInfo(){
        return "Питомец: {" +
                "возраст = " + age +
                ", цвет = "+ color +
                ", приют = " + shelter.getName() + shelter.getAddress()
                + " } ";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
