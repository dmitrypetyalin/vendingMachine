package com.petsoft;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author PetSoft
 * @date 11.05.2024 18:03
 */
public class Util {
    private static final Logger LOG = LoggerFactory.getLogger(Util.class);
    private static final String fileSeparator = File.separator;
    private static final String path = "C:" + fileSeparator + "Users" + fileSeparator + "dmitr" + fileSeparator + "IdeaProjects"
            + fileSeparator + "vendingMachine" + fileSeparator + "src" + fileSeparator + "main" + fileSeparator + "java" + fileSeparator + "log" + fileSeparator + "log.txt";

    public static File createFile(String fileName) {
        File file = null;
        try {
            file = new File(fileName);
            if (!file.exists()) {
                Files.createFile(Path.of(fileName));
            }
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
        }
        return file;
    }

    static void writeFile(File file, String str) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(str + "\n");
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
        }
    }

    public static String getPath() {
        return path;
    }
}
