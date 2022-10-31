package ООП_Классы_и_объекты;

public class Zadanie6 {
    public static void main(String[] args) {
        Player[] team1 = new Player[5];
        team1[0] = new Player( "Aldi" , "lol", 12, "mid");
        team1[1] = new Player( "kek" , "lol", 21, "easy");
        team1[2] = new Player( "qwe" , "lol", 3213, "support");
        team1[3] = new Player( "Aewq" , "lol", 10, "hard");
        team1[4] = new Player( "Asd" , "lol", 100, "semi" + "\n");
        Player[] team2 = new Player[5];
        team2[0] = new Player( "qqq" , "aaa", 77, "mid");
        team2[1] = new Player( "www" , "sss", 166, "easy");
        team2[2] = new Player( "eee" , "ddd", 155, "hard");
        team2[3] = new Player( "rrr" , "fff", 144, "support");
        team2[4] = new Player( "ttt" , "ggg", 133, "semi" + "\n");

        Club club1 = new Club("real","Spain", 99,team1);
        Club club2 = new Club("barsa","German", 100,team2);
        Club[] clubs = {club1, club2};
        for (int i = 0; i < clubs.length; i++) {
            clubs[i].printClubData();
        }
    }
}
class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player() {
        this.number = 0;
        this.name = "No name";
        this.surname = "No name";
        this.position = "Unkhown";
    }
    public Player(String name, String surname, int number, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }
    public String toString() {
        return number + " " + name + " " + surname + " " + position;
    }
}
class Club {
    String name;
    String country;
    int ratingPoints;
    Player []players;

    public Club() {
        this.name = "no name";
        this.country = "no name";
        this.ratingPoints = 0;
        this.players = new Player[]{};
    }
    public Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }
    public void printClubData() {
        System.out.println(name + " " + country + " " + ratingPoints);
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }
    public String toString() {
       // printClubData();
        return name + "  " + " " + country + "  " + " " + ratingPoints + " " +players;

    }
}
