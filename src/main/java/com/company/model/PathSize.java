package com.company.model;

import java.io.File;
import java.util.TreeSet;

public class PathSize {
    public TreeSet<Long> set = new TreeSet<Long>();

    public long getFolderSize(File folder) {
        long length = 0;
        File[] files = folder.listFiles();
        int count = files.length;

        for (int i = 0; i < count; i++) {

            if (files[i].isFile()) {
                length += files[i].length();

            }
            else {
                length += getFolderSize(files[i]);
                set.add(length);
            }
        }
        set.add(length);
        return length;
    }
}
