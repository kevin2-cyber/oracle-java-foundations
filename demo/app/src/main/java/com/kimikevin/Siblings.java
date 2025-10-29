package com.kimikevin;

import java.io.File;
import java.util.*;

public class Siblings {
    public static boolean areSiblings(File f1, File f2){

        String s1 = f1.getParent();
        String s2 = f2.getParent();

        return s1.equals(s2);
    }

    // deleting old files
    public void deleteOldFiles(File rootDir, long thresholdDate) {
        Deque<File> files = new ArrayDeque<>(getChildren(rootDir));

        while (files.size() != 0) {
            File file = files.pop();

            if (file.isDirectory()) {
                if (file.lastModified() > thresholdDate) {
                    file.delete();
                }
            } else {
                files.addAll(getChildren(file));
            }
        }
    }

    private List<File> getChildren(File dir) {
        File[] children = dir.listFiles();

        return children == null || children.length == 0 ?
                Collections.emptyList() :
                Arrays.asList(children);
    }
}
