package ru.mirea.laba9;

import java.util.*;

class Student implements Comparable<Student> {
       private String lastName;
       private String firstName;
       private int age;
       private String studentId;

       public Student(String lastName, String firstName, int age, String studentId) {
              this.lastName = lastName;
              this.firstName = firstName;
              this.age = age;
              this.studentId = studentId;
       }

       public String getLastName() {
              return lastName;
       }

       public String getFirstName() {
              return firstName;
       }

       public int getAge() {
              return age;
       }

       public String getStudentId() {
              return studentId;
       }

       @Override
       public int compareTo(Student other) {
              return this.lastName.compareTo(other.getLastName());
       }

       @Override
       public String toString() {
              return lastName + " " + firstName + ", Age: " + age + ", Student ID: " + studentId;
       }
}

public class StudentSortingApp {
       public static void main(String[] args) {
              List<Student> group1 = new ArrayList<>();
              List<Student> group2 = new ArrayList<>();

              // Исходные данные
              group1.add(new Student("Иванов", "Иван", 20, "S12345"));
              group1.add(new Student("Петров", "Петр", 22, "S56789"));

              group2.add(new Student("Сидоров", "Андрей", 21, "S11111"));
              group2.add(new Student("Козлов", "Сергей", 23, "S99999"));

              // Запуск программы
              runProgram(group1, group2);
       }

       private static void runProgram(List<Student> group1, List<Student> group2) {
              Scanner scanner = new Scanner(System.in);

              while (true) {
                     System.out.println("Хотите добавить студента в группу? (да/нет)");
                     String userInput = scanner.nextLine().toLowerCase();

                     if ("нет".equals(userInput)) {
                            break;
                     } else if ("да".equals(userInput)) {
                            addStudentToGroup(scanner, group1, group2);
                     } else {
                            System.out.println("Неверный ввод. Пожалуйста, введите 'да' или 'нет'.");
                     }
              }

              // Выбор сортировки
              sortAndPrint(group1, group2);
       }

       private static void addStudentToGroup(Scanner scanner, List<Student> group1, List<Student> group2) {
              System.out.println("Выберите группу для добавления студента (1 или 2):");
              int groupNumber = scanner.nextInt();
              scanner.nextLine(); // Очистка буфера после считывания числа

              if (groupNumber == 1) {
                     addStudent(scanner, group1);
              } else if (groupNumber == 2) {
                     addStudent(scanner, group2);
              } else {
                     System.out.println("Неверный выбор группы.");
              }
       }

       private static void addStudent(Scanner scanner, List<Student> group) {
              System.out.println("Введите фамилию студента:");
              String lastName = scanner.nextLine();

              System.out.println("Введите имя студента:");
              String firstName = scanner.nextLine();

              System.out.println("Введите возраст студента:");
              int age = scanner.nextInt();
              scanner.nextLine(); // Очистка буфера после считывания числа

              System.out.println("Введите номер студенческого:");
              String studentId = scanner.nextLine();

              group.add(new Student(lastName, firstName, age, studentId));
       }

       private static void sortAndPrint(List<Student> group1, List<Student> group2) {
              System.out.println("Выберите сортировку:\n1. По фамилии (в алфавитном порядке)\n2. По возрасту\n3. По номеру студенческого");
              Scanner scanner = new Scanner(System.in);
              int choice = scanner.nextInt();

              List<Student> mergedList = mergeAndSortLists(group1, group2, choice);

              System.out.println("Отсортированный список студентов:");
              for (Student student : mergedList) {
                     System.out.println(student);
              }
       }

       private static List<Student> mergeAndSortLists(List<Student> list1, List<Student> list2, int choice) {
              List<Student> mergedList = new ArrayList<>(list1);
              mergedList.addAll(list2);

              switch (choice) {
                     case 1:
                            Collections.sort(mergedList);
                            break;
                     case 2:
                            mergedList.sort(Comparator.comparingInt(Student::getAge));
                            break;
                     case 3:
                            mergedList.sort(Comparator.comparing(Student::getStudentId));
                            break;
                     default:
                            System.out.println("Неверный выбор сортировки. Список останется неотсортированным.");
              }

              return mergedList;
       }
}
