package com.company;

public class StudentMarks {
//    StudentMarks(rno, year, subjectNo, marks)
    private String rollNumber;
    private Integer year;
    private String subjectNo;
    private  Integer marks;

    @Override
    public String toString() {
        return "StudentMarks{" +
                "rollNumber='" + rollNumber + '\'' +
                ", year=" + year +
                ", subjectNo='" + subjectNo + '\'' +
                ", marks=" + marks +
                '}';
    }

    public StudentMarks(String rollNumber, Integer year, String subjectNo, Integer marks) {
        this.rollNumber = rollNumber;
        this.year = year;
        this.subjectNo = subjectNo;
        this.marks = marks;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
}
