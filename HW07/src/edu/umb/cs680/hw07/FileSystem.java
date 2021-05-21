
package edu.umb.cs680.hw07;

import java.util.LinkedList;

public class FileSystem {

    private LinkedList<Directory> rootDir = new LinkedList<Directory>();
    private static FileSystem fileSystem = null;

    public static FileSystem getFileSystem(){
        if(fileSystem == null)
            fileSystem = new FileSystem();
        return fileSystem;
    }

    public LinkedList<Directory> getRootDirectory() {
        return rootDir;
    }

    public void appendRootDirectory(Directory root) {
        this.rootDir.add(root);
    }

}