package edu.umb.cs680.hw07;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Directory extends FSElement {

    private LinkedList<FSElement> children =  new LinkedList<FSElement>();

    public Directory(Directory parent, String name, int size, LocalDateTime creationTime){
        super(parent, name, size, creationTime);
    }

    public LinkedList<FSElement> getChildren() {
        return this.children;
    }

    public void appendChild(FSElement child) {
        this.children.add(child);
        child.setParent(this);
    }

    public int countChildren() {
        return this.children.size();
    }

    public LinkedList<Directory> getSubDirectories() {
        LinkedList<Directory> subDirectories = new LinkedList<Directory>();
        for(FSElement file: children) {
            if(file.isDirectory())
                subDirectories.add((Directory) file);
        }
        return subDirectories;
    }

    public LinkedList<File> getFiles() {
        LinkedList<File> files = new LinkedList<File>();
        for(FSElement file: children) {
            if(!file.isDirectory())
                files.add((File) file);
        }
        return files;
    }

    public int getTotalSize() {
        int tSize = 0;
        for(FSElement file: children) {
            if(file.isDirectory()) {
                tSize += ((Directory) file).getTotalSize();
            } else {
                tSize += file.getSize();
            }
        }
        return tSize;
    }

    public boolean isDirectory() {
        return true;
    }

}