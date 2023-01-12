package org.example;

//Зробити клас Person додавши поля:
//firstName, LastName, age, gender, address
//Додати конструктор для
//fname,lname, age
//fname gender
//all fields
//default constructor
//Створити 5 різних обєктів

public class Main {
    public static void main(String[] args) {
        Person[] Person = {new Person("Britney", "Spears", 41),
        new Person("John", "Daly", 36),
        new Person("Anna", "female"),
        new Person("Henry", "Wong",35, "male","1201 Sunset str."),
        new Person("Tom", "male")};

    }
}