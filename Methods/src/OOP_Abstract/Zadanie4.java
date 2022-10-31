package OOP_Abstract;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        ERPSystem e1 = new ERPSystem();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO LIST USER BY INDEX");
            System.out.println("PRESS [0] TO EXIT");
            int select = in.nextInt();
            if (select == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD TEACHER");
                int select1 = in.nextInt();
                if (select1 == 1) {
                    System.out.println("Insert Login:");
                    String login = in.next();
                    System.out.println("Insert Password:");
                    String password = in.next();
                    System.out.println("Insert Name:");
                    String name = in.next();
                    System.out.println("Insert Surname:");
                    String surname = in.next();
                    System.out.println("Insert Group:");
                    String group = in.next();
                    System.out.println("Insert GPA:");
                    double gpa = in.nextDouble();
                    User first = new Student(login,password,name,surname,group,gpa);
                    e1.addUser(first);
                }
                if (select1 == 2) {
                    System.out.println("Insert Login:");
                    String login = in.next();
                    System.out.println("Insert Password:");
                    String password = in.next();
                    System.out.println("Insert NickName:");
                    String nickName = in.next();
                    System.out.println("Insert Statui7s:");
                    String status = in.next();
                    Teacher first = new Teacher(login, password, nickName, status);

                    while (true) {
                        System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                        System.out.println("PRESS [1] TO ADD SUBJECT");
                        int select2 = in.nextInt();
                        if (select2 == 0) {
                            break;
                        }
                        if (select2 == 1){
                            System.out.println("Subject:");
                            String subject = in.next();
                            first.addSubject(subject);
                        }
                    }

                    e1.addUser(first);
                }
            }
            if (select == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST TEACHERS");
                int select1 = in.nextInt();
                if (select1 == 1){
                    e1.printByClass(select1);
                }
                if (select1 == 2) {
                    e1.printByClass(select1);
                }
            }
            if (select == 3) {
                System.out.println("ENTER INDEX: ");
                int index = in.nextInt();
                e1.printUser(index);
            }
            if (select == 0) {
                break;
            }
        }
    }
}
abstract class User {
    protected int id;
    protected String login;
    protected String password;

    public User( String login, String password) {

        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract String getUserData();
}
class Student extends User {
    private String name;
    private String surname;
    private String group;
    private double gpa;

    public Student(String login, String password, String name, String surname, String group, double gpa) {
        super(login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getUserData() {
        return getId() + " " + getLogin() + " " + getPassword() + "  " + getName() + " " + getSurname() + " " + getGroup() + " " + getGpa();
    }
}
class Teacher extends User {
    private String nickName;
    private String status;
    private String subjects[] = new String[10];
    private int sizeOfSubjects = 0;

    public Teacher(String login, String password, String nickName, String status) {
        super(login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }
    public void addSubject(String subject){
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }

    @Override
    public String getUserData() {
        return getId() + " " + getLogin() + " " + getPassword() + " " + getNickName() + " " + getStatus() + " " + getSubjects() + " " + getSizeOfSubjects();
    }
}
class  ERPSystem {
    private User []memory = new User[1000];
    private int sizeOfUsers = 0;
    public void addUser(User u){
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }
    public void printByClass(int x){
        if (x == 1)
            for (int i = 0; i < sizeOfUsers;i++) {
                if (memory[i] instanceof Student)
                    System.out.println(memory[i].getUserData());
            }
        else if(x == 2) {
            for (int i = 0; i < sizeOfUsers;i++) {
                if (memory[i] instanceof Teacher)
                    System.out.println(memory[i].getUserData());
            }
        }

    }
    public void printAllUsers(){
        for (int i = 0; i < sizeOfUsers;i++) {
            System.out.println(memory[i].getUserData());
        }
    }
    public void printUser(int index) {
        if (sizeOfUsers > index - 1) {
            System.out.println(memory[index].getUserData());
        } else System.out.println("No such user in this index");
    }
}