package edu.umb.cs680.hw10.apfs;

import java.time.LocalDateTime;
import java.util.LinkedList;
import edu.umb.cs680.hw10.fs.FSElement;

public class ApfsElement extends FSElement{
    private String ownersName;
    private LocalDateTime lastModifiedTimestamp;
    private LinkedList<ApfsElement> ApfsChildren =  new LinkedList<ApfsElement>();

    public ApfsElement(ApfsDirectory parent, String name, int size, LocalDateTime creationTime,
                       String ownersName, LocalDateTime lastModifiedTimestamp) {
        super(parent, name, size, creationTime);
        this.ownersName = ownersName;
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    public void appendChild(FSElement child) {
        this.ApfsChildren.add((ApfsElement) child);
    }

    public LinkedList<ApfsElement> getChildren() {
        return this.ApfsChildren;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setLastModifiedTimestamp(LocalDateTime lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    public LocalDateTime getLastModifiedTimestamp() {
        return lastModifiedTimestamp;
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