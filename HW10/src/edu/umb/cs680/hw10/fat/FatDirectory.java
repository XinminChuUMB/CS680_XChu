package edu.umb.cs680.hw10.fat;

import java.time.LocalDateTime;
import java.util.LinkedList;


import edu.umb.cs680.hw10.fs.FSElement;

public class FatDirectory extends FatFSElement {
    private LinkedList<FatFSElement> children =  new LinkedList<FatFSElement>();

    public FatDirectory(FatDirectory parent, String name, int size, LocalDateTime creationTime){
        super(parent, name, size, creationTime);
    }

    @Override
    public void appendChild(FSElement child) {
        this.children.add((FatFSElement) child);
        child.setParent(this);
    }

    @Override
    public LinkedList<FatFSElement> getChildren() {
        return this.children;
    }

    public int countChildren() {
        return this.children.size();
    }

    public LinkedList<FatDirectory> getSubDirectories() {
        LinkedList<FatDirectory> subDirectories = new LinkedList<FatDirectory>();
        for(FatFSElement file: children) {
            if(file.isDirectory())
                subDirectories.add((FatDirectory) file);
        }
        return subDirectories;
    }

    public LinkedList<FatFile> getFiles() {
        LinkedList<FatFile> files = new LinkedList<FatFile>();
        for(FatFSElement file: children) {
            if(file.isFile())
                files.add((FatFile) file);
        }
        return files;
    }

    public int getTotalSize() {
        int totalSize = 0;
        for(FatFSElement file: children) {
            if(file.isDirectory()) {
                totalSize += ((FatDirectory) file).getTotalSize();
            } else {
                totalSize += file.getSize();
            }
        }
        return totalSize;
    }

    @Override
    public boolean isDirectory() {
        return true;
    }
}