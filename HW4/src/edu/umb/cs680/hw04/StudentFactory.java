package edu.umb.cs680.hw04;

public class StudentFactory {
    public static Student createInStateStudent(String name, String usAddr) {
        Student student = new Student(
                name,
                0,
                usAddr,
                0,
                null,
                Status.INSTATE);
        student.setTuition(1000f);
        return student;
    }

    public static Student createOutStateStudent(String name, String usAddr, int yrsInState) {
        Student student = new Student(
                name,
                0,
                usAddr,
                yrsInState,
                null,
                Status.OUTSTATE);
        student.setTuition(2000f);
        return student;
    }


    public static Student createIntlStudent(String name, String usAddr, int i20num, String foreignAddr) {
        Student student = new Student(
                name,
                i20num,
                usAddr,
                0,
                foreignAddr,
                Status.INTL);
        student.setTuition(3000f);
        return student;
    }
}
