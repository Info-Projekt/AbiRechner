/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.dsmailand.abirechner.data;

import it.dsmailand.abirechner.subjects.Semester;
import it.dsmailand.abirechner.subjects.Subject;
import static it.dsmailand.abirechner.subjects.SubjectNumber.*;

/**
 * 
 * TODO: getResults (with points, mandatory hjs, half-m hjs, filled hjs)
 * TODO: check if stuff is legit
 * @author galurowa
 */
public class Optimizer {
    Data myData;
    Subject[] wESubjects;
    Subject oESubject;
    Subject[] natScSubjects;
    Subject[] fLangSubjects;
    int aScore = 0;
    int cScore = 0;
    int bScore = 0;
    
    public Optimizer(Data myData){
        this.myData = myData;
    }
    
    public void optimize(){
        myData.resetUsedStates();
        wESubjects = OptSearcher.findWESubjects(myData);
        oESubject = OptSearcher.findOESubject(myData);
        natScSubjects = OptSearcher.findNatScSubjects(myData);
        fLangSubjects = OptSearcher.findFLangSubjects(myData);
        createAScore();
        createCScore();
        // oSector2 has to be called AFTER oGeschichte
        // oFLangAndNatSc has to be called AFTER oFLangOrNatSc
        optimizeMathe();
        optimizeGeschichte();
        optimizeKunstMusik();
        optimizeSector2();
        optimizeFLangOrNatSc(true); // optimizes NatScSubjects
        optimizeFLangOrNatSc(false); // optimizes FLangSubjects
        optimizeFLangAndNatSc();
        fillUp();
        myData.setFinalPoints(aScore, bScore, cScore);
    }
                    
    private void createAScore(){
        //A: (12.1, 12.2, 13.1 of all wESubjects) * 2
        for(Subject thisWESubject:wESubjects){
            for(int hj=0; hj<3; hj++){
                aScore += thisWESubject.semesters[hj].mark;
                thisWESubject.semesters[hj].usedState = Semester.UsedState.mandatory;
            }
        }
        aScore = 2 * aScore;
    }
    
    private void createCScore(){
        //C: (13.2 + 4*examScore) of all wESubjects and oESubject
        //13.2
        for(Subject thisWESubject:wESubjects){
            cScore += thisWESubject.semesters[3].mark;
            thisWESubject.semesters[3].usedState = Semester.UsedState.mandatory;
        }
        cScore += oESubject.semesters[3].mark;
        oESubject.semesters[3].usedState = Semester.UsedState.mandatory;
        
        //examScore
        for(Subject thisWESubject:wESubjects){
            cScore += 4 * thisWESubject.abinote;
        }
        cScore += 4 * oESubject.abinote;
    }
    
    private void optimizeMathe(){
        //Mathe: 4 hjs mandatory
        if(myData.subjects[MATHE].writtenExamSubject==false){
            int hjsToAdd;
            if(myData.subjects[MATHE].oralExamSubject==true){
                hjsToAdd = 3; //since 13.2 is already in C
            } else {hjsToAdd = 4;}
            
            for(int hj=0; hj<hjsToAdd; hj++){
                bScore += myData.subjects[MATHE].semesters[hj].mark;
                myData.subjects[MATHE].semesters[hj].usedState = Semester.UsedState.mandLegible;
            }
        }
    }
    
    private void optimizeGeschichte(){
        // Geschichte: 2 hjs mandatory
        // If wESubect, quota already filled
        if(myData.subjects[GESCHICHTE].writtenExamSubject==false){
            int hjsToAdd;
            Semester bestSemester;
            if(myData.subjects[GESCHICHTE].oralExamSubject==true){
                hjsToAdd = 1; //since 13.2 is already in C
            } else {hjsToAdd = 2;}
            
            for (int i=0; i<hjsToAdd; i++){
                bestSemester = OptSearcher.findBestSubjectSemester(myData.subjects[GESCHICHTE]);
            bScore += bestSemester.mark;
            bestSemester.usedState = Semester.UsedState.mandLegible;
            }
        }
    }
    
    private void optimizeKunstMusik(){
        // Kunst/Musik: 3 hjs mandatory
        int hjsToAdd;
        Semester bestSemester;
        if(myData.subjects[6].oralExamSubject==true){
            hjsToAdd = 2; //since 13.2 is already in C
        } else {hjsToAdd = 3;}

        for (int i=0; i<hjsToAdd; i++){
            bestSemester = OptSearcher.findBestSubjectSemester(myData.subjects[KUNST_MUSIK]);
            bScore += bestSemester.mark;
            bestSemester.usedState = Semester.UsedState.mandLegible;
        }
    }
    
