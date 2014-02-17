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
public class FileInputOutput {

    Data data;
    Data dataNew;

    public FileInputOutput(Data data) {
        this.data = data;
    }

    /*
     * @source http://www.tutorialspoint.com/java/java_serialization.htm
     */
    
    public void saveToDisk() {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("userinput.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(data);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in userinput.ser");
        } catch (IOException e) {
            fLogger.log(Level.SEVERE, "Cannot perform output.", e);
        }
    }

    public void readFromDisk() {
        try {
            FileInputStream fileIn = new FileInputStream("userinput.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            dataNew = (Data) in.readObject();
            data = dataNew;
            in.close();
            fileIn.close();
        } catch (IOException e) {
            fLogger.log(Level.SEVERE, "Cannot perform input.", e);
        } catch (ClassNotFoundException e) {
            fLogger.log(Level.SEVERE, "Cannot perform output. Class not found.", e);
        }
    }
    private static final Logger fLogger =
            Logger.getLogger(Data.class.getPackage().getName());
}
