package OOP_Nasledovanie;

import java.util.Arrays;

public class Zadanie3 {
    public static void main(String[] args) {
        Footballer f1 = new Footballer("Ronaldo", 35, "Portugal", "Mid", "MU");
        Footballer f2 = new Footballer("Messi", 35, "Argent", "Mid", "PSG");
        Footballer f3 = new Footballer("NEymar", 35, "Brasil", "Mid", "PSG");
        Gymnast g1 = new Gymnast("Anton" , 20, "Russia", 180,60,"Crossfit");
        Gymnast g2 = new Gymnast("Sasha" , 21, "Russia", 190,75,"Crossfit");
        Gymnast g3 = new Gymnast("Misha" , 22, "Russia", 170,85,"Crossfit");
        Swimmer s1 = new Swimmer("Serik" , 19, "Kaz","free", 1.43);
        Swimmer s2 = new Swimmer("Berik" , 23, "Kaz","free", 1.55);
        Swimmer s3 = new Swimmer("Merik" , 32, "Kaz","free", 1.27);
        Sportsman sportsmansList[] = {f1,f2,f3,g1,g2,g3,s1,s2,s3};
        OlympicGames TI22 = new OlympicGames("China", 2022 ,sportsmansList);
        TI22.play();
    }
}

class Sportsman {
    protected String fullName;
    protected int age;
    protected String country;

    public Sportsman() {

    }
    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public void play() {
        System.out.println("Name: " + fullName + " Age:" + age + " Country:" + country + "is playing");
    }

}

class Gymnast extends Sportsman {
    protected int height;
    protected int weight;
    protected String style;

    public Gymnast() {

    }
    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    public void play() {
        System.out.println("Name: " + fullName + " Age:" + age + " Country:" + country + " Height:" + height + " Weight:" + weight + " Style:" + style + " is playing");
    }

}

class Footballer extends Sportsman {
    protected String position;
    protected String club;

    public Footballer() {

    }

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }
    public void play() {
        System.out.println("Name: " + fullName + " Age:" + age + " Country:" + country + " Position:" + position + " Club:" + club + "is playing");
    }

}
class Swimmer extends Sportsman{
    protected String style;
    protected double recordTime;

    public Swimmer() {

    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }
    public void play() {
        System.out.println("Name: " + fullName + " Age:" + age + " Country:" + country + " Style:" + style + " RecordTime:" + recordTime + "is playing");
    }

}

class OlympicGames{
    protected String city;
    protected int year;
    Sportsman[] sportsmansList;
    public OlympicGames() {

    }
    public OlympicGames(String city, int year, Sportsman[] sportsmansList) {
        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmansList;
    }
    public void play() {
        System.out.println("City:" + city + " Year:" + year);
        for (int i = 0; i < sportsmansList.length; i++) {
            sportsmansList[i].play();
        }
    }
    public String toString() {
        return city + " " + year + " " + sportsmansList;
    }
}
