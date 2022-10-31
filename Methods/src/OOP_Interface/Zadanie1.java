package OOP_Interface;

public class Zadanie1 {
    public static void main(String[] args) {
        Users u1 = new Users("Aldi","Smith");
        Users u2 = new Users("Aldi","LOl");
        Users u3 = new Users("John","kek");
        Users u4 = new Users("Aldi","qwe");
        Users u5 = new Users("John","Smith");
        Users u6 = new Users("Aldi","Super");
        Users u7 = new Users("John","solo");
        Users u8 = new Users("Aldi","polo");
        Users u9 = new Users("Aldi","olo");
        Users u10 = new Users("Aldi","Smith");
        Users[] u = {u1,u2,u3,u4,u5,u6,u7,u8,u9,u10};
        UserBeanImp uu = new UserBeanImp(u);
        uu.getAllUsers();
        uu.getUsersByName("John");
        uu.getUsersBySurname("Smith");
    }
}
class Users {
    public String name;
    public String surname;

    public Users() {
    }

    public Users(String name, String surname) {
        this.name = name;
        this.surname = surname;
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
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
class UserBeanImp extends Users implements UserBean  {
    Users[] users;

    public UserBeanImp(Users[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for (int i = 0; i < users.length;i++) {
            System.out.println(users[i]);
        }
    }

    @Override
    public void getUsersByName(String name) {
        for (int i = 0;i < users.length;i++) {
            if (name.equalsIgnoreCase(users[i].getName())) {
                System.out.println(users[i]);
            }
        }
    }

    @Override
    public void getUsersBySurname(String surname) {
        for (int i = 0;i < users.length;i++) {
            if (surname.equalsIgnoreCase(users[i].getSurname())) {
                System.out.println(users[i]);
            }
        }
    }
}