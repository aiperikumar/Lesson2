package com.company;

public class Dog extends  Pet{
    String name;
    String breed;
    String[] commands;

    public Dog(){}

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
       super.setColor(color);
       super.setShelter(shelter);
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);
    }

    void makeVoice(String voice, int number){}
    void makeVoice( int number){}
    void makeVoice(String voice){}


        @Override
        public String getInfo(){
            return "Собака:  {" +
                    "кличка = " + name +
                    ", парода = "+ breed +
                    ", команды = " + commands
                    + super.getInfo()+
                    " } ";
        }
    }

