package com.company;

public class Student {

//    Student (rno, name, branch, year)
    private String rollNumber;
    private String name;
    private  String branch;
    private Integer year;

    public Student(String rollNumber, String name, String branch, int year) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.branch = branch;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber='" + rollNumber + '\'' +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", year=" + year +
                '}';
    }

    public Student() {

    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
