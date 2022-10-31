package OOP_Nasledovanie;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] userss = new User[100];
        int i = 0;
        while(true) {
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            int select = in.nextInt();
            if (select == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD STAFF ");
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
                    System.out.println("Insert GPA:");
                    double gpa = in.nextDouble();
                    userss[i] = new Student(login,password,name,surname,gpa);
                    //userss[i].getData();
                    i++;
                }
                if (select1 == 2) {
                    System.out.println("Insert Login:");
                    String login = in.next();
                    System.out.println("Insert Password:");
                    String password = in.next();
                    System.out.println("Insert Name:");
                    String name = in.next();
                    System.out.println("Insert Surname:");
                    String surname = in.next();
                    double salary = in.nextInt();
                    userss[i] = new Staff(login, password, name, surname, salary);
                    i++;
                }
            }
            if (select == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST STAFF");
                int select1 = in.nextInt();
                if (select1 == 1) {
                    for (int j = 0; j < i; j++) {
                        if (userss[j] instanceof Student) {
                            userss[j].getData();
                        }
                    }
                } else if (select1 == 2) {
                    for (int j = 0;j < i; j++ ) {
                        if (userss[i] instanceof Staff) {
                            userss[j].getData();
                        }
                    }
                }
            }
            else  if (select == 0) {
                break;
            }
        }
//        User u1 = new User(001,"admin", "root","Tolik","lol");
//        User u2 = new User(002,"admin", "root","Tolik","lol");
//        User u3 = new User(003,"admin", "root","Tolik","lol");
//        User u4 = new User(004,"admin", "root","Tolik","lol");
//        User u5 = new User(005,"admin", "root","Tolik","lol");
//        Staff s1 = new Staff(006, "staff","qwert","Sanya", "qwe",10000);
//        Staff s2 = new Staff(007, "staff","qwert","Sanya", "qwe",1000);
//        Staff s3 = new Staff(012, "staff","qwert","Sanya", "qwe",10000);
//        Staff s4 = new Staff(011, "staff","qwert","Sanya", "qwe",10000);
//        Staff s5 = new Staff(010, "staff","qwert","Sanya", "qwe",10000);
//        Student stu1 = new Student(014, "student","shkola","Masha","Sasha",2.2,0);
//        Student stu2 = new Student(015, "student","shkola","Masha","Sasha",3,2);
//        Student stu3 = new Student(016, "student","shkola","Masha","Sasha",4.2,2);
//        Student stu4 = new Student(017, "student","shkola","Masha","Sasha",2.2,2);
//        Student stu5 = new Student(012, "student","shkola","Masha","Sasha",2.2,2);
//        User[] users = {u1,u2,u3,u4,u5,s1,s2,s3,s4,s5,stu1,stu2,stu3,stu4,stu5};
//        s1.addSubject("Matematika");
//        s1.addSubject("Matematika11");
//        s2.addSubject("Matematika");
//        s3.addSubject("Matematika");
//        s4.addSubject("Matematika");
//        s5.addSubject("Matematika");
//        stu1.addCourse("java");
//        stu2.addCourse("java");
//        stu3.addCourse("java");
//        stu4.addCourse("java");
//        stu5.addCourse("java");
//        for (int i = 0; i < users.length; i++) {
//            users[i].getData();
//        }
    }
}
class User {
    //protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    public User() {
    }
    public User(String login, String password, String name, String surname) {
        //this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

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
    public void getData() {
        System.out.println(getLogin() + " " + getPassword() + " " + getName() + " " + getSurname());

    }
}
class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
    }

    public Staff(String login, String password, String name, String surname, double salary) {
        super(login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }

    public void getData() {
        System.out.println(getLogin() + " " + getPassword() + " " + getName() + " " + getSurname() + " " + getSalary() );
//        for (int i = 0; i < indexOfSubject; i++) {
//            System.out.println(subjects[i]);
//        }
    }
    public void addSubject(String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }
}
class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student() {
    }
    public Student(String login, String password, String name, String surname, double gpa) {
        super(login, password, name, surname);
        this.gpa = gpa;

    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }
    public void getData() {
        System.out.println(getLogin() + " " + getPassword() + " " + getName() + " " + getSurname() + " " + getGpa());
//        for (int i = 0; i < indexOfCourses; i++) {
//            System.out.println(courses[i]);
//        }
    }
    public void addCourse(String course) {
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }
}

