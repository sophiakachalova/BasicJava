package edu.ntu.pzks.lr4.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import edu.ntu.pzks.lr4.model.Human;
import edu.ntu.pzks.lr4.model.Sex;
import edu.ntu.pzks.lr4.model.University;
import edu.ntu.pzks.lr4.utils.JsonManager;
import java.io.IOException;
import edu.ntu.pzks.lr4.model.Faculty;
import java.util.Collections;
import java.util.List;


public class UniversityJsonTest {
    @Test
    public void testJsonSerialization() throws IOException {
        // Create an empty list of Faculty (or add some Faculties if needed)
        List<Faculty> faculties = Collections.emptyList();

        // Create University with the correct constructor
        University oldUniversity = new University("Test University",
                new Human("John", "Doe", "Middle", Sex.MALE),
                faculties);

        JsonManager.saveToFile("university.json", oldUniversity);
        University newUniversity = JsonManager.loadFromFile("university.json", University.class);

        assertEquals(oldUniversity, newUniversity);
    }
}

