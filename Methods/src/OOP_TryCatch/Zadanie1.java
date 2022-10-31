package OOP_TryCatch;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        User[] users = new User[5];
        for (int i = 0; i < users.length; i++) {
            Scanner inn = new Scanner(System.in);
            System.out.println("Insert name:");
            String name = inn.next();
            System.out.println("Insert surname:");
            String surname = inn.next();
            int age;
            try {
                System.out.println("Insert age:");
                age = inn.nextInt();
            }catch (Exception e) {
                age = 0;
            }
            users[i] = new User(name, surname,age);
        }
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getData());
        }
        int sum = 0;
        int sred = 0;
        for (int i = 0; i < users.length; i++) {
            sum+=users[i].getAge();
        }
        sred = sum/5;
        System.out.println(sred);
    }
}
class User {
    protected String name;
    protected String surname;
    protected int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getData() {
        return getName() + " " + getSurname() +  " " + getAge();
    }
}
//public class ageDouble extends Exception {
//
//}

//    Создайте мини программу, в которой я ввожу свои данные через консоль, и заполняю массив пользователей.
//        У меня имеется класс пользователей
//        User.java
//        String name;
//        String surname;
//        int age;
//        А также конструктор для всех параметров.
//        В Main.java я имею массив пользователей, с максимальным размером 5 человек.
//        Моя программа запрашивает пользователя ввести данные этих 5 пользователей через консоль.
//        Используйте цикл, чтобы 5 раз повторить операцию заполнения данных пользователя и создания нового объекта.
//        Можно использовать цикл for, так будет намного легче.
//        Но если, я во время введения возраста, ввожу неверные данные (не целостное число),
//        то программа должна автоматом ввести число 0, в поле возраста и добавить объект в массив.
//        Используйте try-catch, чтобы узнать, ввел ли пользователь возраст правильно или налажал.
//        В конце ввода, программа должна вывести среднее значение возраста в массиве и мы сможем посмотреть,
//        где пользователь ввел неверные данные.