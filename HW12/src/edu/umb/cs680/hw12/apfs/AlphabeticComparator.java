package edu.umb.cs680.hw12.apfs;

import java.util.Comparator;

public class AlphabeticComparator implements Comparator<ApfsElement> {

    @Override
    public int compare(ApfsElement apfs1, ApfsElement apfs2) {
        return apfs1.getName().toString().compareTo(apfs2.getName().toString());
    }

}
