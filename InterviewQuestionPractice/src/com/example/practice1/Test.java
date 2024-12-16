package com.example.practice1;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class Test {

    public static void main(String[] args) throws IOException {
        File file=new File("G:\\new");
        String s="fsdgsdgsdgsddfd";
        if(file.isDirectory()){
            File[] files=file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return !pathname.isDirectory();
                }
            });
            for(File f:files){
                System.out.println(f.getAbsolutePath());
                List<String> lines = Files.readAllLines(Paths.get(f.getAbsolutePath()));
                for (String line : lines) {
                    System.out.println(line);
                    FileWriter writer = new FileWriter(f, false);
                    writer.write(s);
                    writer.close();
                }
            }
        }
    }
}
