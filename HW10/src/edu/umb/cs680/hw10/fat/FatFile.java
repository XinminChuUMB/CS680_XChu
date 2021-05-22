package edu.umb.cs680.hw10.fat;

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