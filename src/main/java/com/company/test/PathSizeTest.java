package com.company.test;

import com.company.service.PathSizeThread;

public class PathSizeTest {
    private String path;

    public PathSizeTest(String path) {
        this.path = path;
    }

    public void doGetFolderSize(){
        PathSizeThread pathSizeThread = new PathSizeThread(path);
        pathSizeThread.start();
    }
}
