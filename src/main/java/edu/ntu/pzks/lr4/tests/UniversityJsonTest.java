package edu.ntu.pzks.lr4.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import edu.ntu.pzks.lr4.model.Human;
import edu.ntu.pzks.lr4.model.Sex;
import edu.ntu.pzks.lr4.model.University;
import edu.ntu.pzks.lr4.utils.JsonManager;
import java.io.IOException;
import edu.ntu.pzks.lr4.model.Faculty;
import java.util.Arrays;
import java.util.List;

public class UniversityJsonTest {
    @Test
    public void testJsonSerialization() throws IOException {
        List<Faculty> faculties = Arrays.asList(
                new Faculty("Computer Science"),
                new Faculty("Mathematics")
        );

        University oldUniversity = new University("Test University",
                new Human("John", "Doe", "Jack", Sex.MALE),
                faculties);

        JsonManager.saveToFile("university.json", oldUniversity);
        University newUniversity = JsonManager.loadFromFile("university.json", University.class);

        assertEquals(oldUniversity, newUniversity, "Об'єкти університету повинні бути однаковими!");
    }
}


