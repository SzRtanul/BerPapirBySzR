/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.szamalk.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author szabo.roland
 */
public class MakeMuchFile {
    
    public static void main(String[] args){
        makeNames();
       // makeFiles();
    }
    
    public static void makeNames(){
         try {
            FileWriter fw = new FileWriter("config/adatok2.csv", Charset.forName("UTF-8"));
            for (int i = 0; i < 500; i++) {
                fw.write("Szabó Roland " + i +";szrtanul@gmail.com\n");
                fw.flush();
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(MakeMuchFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void makeFiles(){
        for (int i = 0; i < 500; i++) {
            try {
                Files.createFile(Paths.get("files/Szabó Roland " + i*2 + "_" + (int)(Math.random() * 2000)));
            } catch (Exception e) { }
        }
    }
}
