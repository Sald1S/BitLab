package ООП_Инкапсуляция;

public class Zadanie1 {
    //public static void main(String[] args) {
//        Phone p1 = new Phone();
//        Phone p2 = new Phone("aldo","aka",200,63);
//        p1.setName("Iphine");
//        p1.setModel("15");
//        p1.setPrice(999);
//        p1.setMemory(64);
//        System.out.println(p1.getName() + " " + p1.getModel() + " " + p1.getMemory()+"gb" + " " + p1.getPrice()+"tenge" + " " + p1.getCategory());
//        System.out.println(p2.getName() + " " + p2.getModel() + " " + p2.getMemory()+"gb" + " " + p2.getPrice()+"tenge" + " " + p2.getCategory());
   // }
    public static void main(String[] args) {
        Phone[] phones = new Phone[10];
        phones[0] = new Phone("aldi","aldi",1200,65);
        phones[1] = new Phone("aldi","aldi",111,65);
        phones[2] = new Phone("aldi","aldi",999,65);
        phones[3] = new Phone("aldi","aldi",322,65);
        phones[4] = new Phone("aldi","aldi",228,65);
        phones[5] = new Phone("aldi","aldi",888,65);
        phones[6] = new Phone("aldi","aldi",1000,65);
        phones[7] = new Phone("aldi","aldi",982,65);
        phones[8] = new Phone("aldi","aldi",111,65);
        phones[9] = new Phone("aldi","aldi",300,65);
        Phone p = phones[0];
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getCategory().equalsIgnoreCase("TOP") || phones[i].getCategory().equalsIgnoreCase("SIMPLE")) {
                System.out.println(phones[i].getName() + " " + phones[i].getModel() + " " + phones[i].getMemory() + "gb" + " " + phones[i].getCategory());
            }
        }
    }
}