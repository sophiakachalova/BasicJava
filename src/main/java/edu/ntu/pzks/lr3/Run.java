package edu.ntu.pzks.lr3;

import edu.ntu.pzks.lr3.controller.UniversityCreator;
import edu.ntu.pzks.lr3.model.University;

public class Run {
    public static void main(String[] args) {
        University university = UniversityCreator.createUniversity();
        System.out.println("Університет створено: " + university.getName());
    }
}
