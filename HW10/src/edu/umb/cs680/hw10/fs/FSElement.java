
package edu.umb.cs680.hw10.fs;

import java.time.LocalDateTime;

public abstract class FSElement {
    private String name;
    private LocalDateTime creationTime;
    private int size;
    private FSElement parent;

    public FSElement(FSElement parent, String name, int size, LocalDateTime creationTime) {
        this.name = name;
        this.size = size;
        this.creationTime = creationTime;
        if (parent != null) {
            parent.appendChild(this);
        } else {
            this.parent = null;
        }
    }

    public void setParent(FSElement parent) {
        this.parent = parent;
    }

    public FSElement getParent() {
        return this.parent;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCreateTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getCreateTime() {
        return this.creationTime;
    }

    public abstract void appendChild(FSElement parent);

    abstract public boolean isDirectory();

    abstract public boolean isFile();
    abstract public boolean isLink();
}