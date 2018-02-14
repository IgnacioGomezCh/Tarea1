/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nacho
 */
public class FileIO {
    private final String fileName;

    public FileIO(String fileName) throws IOException {
        this.fileName = fileName;
        File tmpDir = new File(fileName);
        boolean exists = tmpDir.exists();
        if(!exists){
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        }
    }
    
    public void writeToFile(String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.append(data); 
        writer.close();
    }
}
