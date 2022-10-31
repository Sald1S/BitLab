package OOP_Abstract;

public class Zadanie2 {
    public static void main(String[] args) {
        CubeGold c1 = new CubeGold("cube",5);
        CubeGold c2 = new CubeGold("cube",10);
        CubeGold c3 = new CubeGold("cube",15);
        SphereGold s1 = new SphereGold("Sphera",6);
        SphereGold s2 = new SphereGold("Sphera",12);
        SphereGold s3 = new SphereGold("Sphera",18);
        GoldShape[] figures = {c1,c2,c3,s1,s2,s3};
        for (int i = 0; i < figures.length; i++) {
            figures[i].print();
        }

    }
}
abstract class GoldShape {
    protected String name;

    public GoldShape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getVolume();

    public double getPrice() {
        return getVolume()*250*1200;
    }
    public void print() {
        System.out.println(getName() + " cost " + getPrice() + " tenge");
    }
}
class SphereGold extends GoldShape {
    private double radius;

    public SphereGold(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4/3)*3.14*getRadius()*getRadius()*getRadius();
    }
}
class CubeGold extends GoldShape {
    private double side;

    public CubeGold(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return getSide()*getSide()*getSide();
    }

}
