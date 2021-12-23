package com.company;

public class Subjects {
//    subjectNo, subjectName
    private String subjectNo;
    private String subjectName;

    public Subjects(String subjectNo, String subjectName) {
        this.subjectNo = subjectNo;
        this.subjectName = subjectName;
    }

    public Subjects() {

    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
