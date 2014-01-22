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

    public FileInputOutput(Data data) {
        this.data = data;
    }

    public void saveToDisk() {
        try (
                OutputStream file = new FileOutputStream("AbiRechnerData.ser");
                OutputStream buffer = new BufferedOutputStream(file);
                ObjectOutput output = new ObjectOutputStream(buffer);) {
            output.writeObject(data);
        } catch (IOException ex) {
            fLogger.log(Level.SEVERE, "Cannot perform output.", ex);
        }
    }

    public void readFromDisk() {
        try (
                InputStream file = new FileInputStream("AbiRechnerData.ser");
                InputStream buffer = new BufferedInputStream(file);
                ObjectInput input = new ObjectInputStream(buffer);) {
            data = (Data) input.readObject();
        } catch (ClassNotFoundException ex) {
            fLogger.log(Level.SEVERE, "Cannot perform input. Class not found.", ex);
        } catch (IOException ex) {
            fLogger.log(Level.SEVERE, "Cannot perform input.", ex);
        }
    }
    private static final Logger fLogger =
            Logger.getLogger(Data.class.getPackage().getName());
}
