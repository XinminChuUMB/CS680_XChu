package edu.umb.cs680.hw15.apfs;

import java.time.LocalDateTime;
import java.util.LinkedList;
import edu.umb.cs680.hw15.fs.FSElement;

public class ApfsElement extends FSElement {
    private String ownersName;
    private LocalDateTime modifiedTimestamp;
    private LinkedList<ApfsElement> ApfsChildren =  new LinkedList<ApfsElement>();

    public ApfsElement(ApfsDirectory parent, String name, int size, LocalDateTime creationTime,
                       String ownersName, LocalDateTime modifiedTimestamp) {
        super(parent, name, size, creationTime);
        this.ownersName = ownersName;
        this.modifiedTimestamp = modifiedTimestamp;
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

    public void setModifiedTimestamp(LocalDateTime modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
    }

    public LocalDateTime getModifiedTimestamp() {
        return modifiedTimestamp;
    }

    public boolean isDirectory() {
        return false;
    };

    public boolean isFile() {
        return false;
    }

    public boolean isLink() {
        return false;
    }

    public void accept(ApfsVisitor v) {
        return;
    }
}