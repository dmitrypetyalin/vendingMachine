package com.petsoft;

import java.io.File;

import static com.petsoft.Util.*;

/**
 * @author PetSoft
 * @date 11.05.2024 17:50
 */
public class Logger {
    public static void writeLog(String toyName) {
        writeFile(createFile(getPath()), toyName);
    }
}