    private void optimizeSector2(){
        // Sector 2: 2 more hjs out of GE, FI, POWI, RE/ET
        // TODO (maybe): catch Exception (shouldn't actually be possible)
        if(myData.subjects[3].writtenExamSubject) return; // Hjs already filled
        Subject[] sec2Subjects = new Subject[]{myData.subjects[GESCHICHTE],myData.subjects[FILOSOFIA],myData.subjects[PO_WI],myData.subjects[RELIGION_ETHIK]};
        int hjsToAdd = 2; //default
        for(int i=1; i<4; i++){
            if (myData.subjects[i].oralExamSubject) hjsToAdd = 1; //13.2 already in C
        }
        for(int i=0; i<hjsToAdd; i++){
            Subject bestSubject = OptSearcher.findSubjectOfBestHj(myData, sec2Subjects);
            Semester bestSemester = OptSearcher.findBestSubjectSemester(bestSubject);
            bScore += bestSemester.mark;
            bestSemester.usedState = Semester.UsedState.mandLegible;
        }
    }
    
    /**
     * Please review
     * @param natSc 
     */
    private void optimizeFLangOrNatSc(boolean natSc){
        // ForeignLanguages: 4 hjs mandatory
        // NaturalSciences: 4 hjs mandatory
        // Process is identical
        Subject[] subjectArray;

        if(natSc){subjectArray = natScSubjects;
        } else{subjectArray = fLangSubjects;}

        int hjsToAdd = 4; // 4 is default
        for(Subject thisSubject:subjectArray){
            if(thisSubject.writtenExamSubject){
                hjsToAdd = 0; // A and C already have 4hjs
                break;
            }
            if(thisSubject.oralExamSubject){
                hjsToAdd = 3; // C already has 1 hj
            }
        }

        for(int i=0; i<hjsToAdd; i++){
            Subject bestSubject = OptSearcher.findSubjectOfBestHj(myData, subjectArray);
            Semester bestSemester = OptSearcher.findBestSubjectSemester(bestSubject);
            bScore += bestSemester.mark;
            bestSemester.usedState = Semester.UsedState.mandLegible;
        }
        
    }
    
    private void optimizeFLangAndNatSc(){
        // FLang and NatSc together: 14
        // Already have at least 8 from step before
        int hjsRemaining; 
        final int HJS_TO_ADD= 14;
        int fLangAlreadyUsedHjs = 0;
        int natScAlreadyUsedHjs = 0;
        
        // wESubject means 4 hjs already filled
        // oESubject means 1 hj already filled
        for(Subject thisSubject: fLangSubjects){
            if (thisSubject.writtenExamSubject){
                fLangAlreadyUsedHjs += 4;
            } else if (thisSubject==oESubject) fLangAlreadyUsedHjs ++;
        }
        
        for(Subject thisSubject: natScSubjects){
            if (thisSubject.writtenExamSubject){
                natScAlreadyUsedHjs += 4;
            } else if (thisSubject==oESubject) natScAlreadyUsedHjs ++;
        }
        
        // At least 4 FLangHjs and 4 NatScHjs already filled in oFLangOrNatSc
        if(fLangAlreadyUsedHjs<4) fLangAlreadyUsedHjs = 4;
        if(natScAlreadyUsedHjs<4) natScAlreadyUsedHjs = 4;
        
        hjsRemaining = HJS_TO_ADD - fLangAlreadyUsedHjs - natScAlreadyUsedHjs;
        
        // Combines NatSc and FLang SubjectNo-arrays into one
        Subject[] natScAndFLangSubjects = new Subject[natScSubjects.length + fLangSubjects.length];
        System.arraycopy(natScSubjects, 0, natScAndFLangSubjects, 0, natScSubjects.length);
        System.arraycopy(fLangSubjects, 0, natScAndFLangSubjects, natScSubjects.length, fLangSubjects.length);
        
        for(int i=0; i<hjsRemaining; i++){
            Subject bestSubject = OptSearcher.findSubjectOfBestHj(myData, natScAndFLangSubjects);
            Semester bestSemester = OptSearcher.findBestSubjectSemester(bestSubject);
            bScore += bestSemester.mark;
            bestSemester.usedState = Semester.UsedState.mandLegible;
        }
    }
    
    private void fillUp(){
        int hjsToAdd = 35 - OptSearcher.countAlreadyUsed(myData); //ought to be >= 29
        for(int i=0; i<hjsToAdd; i++){
            Subject bestSubject = OptSearcher.findSubjectOfBestHj(myData, myData.subjects);
            Semester bestSemester = OptSearcher.findBestSubjectSemester(bestSubject);
            bScore += bestSemester.mark;
            bestSemester.usedState = Semester.UsedState.eligible;
        }
    }

}