package za.ac.cput.util;

import java.util.UUID;

public class Helper {
    public static boolean isNullorEmpty(String s) {
        if (s == null || s.isEmpty())
            return true;
        else
            return false;
    }

    public static String generateID() {
        return UUID.randomUUID().toString();
    }
}
