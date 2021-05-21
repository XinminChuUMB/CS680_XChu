package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class DirectoryTest {
    static private LocalDateTime Date = LocalDateTime.now();
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


    private String[] dirToStringArray(Directory dir) {
        String parentName = null;
        Directory parent = dir.getParent();
        if(parent != null) {
            parentName = parent.getName();
        }

        String[] dirString = {String.valueOf(dir.isDirectory()), dir.getName(),
                Integer.toString(dir.getSize()), dir.getCreationTime().toString(), parentName,
                Integer.toString(dir.countChildren()), Integer.toString(dir.getTotalSize())};
        return dirString;
    }


    @Test
    public void verifyDirectoryRoot() {
        String[] expected = {"true", "root", "0", Date.toString(), null, "2", "2"};
        Directory actual = root;
        assertArrayEquals(expected, dirToStringArray(actual));
    }

    @Test
    public void verifyDirectoryCourse() {
        String[] expected = {"true", "course21", "0", Date.toString(), "root", "3", "6"};
        Directory actual = course21;
        assertArrayEquals(expected, dirToStringArray(actual));
    }

    @Test
    public void verifyDirectoryCS680() {
        String[] expected = {"true", "cs680", "0", Date.toString(), "course21", "1", "2"};
        Directory actual = cs680;
        assertArrayEquals(expected, dirToStringArray(actual));
    }

}