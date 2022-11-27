package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.addStudent(new Student(1,"Kapusto","Vlad","V",2000,"",37533316,"IT",2,"i25"));
        studentList.addStudent(new Student(2,"Petrov","Dima","T",1999,"",375333166,"Med",2,"m26"));
        studentList.addStudent(new Student(3,"Ivanov","Ivan","F",1998,"",37533,"IT",2,"i25"));

        // a) список студентов заданного факультета;
        System.out.println("a) список студентов заданного факультета;");
        ArrayList<Student> listFaculty = studentList.getStudentByFaculty("IT");
        for (Student student : listFaculty) {
            System.out.println(student);
        }
        System.out.println("----------------------------------------");

        // b) списки студентов для каждого факультета и курса;
        System.out.println("b) списки студентов для каждого факультета и курса;");
        ArrayList<Student> listStudents = studentList.getStudentList();
        for (Student student : listStudents) {
            System.out.println(student);
        }
        System.out.println("----------------------------------------");

        // c) список студентов, родившихся после заданного года;
        System.out.println("c) список студентов, родившихся после заданного года;");
        ArrayList<Student> listDateOfBirth = studentList.getStudentAfterYear(1998);
        for (Student student : listDateOfBirth) {
            System.out.println(student);
        }
        System.out.println("----------------------------------------");

        // d) список учебной группы.
        System.out.println("d) список учебной группы.");
        ArrayList<Student> listStudentGroup = studentList.getStudentsByGroup("i25");
        for (Student student : listStudentGroup) {
            System.out.println(student);
        }
        System.out.println("----------------------------------------");
    }
}

class Student {

    private int id;
    private String secondName;
    private String firstName;
    private String thirdName;
    private int dateOfBirth;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String secondName, String firstName, String thirdName, int dateOfBirth, String address, int phoneNumber, String faculty, int course, String groupe) {
        this.id = id;
        this.secondName = secondName;
        this.firstName = firstName;
        this.thirdName = thirdName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = groupe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                "}";
    }

}

class StudentList {
    private final ArrayList<Student> studentList = new ArrayList<>();

    void addStudent(Student student) {
        studentList.add(student);
    }



    // a) список студентов заданного факультета;
    public  ArrayList<Student> getStudentByFaculty(String faculty){
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (Student student : studentList){
            if (student.getFaculty().equals(faculty)){
                studentArrayList.add(student);
            }
        }
        return studentArrayList;
    }

    // b) списки студентов для каждого факультета и курса;
    public ArrayList<Student> getStudentList(){
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (Student student : studentList){
            studentArrayList.add(student);
        }
        return studentArrayList;
    }

    // c) список студентов, родившихся после заданного года;
    public ArrayList<Student> getStudentAfterYear(int dateOfBirth){
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (Student student : studentList){
            if (student.getDateOfBirth() > dateOfBirth){
                studentArrayList.add(student);
            }
        }
        return studentArrayList;
    }

    // d) список учебной группы.
    public  ArrayList<Student> getStudentsByGroup(String group){
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (Student student : studentList){
            if (student.getGroup().equals(group)){
                studentArrayList.add(student);
            }
        }
        return studentArrayList;
    }
}