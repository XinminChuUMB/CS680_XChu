package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class LinkTest {
    static private final LocalDateTime Date = LocalDateTime.now();
    static Directory root = new Directory(null, "Root", 0, Date);
    static Directory course21 = new Directory(root, "course21", 0, Date);
    static Directory cs680 = new Directory(course21, "CS680", 0, Date);
    static Directory cs625 = new Directory(course21, "CS625", 0, Date);
    static Directory cs648 = new Directory(course21, "CS648", 0, Date);
    static File hw1 = new File(cs625, "homework1", 1, Date);
    static File hw2 = new File(cs625, "homework2", 1, Date);
    static File syllabus = new File(root, "syllabus", 2, Date);
    static File midterm = new File(cs648, "midterm", 2, Date);
    static File quiz1 = new File(cs680, "quiz1", 2, Date);
    static Link l1 = new Link(null, "link1", 0, Date, cs680);
    static Link l2 = new Link(null, "link2", 0, Date, hw2);



    @Test
    public void verifyLink1() {
        Directory expected = cs680;
        FSElement actual = l1.getTarget();
        assertSame(expected, actual);
    }

    @Test
    public void verifyLink2() {
        File expected = hw2;
        FSElement actual = l2.getTarget();
        assertSame(expected, actual);
    }
}