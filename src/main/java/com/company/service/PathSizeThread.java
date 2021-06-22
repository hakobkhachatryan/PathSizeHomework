package com.company.service;

import com.company.model.PathSize;

import java.io.File;
import java.util.Iterator;
import java.util.TreeSet;

public class PathSizeThread extends Thread{
    private String path;
    private File file;
    PathSize pathSize = new PathSize();

    public PathSizeThread(String path) {
        this.path = path;
        file = new File(path);
    }



    public void run(){
        pathSize.getFolderSize(file);
        TreeSet<Long> set = pathSize.set;
        Iterator<Long> iterator = set.iterator();

        while (iterator.hasNext()){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(iterator.next());
        }

    }


}


