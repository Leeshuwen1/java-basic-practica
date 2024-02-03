package ru.mulyukin.otus.java.basic.practica;

public class Cat {  // описание какой то сущности в данном примере кот
    private String name;  // essense
    private String color;
    private int age;

    public void setName(String name){
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setAge(int age){
        if(age > this.age) {
            this.age = age;
        }
    }

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }


    public Cat(String name, String color, int age){ // constructor for init essense
        this.name = name; //ссылка на текущий объект
        this.color = color;
        this.age = age;
    }


    public void run(){   //actions
        System.out.println(name + " Побежал");
    }
    public void jump(){
        System.out.println(name + " Прыгнул");
    }

    public void info(){
        System.out.println(name + " " + color + " " + " " + age);
    }
}
