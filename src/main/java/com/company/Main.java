package com.company;
import com.company.model.PathSize;
import com.company.test.PathSizeTest;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/hakobkhachatryan/Desktop/bdg_intermediate";
        PathSizeTest pathSizeTest = new PathSizeTest(path);
        pathSizeTest.doGetFolderSize();
    }


}
