package edu.ntu.pzks.lr4.controller;

import edu.ntu.pzks.lr4.model.*;

import java.util.Arrays;
import java.util.List;

public class UniversityCreator {
    public static University createUniversity() {
        Human rector = new Human("Іван", "Іванов", "Іванович", Sex.MALE);

        // Створюємо факультети
        Human dean1 = new Human("Петро", "Петров", "Петрович", Sex.MALE);
        Human dean2 = new Human("Марія", "Марченко", "Іванівна", Sex.FEMALE);
        Faculty faculty1 = new Faculty("Факультет комп'ютерних наук");
        Faculty faculty2 = new Faculty("Факультет електроніки");

        List<Faculty> faculties = Arrays.asList(faculty1, faculty2);

        return new University("Національний Технічний Університет", rector, faculties);
    }
}


