
package lap8;

import java.io.*;
import java.util.*;

public class Students implements Serializable {
    private int rollNumber;
    private String name;
    private int age;
    private double mark;

    public Students(int rollNumber, String name, int age, double mark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    // Getters and Setters
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Age: " + age + ", Mark: " + mark;
    }

    public static class StudentManagement {
        private static List<Students> studentList = new ArrayList<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("1. Add Students");
                System.out.println("2. Update a Student");
                System.out.println("3. Delete a Student");
                System.out.println("4. Search Students");
                System.out.println("5. Display All Students");
                System.out.println("6. Save to File");
                System.out.println("7. Load from File");
                System.out.println("8. Exit");
                System.out.print("Your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline character

                switch (choice) {
                    case 1:
                        addStudent(scanner);
                        break;
                    case 2:
                        updateStudent(scanner);
                        break;
                    case 3:
                        deleteStudent(scanner);
                        break;
                    case 4:
                        searchStudents(scanner);
                        break;
                    case 5:
                        displayAllStudents();
                        break;
                    case 6:
                        saveToFile();
                        break;
                    case 7:
                        loadFromFile();
                        break;
                    case 8:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                }
            } while (choice != 8);
        }

        private static void addStudent(Scanner scanner) {
            System.out.print("Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            System.out.print("Enter Mark: ");
            double mark = scanner.nextDouble();

            Students students = new Students(rollNumber, name, age, mark);
            studentList.add(students);
            System.out.println("Student added successfully.");
        }

        private static void updateStudent(Scanner scanner) {
            System.out.print("Enter Roll Number of student to update: ");
            int rollNumber = scanner.nextInt();
            int index = findStudentIndexByRollNumber(rollNumber);
            if (index != -1) {
                Students students = studentList.get(index);
                System.out.println("Current details: " + students);
                System.out.print("Enter new Name: ");
                String name = scanner.next();
                System.out.print("Enter new Age: ");
                int age = scanner.nextInt();
                System.out.print("Enter new Mark: ");
                double mark = scanner.nextDouble();

                students.setName(name);
                students.setAge(age);
                students.setMark(mark);

                System.out.println("Student details updated successfully.");
            } else {
                System.out.println("Student with Roll Number " + rollNumber + " not found.");
            }
        }

        private static void deleteStudent(Scanner scanner) {
            System.out.print("Enter Roll Number of student to delete: ");
            int rollNumber = scanner.nextInt();
            int index = findStudentIndexByRollNumber(rollNumber);
            if (index != -1) {
                studentList.remove(index);
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student with Roll Number " + rollNumber + " not found.");
            }
        }

        private static void searchStudents(Scanner scanner) {
            System.out.print("Enter Roll Number to search: ");
            int rollNumber = scanner.nextInt();
            int index = findStudentIndexByRollNumber(rollNumber);
            if (index != -1) {
                System.out.println("Student found: " + studentList.get(index));
            } else {
                System.out.println("Student with Roll Number " + rollNumber + " not found.");
            }
        }

        private static void displayAllStudents() {
            if (studentList.isEmpty()) {
                System.out.println("No students to display.");
            } else {
                System.out.println("List of all students:");
                for (Students students : studentList) {
                    System.out.println(students);
                }
            }
        }

        private static void saveToFile() {
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
                outputStream.writeObject(studentList);
                System.out.println("Students saved to file successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while saving students to file: " + e.getMessage());
            }
        }

        private static void loadFromFile() {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("students.dat"))) {
                studentList = (List<Students>) inputStream.readObject();
                System.out.println("Students loaded from file successfully.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error occurred while loading students from file: " + e.getMessage());
            }
        }

        private static int findStudentIndexByRollNumber(int rollNumber) {
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getRollNumber() == rollNumber) {
                    return i;
                }
            }
            return -1; // Not found
        }
    }

    public static void main(String[] args) {
        Students student = new Students(2,"a",1 ,1);
    }
}
