package com.company.service;

import com.company.model.PathSize;

import java.io.File;

public class PathSizeThread extends Thread{
    private String path;
    private File file;
    PathSize pathSize = new PathSize();

    public PathSizeThread(String path) {
        this.path = path;
        file = new File(path);
    }



    public void run(){
        try {
            System.out.println(pathSize.getFolderSize(file));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}


