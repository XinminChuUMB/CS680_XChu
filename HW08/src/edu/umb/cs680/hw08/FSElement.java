
package edu.umb.cs680.hw08;

import java.time.LocalDateTime;

public abstract class FSElement {
    protected String name;
    protected int size;
    protected LocalDateTime creationTime;
    protected Directory parent;

    public FSElement(Directory parent, String name, int size, LocalDateTime creationTime) {
        this.name = name;
        this.size = size;
        this.creationTime = creationTime;
        if (parent != null) {
            parent.appendChild(this);
        } else {
            this.parent = null;
        }
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public Directory getParent() {
        return parent;
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

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    abstract public boolean isDirectory();

    abstract public boolean isFile();

    abstract public boolean isLink();

}