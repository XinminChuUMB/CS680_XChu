package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class FileTest {
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

    private String[] fileToStringArray(File file) {
        String[] fileInfo = {String.valueOf(file.isDirectory()), file.getName(), Integer.toString(file.getSize()),
                file.getCreationTime().toString(), file.getParent().getName()};
        return fileInfo;
    }

    @Test
    public void verifyFileHomework1() {
        String[] expected = {"false", "hw1", "1", Date.toString(), "cs625"};
        File actual = hw1;
        assertArrayEquals(expected, fileToStringArray(actual));
    }

    @Test
    public void verifyFileMidterm() {
        String[] expected = {"false", "midterm", "2", Date.toString(), "cs648"};
        File actual = midterm;
        assertArrayEquals(expected, fileToStringArray(actual));
    }

    @Test
    public void verifyFileSyllabus() {
        String[] expected = {"false", "syllabus", "2", Date.toString(), "root"};
        File actual = syllabus;
        assertArrayEquals(expected, fileToStringArray(actual));
    }

}