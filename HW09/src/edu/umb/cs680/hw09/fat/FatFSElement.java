package edu.umb.cs680.hw09.fat;

import edu.umb.cs680.hw09.fs.FSElement;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class FatFSElement extends FSElement {

    private LinkedList<FatFSElement> FatChildren =  new LinkedList<FatFSElement>();

    public FatFSElement(FatDirectory parent, String name, int size, LocalDateTime creationTime) {
        super(parent, name, size, creationTime);
    }

    public void appendChild(FSElement child) {
        this.FatChildren.add((FatFSElement) child);
    }

    public LinkedList<FatFSElement> getChildren() {
        return this.FatChildren;
    }


    public boolean isDirectory() {
        return false;
    }

    public boolean isFile() {
        return false;
    }

    public boolean isLink() {
        return false;
    }

}

