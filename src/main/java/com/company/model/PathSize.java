package com.company.model;

import java.io.File;

public class PathSize {
    public long getFolderSize(File folder) throws InterruptedException {
        long length = 0;
        File[] files = folder.listFiles();

        int count = files.length;

        for (int i = 0; i < count; i++) {
            Thread.sleep(100);
            if (files[i].isFile()) {
                length += files[i].length();
            }
            else {
                System.out.println(length);
                length += getFolderSize(files[i]);
            }

        }
        return length;
    }
}
