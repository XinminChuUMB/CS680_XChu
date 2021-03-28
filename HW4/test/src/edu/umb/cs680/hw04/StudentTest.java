package edu.umb.cs680.hw04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void createInStateStudentTest() {
        Student student = StudentFactory.createInStateStudent("Leah", "Albuquerque");
        String name = student.getName();
        String usAddr = student.getUsAddr();
        int yrsInState = student.getYrsInState();
        int i20Num = student.getI20Num();
        float tuition = student.getTuition();
        String foreignAddr = student.getForeignAddr();
        Status status = student.getStatus();

        assertEquals(name, "Leah");
        assertEquals(usAddr, "Albuquerque");
        assertEquals(yrsInState, 0);
        assertEquals(i20Num, 0);
        assertEquals(foreignAddr, null);
        assertEquals(status, Status.INSTATE);
        assertEquals(tuition, 1000f);
    }

    @Test
    public void createOutStateStudentTest() {
        Student student = StudentFactory.createOutStateStudent("Lindsey", "Little Rock", 5);
        String name = student.getName();
        String usAddr = student.getUsAddr();
        int yrsInState = student.getYrsInState();
        int i20Num = student.getI20Num();
        float tuition = student.getTuition();
        String foreignAddr = student.getForeignAddr();
        Status status = student.getStatus();

        assertEquals(name, "Lindsey");
        assertEquals(usAddr, "Little Rock");
        assertEquals(yrsInState, 5);
        assertEquals(i20Num, 0);
        assertEquals(foreignAddr, null);
        assertEquals(status, Status.OUTSTATE);
        assertEquals(tuition, 2000f);
    }

    @Test
    public void createIntlStudentTest() {
        Student student = StudentFactory.createIntlStudent("Xinmin Chu", "1020 Telstar", 667788, "Shanghai Road");
        String name = student.getName();
        String usAddr = student.getUsAddr();
        int yrsInState = student.getYrsInState();
        int i20num = student.getI20Num();
        float tuition = student.getTuition();
        String foreignAddr = student.getForeignAddr();
        Status status = student.getStatus();

        assertEquals(name, "Xinmin Chu");
        assertEquals(usAddr, "1020 Telstar");
        assertEquals(yrsInState, 0);
        assertEquals(i20num, 667788);
        assertEquals(foreignAddr, "Shanghai Road");
        assertEquals(status, Status.INTL);
        assertEquals(tuition, 3000f);
    }
}