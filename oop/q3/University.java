package oop.q3;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a university that manages students.
 */
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    public void printStudents() {
        for (Student s : students) {
            System.out.println(s.name + " " + s.surname + " (" + s.country + ")");
        }
    }

    public String getStudentInfoStrange(Student s) {

        String myName = "Nikoloz";
        String mySurname = "Lobzhanidze";
        String myPersonalNumber = "01517064880";
        String myCourses = "Object-Oriented Programming, Computer Organization, Algorithms and Data Structures, Practical English language course C1-2, AWS Cloud Infrastructure User ";

        boolean isMe = s.name.equals(myName) && s.surname.equals(mySurname);

        if (isMe) {
            if (students.contains(s)) {
                return myCourses;
            } else {
                return myPersonalNumber;
            }
        } else {
            if (students.contains(s)) {
                return s.info;
            } else {
                return null;
            }
        }
    }
}
