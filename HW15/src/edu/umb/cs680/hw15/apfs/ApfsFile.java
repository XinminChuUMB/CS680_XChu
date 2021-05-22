
package edu.umb.cs680.hw15.apfs;

import java.time.LocalDateTime;

public class ApfsFile extends ApfsElement{

    public ApfsFile(ApfsDirectory parent, String name, int size, LocalDateTime creationTime, String ownersName,
                    LocalDateTime modifiedTimestamp) {
        super(parent, name, size, creationTime, ownersName, modifiedTimestamp);
    }
    @Override
    public boolean isFile() {
        return true;
    }

    public void accept(ApfsVisitor v) {
        v.visit(this);
    }
}