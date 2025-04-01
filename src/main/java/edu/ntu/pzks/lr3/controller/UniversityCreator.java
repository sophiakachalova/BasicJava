package edu.ntu.pzks.lr3.controller;

import edu.ntu.pzks.lr3.model.Human;
import edu.ntu.pzks.lr3.model.Sex;
import edu.ntu.pzks.lr3.model.University;

public class UniversityCreator {
    public static University createUniversity() {
        Human rector = new Human("Іван", "Живчик", "Вікторович", Sex.MALE);
        return new University("Національний Технічний Університет", rector);
    }
}

