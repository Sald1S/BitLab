package ООП_Классы_и_объекты;

public class Zadanie1 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone("Iphone", "13 pro max", 1200);
        System.out.println(p1.getData());
        System.out.println(p2.getData());
    }
}
class Phone {
        String name;
        String model;
        int price;

        public Phone() {
            this.name = "Unknown";
            this.model = "Unknown";
            this.price = 0;
        }

        public Phone(String name, String model, int price) {
            this.name = name;
            this.model = model;
            this.price = price;
        }

        public String getData() {
            return "Phone name:" + name + ", Phone model:" + model + ", Price:" + price;
        }
}

