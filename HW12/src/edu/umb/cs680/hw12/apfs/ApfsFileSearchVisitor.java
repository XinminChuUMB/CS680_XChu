package edu.umb.cs680.hw12.apfs;

import java.util.LinkedList;

public class ApfsFileSearchVisitor implements ApfsVisitor {

    private LinkedList<ApfsFile> foundFiles = new LinkedList<ApfsFile>();
    private String fileName;

    public ApfsFileSearchVisitor(String name) {
        this.fileName = name;
    }

    @Override
    public void visit(ApfsLink link) {
        return;
    }

    @Override
    public void visit(ApfsDirectory dir) {
        return;
    }

    @Override
    public void visit(ApfsFile file) {
        if (file.getName().equals(fileName)) {
            foundFiles.add(file);
        }
    }

    public LinkedList<ApfsFile> getFoundFiles() {
        return this.foundFiles;
    }
}
