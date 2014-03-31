/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.dsmailand.abirechner.subjects;

import java.io.Serializable;

/**
 *
 * @author Carl
 */
public class Semester implements Serializable{
    public int mark;
    public transient UsedState usedState;
    public static enum UsedState{mandatory, eligible, mandLegible, none}
}
