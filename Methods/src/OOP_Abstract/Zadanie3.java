package OOP_Abstract;

public class Zadanie3 {
    public static void main(String[] args) {
        FerrariEngine f1 = new FerrariEngine(5.5,12,150);
        FerrariEngine f2 = new FerrariEngine(6,10,120);
        FerrariEngine f3 = new FerrariEngine(5.2,8,140);
        FerrariEngine f4 = new FerrariEngine(5.8,10,130);
        FerrariEngine f5 = new FerrariEngine(4.2,8,100);
        RenaultEnigine r1 = new RenaultEnigine(2.2,6,100,1.2);
        RenaultEnigine r2 = new RenaultEnigine(2.2,6,100,1.2);
        RenaultEnigine r3 = new RenaultEnigine(2.2,6,100,1.2);
        RenaultEnigine r4 = new RenaultEnigine(2.2,6,100,1.2);
        RenaultEnigine r5 = new RenaultEnigine(2.2,6,100,1.2);
        Engine[] engines = {f1,f2,f3,f4,f5,r1,r2,r3,r4,r5};
        for (int i = 0; i < engines.length;i++) {
            System.out.println(engines[i].getMaxSpeed());
        }
    }
}
abstract class Engine{
    protected double engineVolume;
    protected int cylinderAmount;
    protected double engineWeight;

    public Engine() {
    }

    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }
    public abstract double efficiency();
    public abstract double throttleEnergy();
    public abstract double breakEnergy();

    public double getMaxSpeed() {
        return (throttleEnergy()-breakEnergy())*efficiency();
    }
    public void printMaxSpped() {
        System.out.println(getMaxSpeed() + "KmH");
    }
}
class FerrariEngine extends Engine {
    public FerrariEngine() {
    }

    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    @Override
    public double efficiency() {
        return 0.25;
    }

    @Override
    public double throttleEnergy() {
        return engineVolume*cylinderAmount*100;
    }

    @Override
    public double breakEnergy() {
        return engineWeight*2;
    }
}
class RenaultEnigine extends Engine {
    private double extraTurboEnergy;

    public RenaultEnigine() {
    }

    public RenaultEnigine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    public double efficiency() {
        return 0.27;
    }

    @Override
    public double throttleEnergy() {
        return engineVolume*cylinderAmount*110 + extraTurboEnergy;
    }
    @Override
    public double breakEnergy() {
        return engineWeight*2.1;
    }
}