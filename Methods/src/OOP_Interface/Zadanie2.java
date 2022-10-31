package OOP_Interface;



public class Zadanie2 {
    public static void main(String[] args) {
        Workers w1 = new Staff(1,"Aldi", "Super",10000);
        Workers w2 = new Staff(2,"Aldi", "Super",20000);
        Workers w3 = new Staff(3,"Aldi", "Super",30000);
        Workers w4 = new Staff(4,"Aldi", "Super",40000);
        Workers w5 = new Staff(5,"Aldi", "Super",50000);
        Workers w6 = new HRManagers(6,"Aldi",21345);
        Workers w7 = new HRManagers(7,"Aldi",54325);
        Workers w8 = new HRManagers(8,"Aldi",65463);
        Workers w9 = new HRManagers(9,"Aldi",51424);
        Workers w10 = new HRManagers(10,"Aldi",11111);
        Workers w11 = new Programmers(11,"Aldi",4324,352,0.7);
        Workers w12 = new Programmers(12,"Aldi",43241,123,1);
        Workers w13 = new Programmers(13,"Aldi",6546,765,0.9);
        Workers w14 = new Programmers(14,"Aldi",96785,645,0.1);
        Workers w15 = new Programmers(15,"Aldi",98567,987,0.5);
        Workers[] workers = {w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12,w13,w14,w15};
        Workers w = workers[0];
        for (int i = 0; i < workers.length;i++) {
            if (workers[i].getSalary() > w.getSalary()) {
                w = workers[i];
            }
        }
        System.out.println(w.getWorkerData());
        for (int i = 0; i < workers.length;i++) {
            for (int j = i + 1;j < workers.length;j++){
                Workers tmp = workers[0];
                if (workers[i].getSalary() < workers[j].getSalary()) {
                    tmp = workers[i];
                    workers[i] = workers[j];
                    workers[j] = tmp;
                }
            }
            System.out.println(workers[i].getWorkerData());
        }
    }
}
interface Workers {
    public String getWorkerData();
    public int getSalary();
}
class Staff implements Workers {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
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

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return getId() + " " + getName() + " " + getSurname() + " " + getSalary();
    }

   // @Override
//    public String toString() {
//        return "Staff{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
}
class HRManagers implements Workers{
    private int id;
    private String fullName;
    private int salary;

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return getId() + " " + getFullName() + " " + getSalary();
    }
}
class Programmers implements Workers{
    private int id;
    private String nickname;
    private int salary;
    private int bonusSalary;
    private double KPIValue;

    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public int getSalary() {
        return (int) (salary + KPIValue*bonusSalary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getKPIValue() {
        return KPIValue;
    }

    public void setKPIValue(double KPIValue) {
        this.KPIValue = KPIValue;
    }

    @Override
    public String getWorkerData() {
        return getId() + " " + getNickname() + " " + getSalary() + " " + getBonusSalary();
    }
}