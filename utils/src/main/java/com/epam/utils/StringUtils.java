package com.epam.utils;

import static org.apache.commons.lang3.StringUtils.*;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        remove(str,'.');
        return isNumeric(str) && Double.parseDouble(str) > 0;
    }
}
