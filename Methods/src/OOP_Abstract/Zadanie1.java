package OOP_Abstract;

public class Zadanie1 {
    public static void main(String[] args) {
    Chocolate c1 = new Chocolate("Snikers",75);
    Chocolate c2 = new Chocolate("Twix",100);
    Burger b1 = new Burger("Burger King",1,1);
    Burger b2 = new Burger("McDonalds",1,2);
    Coke co1 = new Coke("Cola ",1,true);
    Coke co2 = new Coke("Fuse ",2,false);
    Food[] foods = {c1,c2,b1,b2,co1,co2};
    Food maxCal = foods[0];
    for (int i = 0; i < foods.length;i++) {
        foods[i].print();
    }
    for (int i = 0; i < foods.length;i++) {
        if (maxCal.getCalories() < foods[i].getCalories()){
            maxCal = foods[i];
            System.out.println(foods[i].getName() + " is most caloried. It has " + foods[i].getCalories() + " calories");
        }
    }
    }
}
abstract class Food {
    protected String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getCalories();

    public void print() {
        System.out.println(getName() + " have " + getCalories() + " calories");
    }
}
class Chocolate extends Food {
    private int weight;

    public Chocolate(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public double getCalories() {
        return weight * 740;
    }
}
class Burger extends Food {
    private int meatAmount;
    private int meatType;

    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    @Override
    public double getCalories() {
        if (meatType == 1) {
            return meatAmount * 840;
        } else if (meatType == 2) {
            return meatAmount * 560;
        }
        return 0;
    }
}
class Coke extends Food {
    private double volumeLiters;
    private boolean isSparkling;

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    @Override
    public double getCalories() {
        if (isSparkling = true){
            return volumeLiters * 400;
        } else
            return volumeLiters * 100;
    }
}
