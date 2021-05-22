package edu.umb.cs680.hw09.fat;

import java.time.LocalDateTime;

public class FatFile extends FatFSElement {
    public FatFile(FatDirectory parent, String name, int size, LocalDateTime creationTime){
        super(parent, name, size, creationTime);
    }

    @Override
    public boolean isFile() {
        return true;
    }
}