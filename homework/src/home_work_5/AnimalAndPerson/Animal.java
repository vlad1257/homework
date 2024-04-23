package home_work_5.AnimalAndPerson;

//1.2. Написать класс Animal:
//		1.2.1. Число age - возраст (от 1 до 15 лет)
//		1.2.2. Строка nick - кличка

public class Animal {
    int age;
    String nick;

    public Animal(String nick,int age){
        this.age = age;
        this.nick = nick;
    }

    public int getAge(){
        return age;
    }
}
