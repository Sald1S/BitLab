package ООП_Классы_и_объекты;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
         Student1[] Students = new Student1[100];
         int i = 0;
         Scanner in = new Scanner(System.in);
         while (true) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO LIST STUDENT");
                System.out.println("PRESS [0] TO EXIT");
                int select = in.nextInt();
                if (select == 1) {
                        Students = add(Students,i);
                        i++;
                }
                if (select == 2) {
                    for (int j = 0;j < i;j++ ) {
                        System.out.println(Students[j]);
                    }
                }
                if (select == 0) {
                    break;
                }
            }
    }
    public static Student1[] add(Student1[] Students, int i) {
        Scanner in = new Scanner(System.in);
        String name;
        String surname;
        double gpa;
        System.out.println("Insert name?");
        name = in.next();
        System.out.println("Insert surname?");
        surname = in.next();
        System.out.println("Insert GPA?");
        gpa = in.nextInt();
        //int i = 0;
        Students[i] = new Student1(name , surname, gpa);

        return Students;
    }
}
class Student1 {
    String name;
    String surname;
    double gpa;
    public Student1() {
        this.name = "No name";
        this.surname = "No name";
        this.gpa = 0.0;
    }
    public Student1 (String name, String surname, double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    public String getStudentData() {
        return "Name:" + name + ", Surname" + surname + ", GPA:" + gpa;
    }
    public String toString() {
        return name + " " + surname + " " + gpa;
    }
}

