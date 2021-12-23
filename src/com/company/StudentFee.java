package com.company;

public class StudentFee {
//    rno, amount, date
private String rollNumber;
private String amount;
private String  date;

    public StudentFee(String rollNumber, String amount, String date) {
        this.rollNumber = rollNumber;
        this.amount = amount;
        this.date = date;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
