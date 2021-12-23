package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("R1", "deva", "cse", 1);
        Student student2 = new Student("R2", "raju", "eee", 2);
        Student student3 = new Student("R3", "kiran", "ece", 1);
        Student student4 = new Student("R4", "kumar", "cse", 3);

        List<Student> studentList = Arrays.asList(student1, student2, student3, student4);

        Subjects subject1 = new Subjects("SUB1", "Drawing");
        Subjects subject2 = new Subjects("SUB2", "Physics");
        Subjects subject3 = new Subjects("SUB3", "Chemistry");
        Subjects subject4 = new Subjects("SUB4", "c");
        List<Subjects> subjectsList = Arrays.asList(subject1, subject2, subject3, subject4);

        StudentFee sf1 = new StudentFee("R1", "1500", "12-02-2014");
        StudentFee sf2 = new StudentFee("R2", "1700", "22-02-2014");
        StudentFee sf3 = new StudentFee("R3", "1800", "20-02-2014");
        StudentFee sf4 = new StudentFee("R4", "1900", "11-02-2014");
        List<StudentFee> studentFeeList = Arrays.asList(sf1, sf2, sf3, sf4);

        StudentMarks studentMarks1 = new StudentMarks("R1", 1, "SUB1", 45);
        StudentMarks studentMarks2 = new StudentMarks("R2", 2, "SUB2", 50);
        StudentMarks studentMarks3 = new StudentMarks("R3", 1, "SUB3", 45);
        StudentMarks studentMarks4 = new StudentMarks("R4", 3, "SUB4", 60);
        List<StudentMarks> studentMarksList = Arrays.asList(studentMarks1, studentMarks2, studentMarks3, studentMarks4);

//        Task 1: Print student rno, name, branch of 1st year students
        studentList.stream().filter(student -> student.getYear().equals(1)).forEach(s -> System.out.println(s.getRollNumber() + " " + s.getName() + " " + s.getBranch()));

        //         Task 2: Print all students rno, name, branch, amount, date
        studentList.stream().forEach(student -> {
            System.out.print(student.getRollNumber() + " " + student.getName() + " " + student.getBranch() + " ");
            studentFeeList.stream().filter(studentFee -> studentFee.getRollNumber().equals(student.getRollNumber())).forEach(sf -> System.out.println(sf.getAmount() + " " + sf.getDate()));
        });
//        Task 3: Print all students rno, name, subjectName, marks
        studentList.stream().forEach(st -> {
            System.out.print(st.getRollNumber() + " " + st.getName() + " ");
            studentMarksList.stream().filter(stm -> stm.getRollNumber().contains(st.getRollNumber())).forEach(stu -> {
                subjectsList.stream().filter(e -> e.getSubjectNo().contains(stu.getSubjectNo())).forEach(subjects -> System.out.print(subjects.getSubjectName() + " "));
                System.out.println(" " + stu.getMarks());
            });
        });
//        Task 4: Print all students rno, name, subjectName, marks order by year
        studentList.stream().collect(Collectors.groupingBy(Student::getYear, Collectors.toList())).values().forEach(students -> students.stream().forEach(st -> {
            System.out.print(st.getRollNumber() + " " + st.getName() + " " + st.getYear() + " ");
            studentMarksList.stream().filter(stm -> stm.getRollNumber().contains(st.getRollNumber())).forEach(stu -> {
                subjectsList.stream().filter(e -> e.getSubjectNo().contains(stu.getSubjectNo())).forEach(subjects -> System.out.print(subjects.getSubjectName() + " "));
                System.out.println(" " + stu.getMarks());
            });
        }));


    }
}
