package edu.umb.cs680.hw09.fat;

import java.time.LocalDateTime;
import edu.umb.cs680.hw09.fs.FileSystem;

public class FAT extends FileSystem{
    private static LocalDateTime cTime = LocalDateTime.now();
    private static FAT fat = null;
    private static FatDirectory rootDir;

    private FAT(){

    }

    public static FAT getInstance() {
        if (fat == null) {
            fat = new FAT();
        }
        return fat;
    }

    protected FatFSElement createDefaultRoot() {
        FAT.rootDir = new FatDirectory(null, FAT.name, 0, cTime);
        return FAT.rootDir;
    }

    public static FatDirectory getRootDir() {
        return rootDir;
    }
}