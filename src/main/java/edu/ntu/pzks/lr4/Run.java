package edu.ntu.pzks.lr4;

import edu.ntu.pzks.lr4.controller.UniversityCreator;
import edu.ntu.pzks.lr4.model.University;


public class Run {
    public static void main(String[] args) {
        University university = UniversityCreator.createUniversity();
        System.out.println("Університет створено: " + university.getName());
    }
}
