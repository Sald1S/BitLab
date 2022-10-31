package ООП_Классы_и_объекты;

public class Zadanie3_4 {
    //public static void main(String[] args) {
//        Student[] Students = new Student[10];
//        //Student st1 = new Student(name, surname, gpa);
//        Students[0] = new Student(1101, "Aldiyar", "Kenjakyn", 4.0);
//        Students[1] = new Student(1102, "Aldiyar", "Kenjakyn", 3.0);
//        Students[2] = new Student(1103, "Aldiyar", "Kenjakyn", 2.5);
//        Students[3] = new Student(1104, "Aldiyar", "Kenjakyn", 3.5);
//        Students[4] = new Student(1105, "Aldiyar", "Kenjakyn", 2.1);
//        Students[5] = new Student(1105, "Aldiyar", "Kenjakyn", 3.2);
//        Students[6] = new Student(1105, "Aldiyar", "Kenjakyn", 2.3);
//        Students[7] = new Student(1105, "Aldiyar", "Kenjakyn", 2.5);
//        Students[8] = new Student(1105, "Aldiyar", "Kenjakyn", 2.7);
//        Students[9] = new Student(1105, "Aldiyar", "Kenjakyn", 2.9);
//        //System.out.println(st1.getStudentData());
//       // for (int i = 0; i < Students.length; i++) {
//        //    System.out.println(Students[i].getStudentData());
//        //}
//        System.out.println(topStudent(Students));
//    }

//    static Student topStudent(Student[] Students) {
//        Student s = Students[0];
//        for (int i = 0; i < Students.length; i++) {
//            if (Students[i].gpa > s.gpa) {
//                s = Students[i];
//            }
//        }
//        return s;
//    }
//}

    static class Student {
        String name;
        String surname;
        double gpa;


        public Student() {
            this.name = "No name";
            this.surname = "No name";
            this.gpa = 0.0;
        }

        public Student(String name, String surname, double gpa) {
            this.name = name;
            this.surname = surname;
            this.gpa = gpa;
        }

//        public String getStudentData() {
//            return "Name:" + name + ", Surname" + surname + ", GPA:" + gpa;
//        }

        public String toString() {
            return name + " " + surname + " " + gpa;
        }
    }
}