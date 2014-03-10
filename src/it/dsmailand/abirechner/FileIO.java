/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carl
 */
public class FileIO {


    /*
     * @source http://www.tutorialspoint.com/java/java_serialization.htm
     */
    public static void saveToDisk(Data data, File file) {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(file);
            OutputStream buffer = new BufferedOutputStream(fileOut);
            ObjectOutputStream out = new ObjectOutputStream(buffer);
            
            out.writeObject(data);
            out.close();
            buffer.close();
            fileOut.close();
            fLogger.log(Level.FINE, "Saving data to \"{0}\"", file.getPath());
        } catch (IOException e) {
            fLogger.log(Level.SEVERE, "Cannot perform output.", e);
        }
    }

    public static void readFromDisk(File file, Data data) {
        try {
            FileInputStream fileIn = new FileInputStream(file);
            InputStream buffer = new BufferedInputStream(fileIn);
            ObjectInputStream in = new ObjectInputStream(buffer);
            
            data = (Data) in.readObject();
            in.close();
            buffer.close();
            fileIn.close();
            fLogger.log(Level.FINE, "Reading data from \"{0}\"", file.getPath());
        } catch (IOException e) {
            fLogger.log(Level.SEVERE, "Cannot perform input.", e);
        } catch (ClassNotFoundException e) {
            fLogger.log(Level.SEVERE, "Cannot perform output. Class not found.", e);
        }
    }
    private static final Logger fLogger =
            Logger.getLogger(Data.class.getPackage().getName());
}
