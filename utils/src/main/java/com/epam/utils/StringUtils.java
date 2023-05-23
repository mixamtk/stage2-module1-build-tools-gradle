package com.epam.utils;

import static org.apache.commons.lang3.StringUtils.*;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            double number = Double.parseDouble(str);
            return number > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
