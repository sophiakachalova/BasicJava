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

        List<Faculty> faculties = Collections.emptyList();


        University oldUniversity = new University("University",
                new Human("John", "Cruz", "Jack", Sex.MALE),
                faculties);

        JsonManager.saveToFile("university.json", oldUniversity);
        University newUniversity = JsonManager.loadFromFile("university.json", University.class);

        assertEquals(oldUniversity, newUniversity);
    }
}



