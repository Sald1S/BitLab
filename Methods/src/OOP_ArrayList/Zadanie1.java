package OOP_ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class Zadanie1 {
    public static void main(String[] args) {
        Players p1 = new Players("Aldi", 233,13);
        Players p2 = new Players("Aldi", 212,13);
        Players p3 = new Players("Aldi", 421,13);
        Players p4 = new Players("Aldi", 983,13);
        Players p5 = new Players("Aldi", 6321,13);
        Players p6 = new Players("Aldi", 999,13);
        Players p7 = new Players("Aldi", 721,13);
        Players p8 = new Players("Aldi", 1234,13);
        Players p9 = new Players("Aldi", 8273,13);
        Players p10 = new Players("Aldi", 2264,13);
        ArrayList<Players> playersArrayList = new ArrayList();
        playersArrayList.add(p1);
        playersArrayList.add(p2);
        playersArrayList.add(p3);
        playersArrayList.add(p4);
        playersArrayList.add(p5);
        playersArrayList.add(p6);
        playersArrayList.add(p7);
        playersArrayList.add(p8);
        playersArrayList.add(p9);
        playersArrayList.add(p10);
        int sumAge = 0;
        int sumPrice = 0;
        int average = 0;
        for (int i = 0;i < playersArrayList.size();i++) {
            sumAge+=playersArrayList.get(i).getAge();
            sumPrice+=playersArrayList.get(i).getPrice();
            average=sumPrice/playersArrayList.size();
        }
        System.out.println("Sum of age: " + sumAge + "\n" + "Average price:" + average);
    }
}
class Players{
    protected String name;
    protected double price;
    protected int age;

    public Players(String name, double price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}