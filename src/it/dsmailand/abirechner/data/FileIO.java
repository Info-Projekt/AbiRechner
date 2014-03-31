/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner.data;

import it.dsmailand.abirechner.data.Data;
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

    public static Data readFromDisk(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
        Data newData;
            FileInputStream fileIn = new FileInputStream(file);
            InputStream buffer = new BufferedInputStream(fileIn);
            ObjectInputStream in = new ObjectInputStream(buffer);
            
            newData = (Data) in.readObject();
            
            System.out.println("after reading newData");
            for (int i = 0; i < 4; i++) {
                System.out.print(newData.subjects[0].semesters[i].mark);
            }
            
            in.close();
            
            buffer.close();
            fileIn.close();
            fLogger.log(Level.FINE, "Reading data from \"{0}\"", file.getPath());
            
                    return newData;

    }
    private static final Logger fLogger =
            Logger.getLogger(Data.class.getPackage().getName());
}
