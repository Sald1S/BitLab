package ООП_Классы_и_объекты;

public class Zadanie2 {
    public static void main(String[] args) {
        Phone1 p1 = new Phone1("Iphone", "10 pro max", 800);
        Phone1 p2 = new Phone1("Iphone", "11 pro max", 900);
        Phone1 p3 = new Phone1("Iphone", "12 pro max", 1000);
        Phone1 p4 = new Phone1("Iphone", "13 pro max", 1100);
        Phone1 p5 = new Phone1("Iphone", "14 pro max", 1200);
        System.out.println(p1.getData());
        System.out.println(p2.getData());
        System.out.println(p3.getData());
        System.out.println(p4.getData());
        System.out.println(p5.getData());
    }
}
class Phone1{
    String name;
    String model;
    int price;

    public Phone1(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getData() {
        return "Phone name:" + name + ", Phone model:" + model + ", Price:" + price;
    }
}

