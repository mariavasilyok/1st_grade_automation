package com.epam.mara.classes;

import java.util.Calendar;
import java.util.Date;

public class Student {
    int id;
    String firstName;
    String patronymic;
    String lastName;
    Calendar dateOfBirth;
    String address;
    String phone;
    Faculties faculty;
    int year;
    String group;

    public Student(int id, String firstName, String patronymic, String lastName, Calendar dateOfBirth, String address, String phone, Faculties faculty, int year, String group) {
        this.id = id;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.year = year;
        this.group = group;
    }

    public Student(int id, String firstName, String patronymic, String lastName, Calendar dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Faculties getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculties faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Студент " +
                firstName + " " +
                patronymic + " " +
                lastName +
                ", родился(лась) " + dateOfBirth.get(Calendar.DAY_OF_MONTH) +
                "." + dateOfBirth.get(Calendar.MONTH) + "." + dateOfBirth.get(Calendar.YEAR) +
                ", адрес: " + address +
                ", телефон: " + phone +
                ", факультет " + faculty + ", " +
                year + " курс" +
                ", группа " + group;
    }
}