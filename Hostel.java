import java.util.*;

class Hostel {
    static ArrayList<Student> students = new ArrayList<Student>();

    public static void menu(int n) {
        Scanner sc = new Scanner(System.in);
        switch (n) {
            case 1: // for checking the room of a student
                System.out.println("Enter Student Name");
                String name = sc.nextLine();
                for (Student s : students) {
                    if (s.name.equals(name)) {
                        System.out.println("Room Number: " + s.roomNumber);
                        break;
                    }
                }
                System.out.println("Student not found");
                break;
            case 2: // adding a new student
                System.out.println("Enter Student Details");
                System.out.println("Enter Student Name");
                name = sc.nextLine();
                System.out.println("Enter Student Age");
                int age = sc.nextInt();
                System.out.println("Enter Room Number");
                int roomNumber = sc.nextInt();
                Student student = new Student(name, age, roomNumber);
                students.add(student);
                break;
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (n >= 0) {
            System.out.println("Enter 1 for checking the room of a student");
            System.out.println("Enter 2 for adding a new student");
            System.out.println("Enter your choice");
            n = sc.nextInt();
            sc.nextLine();
            Hostel.menu(n);
        }
    }
}

class Student {
    String name;
    int age;
    int roomNumber;

    Student(String name, int age, int roomNumber) {
        this.name = name;
        this.age = age;
        this.roomNumber = roomNumber;
    }
}
