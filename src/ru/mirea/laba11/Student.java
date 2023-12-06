package ru.mirea.laba11;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {
    private String lastName;
    private String firstName;
    private String specialty;
    private int course;
    private String group;
    private Date birthDate;


    // Конструктор класса
    public Student(String lastName, String firstName, String specialty, int course, String group, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.birthDate = birthDate;

    }

    // Геттеры и сеттеры для каждой переменной

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getBirthDate() {return birthDate;}

    public void setBirthDate(Date birthDate) {this.birthDate = birthDate;}

    public String formatBirthDate(String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String r = sdf.format(birthDate);
        return sdf.format(birthDate);
    }
    @Override
    public String toString() {
        return "Студент - " + lastName + " " + firstName + ", " + specialty + ", " +
                course + " курс, " +
                group + ", " +
                birthDate;
    }
}
