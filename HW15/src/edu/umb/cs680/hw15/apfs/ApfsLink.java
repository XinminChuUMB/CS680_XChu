
package edu.umb.cs680.hw15.apfs;

import java.time.LocalDateTime;

public class ApfsLink extends ApfsElement{
    private ApfsElement target;

    public ApfsLink(ApfsDirectory parent,
                    String name,
                    int size,
                    LocalDateTime creationTime,
                    ApfsElement target,
                    String ownersName,
                    LocalDateTime modifiedTimestamp) {
        super(parent, name, size, creationTime, ownersName, modifiedTimestamp);
        this.target = target;
    }

    public void setTarget(ApfsElement target){
        this.target = target;
    }

    public ApfsElement getTarget(){
        return this.target;
    }

    public int getTargetSize(){
        if(target.isDirectory()) {
            return ((ApfsDirectory) target).getTotalSize();
        } else if(target.isLink()) {
            return 0;
        } else {
            return target.getSize();
        }
    }

    public boolean targetisDirectory() {
        return target.isDirectory();
    }

    public boolean targetisFile() {
        return target.isFile();
    }

    public boolean targetisLink() {
        return target.isLink();
    }

    @Override
    public boolean isLink() {
        return true;
    }
}