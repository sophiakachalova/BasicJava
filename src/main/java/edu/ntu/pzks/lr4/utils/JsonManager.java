package edu.ntu.pzks.lr4.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void saveToFile(String filename, Object object) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(object, writer);
        }
    }

    public static <T> T loadFromFile(String filename, Class<T> clazz) throws IOException {
        try (FileReader reader = new FileReader(filename)) {
            return gson.fromJson(reader, clazz);
        }
    }
}

