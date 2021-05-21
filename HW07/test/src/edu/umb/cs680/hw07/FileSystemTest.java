package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class FileSystemTest {
    private LocalDateTime Date;

    private Directory[] LinkedListToArray(LinkedList<Directory> rootList) {
        Directory[] dir = new Directory[rootList.size()];
        int num = 0;
        for(Directory root: rootList) {
            dir[num++] = root;
        }
        return dir;
    }

    @Test
    public void sameFileSystemTest() {
        FileSystem fileSys1 = FileSystem.getFileSystem();
        FileSystem fileSys2 = FileSystem.getFileSystem();
        assertSame(fileSys1, fileSys2);
    }

    @Test
    public void getRootDirectoryTest() {
        FileSystem actual = FileSystem.getFileSystem();
        Directory[] expected = {};
        assertArrayEquals(expected, this.LinkedListToArray(actual.getRootDirectory()));
    }

    @Test
    public void addRootDirectoryTest() {
        Directory root = new Directory(null, "Root", 0, this.Date);
        FileSystem fileSys = FileSystem.getFileSystem();
        fileSys.appendRootDirectory(root);
        LinkedList<Directory> actual = fileSys.getRootDirectory();
        Directory[] expected = {root};
        assertArrayEquals(expected, this.LinkedListToArray(actual));
    }
}