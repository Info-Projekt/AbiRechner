/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dsmailand.abirechner;

import it.dsmailand.abirechner.subjects.Subject;
import java.io.*;

/**
 *
 * @author PortableUser
 */
public class Data implements Serializable {
    Subject[] subjects = new Subject[12];
    
    
    public Data(){
        //initialize subjects
        for(int i = 0; i<subjects.length; i++)   {
            subjects[i] = new Subject(i);
        }
    }

    public void save() {
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:/test.ser");
            oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
