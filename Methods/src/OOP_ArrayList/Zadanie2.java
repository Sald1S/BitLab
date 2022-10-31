package OOP_ArrayList;

import java.util.ArrayList;

public class Zadanie2 {
    public static void main(String[] args) {
        BankApplication b1 = new BankApplication("Kaspi");
        BankApplication b2 = new BankApplication("Sber");
        BankApplication b3 = new BankApplication("Halk");
        Account a1 = new Account(1,"Aldi","super",10000);
        Account a2 = new Account(2,"Aldi","super",20000);
        Account a3 = new Account(3,"Aldi","super",30000);
        Account a4 = new Account(4,"Aldi","super",40000);
        Account a5 = new Account(5,"Aldi","super",50000);
        Account a6 = new Account(6,"Aldi","super",60000);
        Account a7 = new Account(7,"Aldi","super",70000);
        Account a8 = new Account(8,"Aldi","super",80000);
        Account a9 = new Account(9,"Aldi","super",90000);
        Account a10 = new Account(10,"Aldi","super",110000);
        b1.addAccount(a1);
        b1.addAccount(a2);
        b1.addAccount(a3);
        b1.addAccount(a4);
        b1.addAccount(a5);
        b1.addAccount(a6);
        b1.addAccount(a7);
        b1.addAccount(a8);
        b1.addAccount(a9);
        b1.addAccount(a10);
        Account a11 = new Account(1,"Aldi","super",10000312);
        Account a12 = new Account(1,"Aldi","super",10000);
        Account a13 = new Account(1,"Aldi","super",10003120);
        Account a14 = new Account(1,"Aldi","super",10031200);
        Account a15 = new Account(1,"Aldi","super",10031200);
        Account a16 = new Account(1,"Aldi","super",10000);
        Account a17 = new Account(1,"Aldi","super",10032100);
        Account a18 = new Account(1,"Aldi","super",10312000);
        Account a19 = new Account(1,"Aldi","super",10000);
        Account a20 = new Account(1,"Aldi","super",10321000);
        b2.addAccount(a11);
        b2.addAccount(a12);
        b2.addAccount(a13);
        b2.addAccount(a14);
        b2.addAccount(a15);
        b2.addAccount(a16);
        b2.addAccount(a17);
        b2.addAccount(a18);
        b2.addAccount(a19);
        b2.addAccount(a20);
        Account a21 = new Account(1,"Aldi","super",10000);
        Account a22 = new Account(1,"Aldi","super",10000);
        Account a23 = new Account(1,"Aldi","super",1220000);
        Account a24 = new Account(1,"Aldi","super",10000);
        Account a25 = new Account(1,"Aldi","super",10000);
        Account a26 = new Account(1,"Aldi","super",1022000);
        Account a27 = new Account(1,"Aldi","super",10000);
        Account a28 = new Account(1,"Aldi","super",10000);
        Account a29 = new Account(1,"Aldi","super",10000);
        Account a30 = new Account(1,"Aldi","super",10000);
        b3.addAccount(a21);
        b3.addAccount(a22);
        b3.addAccount(a23);
        b3.addAccount(a24);
        b3.addAccount(a25);
        b3.addAccount(a26);
        b3.addAccount(a27);
        b3.addAccount(a28);
        b3.addAccount(a29);
        b3.addAccount(a30);
        ArrayList<BankApplication> allbanks = new ArrayList<>();
        allbanks.add(b1);
        allbanks.add(b2);
        allbanks.add(b3);
        for (int i = 0; i < allbanks.size();i++){
            for (int j = i + 1; j < allbanks.size();j++) {
                BankApplication temp;
                if (allbanks.get(i).getAverageBalance() < allbanks.get(j).getAverageBalance()) {
                    temp = allbanks.get(i);
                    allbanks.set(i, allbanks.get(j));
                    allbanks.set(j, temp);
                }
            }
            System.out.println(allbanks.get(i).getBankData());
        }
    }
}
class Account{
    protected int id;
    protected String name;
    protected String surname;
    protected double balance;

    public Account(int id, String name, String surname, double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                '}';
    }
}
class BankApplication {
    protected String name;
    protected ArrayList<Account> accounts = new ArrayList();

    public BankApplication(String name) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(Account a){
        accounts.add(a);
    }
    public void removeAccount(int i){
        accounts.remove(i);
    }
    public Account getMaxAccount() {
        Account maxAccount = accounts.get(0);
        for (int i = 0; i < accounts.size();i++) {
            if (maxAccount.getBalance() < accounts.get(i).getBalance()){
                maxAccount = accounts.get(i);
            }
        }
        return maxAccount;
    }
    public double getAverageBalance(){
        double sum = 0;
        for (int i = 0; i < accounts.size();i++) {
            sum+=accounts.get(i).getBalance();
        }
        return sum/ accounts.size();
    }
    public double getTotalBalance() {
        double sum = 0;
        for (int i = 0; i < accounts.size();i++) {
            sum+=accounts.get(i).getBalance();
        }
        return sum;
    }
    public int totalAccounts(){
        return accounts.size();
    }
    public String getBankData(){
        return "Name: " + getName() + " Total Accounts: " + totalAccounts() + " Total Balance: " + getTotalBalance() + " Average Balance: " + getAverageBalance();
    }
}