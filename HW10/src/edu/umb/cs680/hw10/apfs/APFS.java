
package edu.umb.cs680.hw10.apfs;

import java.time.LocalDateTime;
import edu.umb.cs680.hw10.fs.FileSystem;

public class APFS extends FileSystem{
    private static LocalDateTime cTime = LocalDateTime.now();
    private static APFS apfs = null;
    private static ApfsDirectory rootDir;

    private APFS(){

    }

    public static APFS getInstance() {
        if (apfs == null) {
            apfs = new APFS();
        }
        return apfs;
    }

    protected ApfsElement createDefaultRoot() {
        APFS.rootDir = new ApfsDirectory(null, APFS.name, 0, cTime,
                "user1", cTime);
        return APFS.rootDir;
    }

    public static ApfsDirectory getRootDir() {
        return rootDir;
    }
}