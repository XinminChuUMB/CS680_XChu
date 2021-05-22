package edu.umb.cs680.hw12.apfs;

import java.util.LinkedList;

public class ApfsFileCrawlingVisitor implements ApfsVisitor {

    private LinkedList<ApfsFile> files= new LinkedList<ApfsFile>();

    public LinkedList<ApfsFile> getFiles() {
        return files;
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
        files.add(file);
    }

}
